package hola1;

import java.io.*;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main{
 
    public static Scanner teclado = new Scanner(System.in);
    public static PrintStream out = System.out;
 
    public static void pausar(String mensage) {
        out.print(mensage + "\nPresione <ENTER> para continuar . . . ");
        teclado.nextLine();
        out.println();
    }
 
    public static String leer_cadena(String mensaje) {
        out.print(mensaje + ": ");
        return teclado.nextLine();
    }
 
    public static int leer_entero(String mensaje) {
        try {
            return Integer.parseInt(leer_cadena(mensaje));
        } catch (NumberFormatException e) {
            out.print("Numero incorrecto.");
            return leer_entero(mensaje);
        }
    }
 
    public static String ruta = "C:\\Users\\Juan\\Desktop\\archivosos.txt";
 
    public static void main(String[] args) {
 
        Funcion<Contacto> imprimir = new Funcion<Contacto>() {
            @Override
            public void funcion(Contacto contacto, Object parametros) {
                out.println(contacto);
                int[] contador = (int[]) parametros;
                contador[0]++;
            }
        };

        Funcion<Contacto> imprimirEnArchivo = new Funcion<Contacto>() {
            @Override
            public void funcion(Contacto contacto, Object parametros) {
                PrintStream archivo = (PrintStream) parametros;
                archivo.print(contacto.getNombre() + "; ");
                archivo.print(contacto.getTelefono() + "; ");
                archivo.print(contacto.getCorreo() + "; ");
                archivo.print(contacto.getDireccion() + "; ");
                archivo.print(contacto.getAlias() + "\r\n");
            }
        };
        if(!System.getProperties().get("os.name").equals("Linux") && System.console()!=null)
            try {
                out = new PrintStream(System.out, true, "CP850");
                teclado = new Scanner(System.in, "CP850");
            } catch (UnsupportedEncodingException e) {}
        Vector<Contacto> vector = new Vector<Contacto>();
        int i, n;
        Contacto dato = null, contacto;
        int[] contador = {0};
        int opcion, subopcion;
        String[] campos;
        try {
            Scanner entrada = new Scanner(new FileReader("C:\\Users\\Juan\\Desktop\\archivos.txt"));
            while (entrada.hasNextLine()) {
                campos = entrada.nextLine().split("; ");
                contacto = new Contacto();
                contacto.setNombre(campos[0]);
                contacto.setTelefono(campos[1]);
                contacto.setCorreo(campos[2]);
                contacto.setDireccion(campos[3]);
                contacto.setAlias(campos[4]);
                vector.add(contacto);
            }
            entrada.close();
        } catch (FileNotFoundException e) {}
        contacto = new Contacto();
        
        do {
            out.println("MENU");
            out.println("1. Ingresar contacto");
            out.println("2. Consultar contactos");
            out.println("3. Modificar contacto");
            out.println("4. Eliminar contacto");
            out.println("5. Importar contactos");
            out.println("6. Salir");
            do {
                opcion = leer_entero ("Seleccione una opcion");
                if(opcion<1 || opcion>6)
                    out.println("Opcion invalida");
            } while (opcion<1 || opcion>6);
            out.println();
            if (vector.isEmpty() && opcion!=1 && opcion!=6) {
                pausar("No hay contactos\n");
                continue;
            }
            if (opcion<5) {
                contacto.setTelefono(leer_cadena ("Ingrese el telefono del contacto"));
                i = vector.indexOf(contacto);
                dato = i<0 ? null : vector.get(i);
                if (dato!=null) {
                    out.println();
                    imprimir.funcion(dato, contador);
                }
            }
            if (opcion==1 && dato!=null)
                out.println("El contacto ya existe");
            else if (opcion>=2 && opcion<=4 && dato==null)
                out.println("\nContacto no encontrado.");
            else switch (opcion) {
            case 1:
                contacto.setNombre(leer_cadena ("Ingrese el nombre"));
                contacto.setCorreo(leer_cadena ("Ingrese el correo"));
                contacto.setDireccion(leer_cadena ("Ingrese la direccion"));
                contacto.setAlias(leer_cadena ("Ingrese el alias"));
                vector.add(contacto);
                contacto = new Contacto();
                out.println("\nContacto agregado");
                break;
            case 3:
                out.println("Modificacion");
                out.println("1. nombre");
                out.println("2. telefono");
                out.println("3. correo");
                out.println("4. direccion");
                out.println("5. alias");
                do {
                    subopcion = leer_entero ("Seleccione campo a modificar");
                    if (subopcion<1 || subopcion>5)
                        out.println("Opcion invalida");
                } while (subopcion<1 || subopcion>5);
                switch (subopcion) {
                    case 1:
                        dato.setNombre(leer_cadena ("Ingrese el nuevo nombre"));
                        break;
                    case 2:
                        dato.setTelefono(leer_cadena ("Ingrese el nuevo telefono"));
                        break;
                    case 3:
                        dato.setCorreo(leer_cadena ("Ingrese el nuevo correo"));
                        break;
                    case 4:
                        dato.setDireccion(leer_cadena ("Ingrese la nueva direccion"));
                        break;
                    case 5:
                        dato.setAlias(leer_cadena ("Ingrese el nuevo alias"));
                        break;
                }
                out.println("\nContacto modificado");
                break;
            case 4:
                vector.remove(dato);
                out.println("Contacto borrado");
                break;
            case 5:
                n = vector.size();
                contador[0] = 0;
                for (i=0; i<n; i++)
                    imprimir.funcion(vector.get(i), contador);
                break;
            }
            if (opcion<6 && opcion>=1)
                pausar("");
        } while (opcion!=6);
        try {
            PrintStream salida = new PrintStream(ruta);
            n = vector.size();
            for (i=0; i<n; i++)
                imprimirEnArchivo.funcion(vector.get(i), salida);
            salida.close();
        } catch (FileNotFoundException e) {}
    }
}
