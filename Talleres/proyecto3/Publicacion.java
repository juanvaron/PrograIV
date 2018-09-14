package proyecto3;

public class Publicacion{
    private String codigo;
    private String titulo;
    private int año;

    public Publicacion(String codigo, String titulo, int año){
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
    }

    public String getCodigo(){
        return codigo;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getAño(){
        return año;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAño(int año){
        this.año = año;
    }

    @Override
    public String toString(){
        return "Codigo: " + codigo + " | Titulo: " + titulo + " | Año de publicacion: " + año ;
    }
}