package punto3;
import java.io.*;
 
public class Serializador{
    private ObjectOutputStream escritorArchivo;
    private ObjectInputStream lectorArchivo;
 
    public void escribirArchivo(Object objeto){
	try{
            escritorArchivo = new ObjectOutputStream(new FileOutputStream("archivo.txt"));
            escritorArchivo.writeObject(objeto);
	}catch(FileNotFoundException fnfex){
            fnfex.printStackTrace();
        }catch(IOException ioex){
            ioex.printStackTrace();
	}
    }
    public Object leerArchivo(String rutaArchivo){
	Object lectura = null;
	try{
            lectorArchivo = new ObjectInputStream(new FileInputStream(rutaArchivo));
            lectura = lectorArchivo.readObject();
        }catch(FileNotFoundException fnfex){
            fnfex.printStackTrace();
        }catch(IOException ioex){
            ioex.printStackTrace();
        }catch(ClassNotFoundException cnfex){
            cnfex.printStackTrace();
	}
        
	return lectura;
    }
}