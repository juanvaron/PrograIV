package proyecto1;

public class ListaMultimedia{

    private Multimedia[] lista;
    private int c;

    public ListaMultimedia(int max){
        lista = new Multimedia[max];
        c = 0;
    }

    public int size(){
        return c;
    }

    private boolean llena(){
        return c == lista.length;
    }

    public boolean add(Multimedia m){
        if(llena()){
            return false;
        }else{
            lista[c] = m;
            c=c+1;
            return true;
        }
    }

    public Multimedia get(int p){
        if(p = c){
            throw new IndexOutOfBoundsException();
        }
        return lista[p];
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < c; i++){
            s += lista[i].toString() + "\n";
        }
        return s;
    }
}