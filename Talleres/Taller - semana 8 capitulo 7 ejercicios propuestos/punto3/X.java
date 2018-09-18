package punto3;
import java.io.*;
 
public class X implements Serializable{
    private String nombre;
    private String apellido;
 
    public X(String nombre, String apellido){
	this.nombre = nombre;
	this.apellido = apellido;
    }
 
    public String getNombre(){
	return this.nombre;
    }
 
    public String getApellido(){
	return this.apellido;
    }
 
    public void setNombre(String n){
	this.nombre = n;
    }
 
    public void setApellido(String a){
	this.apellido = a;
    }
 
    public String toString(){
	return this.getApellido() +" "+ this.getNombre();
    }
}