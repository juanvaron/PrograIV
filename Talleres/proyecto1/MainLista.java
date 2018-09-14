package proyecto1;

public class MainLista{

    public static void main(String[] args){

        ListaMultimedia lista = new ListaMultimedia(10);
        Pelicula pelicula;
        int p;
        lista.add(new Pelicula("Titanic", "James Cameron", Formato.dvd, 195, "Leonardo DiCaprio", "Kate Winslet"));
        lista.add(new Pelicula("Avatar", "James Cameron", Formato.dvd, 162, "Sam Worthington" , "Zoe Saldaña"));
        lista.add(new Pelicula("My name is Khan", "Karan Johar", Formato.mov, 165, "Shahrukh Khan", "Kajol"));

        System.out.println(lista.toString());
    }
}