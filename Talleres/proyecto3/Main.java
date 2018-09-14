package proyecto3;

public class Main{

    public static int cuentaPrestados(Object[] lista){
        int c = 0;
        for (Object obj : lista){
            if (obj instanceof Prestable && ((Prestable) obj).prestado()){
                c=c+1;
            }
        }
        return c;
    }

    public static int publicacionesAnterioresA(Publicacion[] lista, int año){
        int c = 0;
        for (Publicacion p : lista){
            if (p.getAño() < año){
                c=c+1;
            }
        }
        return c;
    }

    public static void main(String[] args){
        Publicacion[] biblioteca = { 
                new Libro("L0001", "Cien años de soledad", 1967),
                new Libro("L0002", "Don Quijote de la Mancha", 1615),
                new Revista("R0001", "The summit crisis", 2018, 481), 
                new Revista("R0002", "Desafiando a la historia", 1984, 1841) };

        Libro l = (Libro) biblioteca[1]; 
        l.prestar();
        for (Publicacion p : biblioteca){
            System.out.println(p);
        }
     
        System.out.println("Numero de publicaciones antes de 1990: "+publicacionesAnterioresA(biblioteca, 1990));
        System.out.println("Numero de publicaciones prestadas: "+cuentaPrestados(biblioteca));
    }
}