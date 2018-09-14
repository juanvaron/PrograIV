package proyecto2;

public class PruebaPila{

    public static void rellenar(ColeccionInterface c){
        for (int i = 0; i <= 10; i++){
        c.añadir(i);
        }
    }

    public static void imprimirYVaciar(ColeccionInterface cole){
        while (!cole.estaVacia()){
        System.out.println(cole.extraer());
        }
    }

    public static void main(String[] args){

        Pila pila = new Pila(20);
        
        rellenar(pila);
        System.out.println("La pila: " + pila);
        
        imprimirYVaciar(pila);
        System.out.println("Cambió a: " + pila);
    }
}