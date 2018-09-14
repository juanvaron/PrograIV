package proyecto3;

public class Revista extends Publicacion{
    private int numero;

    public Revista(String codigo, String titulo, int año, int numero){
        super(codigo, titulo, año);
        this.numero = numero;
    }

    @Override
    public String toString(){
        return super.toString() + "\nNumero: " + numero;
    }
}


