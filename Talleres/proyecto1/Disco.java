package proyecto1;

public class Disco extends Multimedia{
    private Genero genero;

    public Disco(String titulo,String autor,Formato formato,double duracion,Genero ge){
        super(titulo, autor, formato, duracion);
        this.genero = ge;
    }

    public Genero getGenero(){
        return genero;
    }

    public void setGenero(Genero genero){
        this.genero = genero;
    }

    public String toString(){
        return super.toString() + " | Genero: " + genero;
    }
}