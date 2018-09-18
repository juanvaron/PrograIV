package punto3;

public class Main{
    public static void main(String[] args){
	Serializador ser = new Serializador();
 	X 1 = new X("Juan","Camilo");
	X 2 = new X("Jairo","Flores");
 
	ser.escribirArchivo(1);
	ser.escribirArchivo(2);
 
	X x = (X) ser.leerArchivo("archivo.txt");
	System.out.println(x.getNombre());
	System.out.println(x.getApellido());
    }
}

