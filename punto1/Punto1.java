package punto1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Punto1{
    public static void main(String[] args) {
        int a;
        Scanner S = new Scanner(System.in);
        try{
            File archivo = new File("archivo.txt");
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=1; i<3; i++){
                System.out.println("Introduce numero: ");
                a = S.nextInt();

                bw.write("Numero ingresado: "+a);
                bw.newLine();
            }
            bw.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}