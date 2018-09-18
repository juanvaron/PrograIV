package punto2;
import java.util.Scanner;
import java.io.File;

public class Archivo {
    public void lecturatxt(){
        Scanner archivo = null;
        try{
        archivo = new Scanner(new File("numeros.txt"));
        }
        catch(Exception e){
            System.out.println("Archivo no encontrado");
        }
        int num=0, count=0, cont=0;
        while(archivo.hasNext()){
            num = archivo.nextInt();
            count = count + num;
            cont++;
            System.out.print(num+" ");
        }
        double prom=count/cont;
        System.out.println();
        System.out.print("El promedio es "+prom);
    }
}
