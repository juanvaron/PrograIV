package proyecto2;

import java.util.LinkedList;

public class Cola implements ColeccionInterface{
    private LinkedList lista;

    public Cola(){
        lista = new LinkedList();
    }

    @Override
    public boolean estaVacia(){
        return lista.isEmpty();
    }

    @Override
    public boolean añadir(Object o){
        lista.addLast(o);
        return true;
    }

    @Override
    public Object primero(){
        return lista.getFirst();
    }

    @Override
    public Object extraer(){
        return lista.removeFirst();
    }
}