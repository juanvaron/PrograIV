package proyecto2;

import java.util.NoSuchElementException;

public class Pila implements ColeccionInterface{

    private Object[] array;
    private int c;

    public Pila(int Maximo){
        array = new Object[Maximo];
        c = 0;
    }

    @Override
    public boolean estaVacia(){
        return c == 0;
    }

    @Override
    public boolean añadir(Object objeto){
        if(c == array.length){
            return false;
        }else{
            array[c] = objeto;
            c=c+1;
            return true;
        }
    }

    @Override
    public Object primero(){
        if(estaVacia()){
            throw new NoSuchElementException();
        }else{
            return array[c - 1];
        }
    }

    public String toString(){
        String s = "";
        for (int i = c - 1; i >= 0; i--){
            s += array[i].toString() + " - ";
        }
        if (!estaVacia()){
            return s.substring(0, s.length() - 1);
        } else {
            return s;
        }
    }
}