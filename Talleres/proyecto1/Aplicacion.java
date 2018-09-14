package proyecto1;

public class  Aplicacion{

    public static void main(String[] args){
        ListaMultimedia lista = new ListaMultimedia(20);
        Disco disco;
        
        lista.add(new Disco("Un beso y una flor", "Nino Bravo", Formato.avi, 41, Genero.balada));
        lista.add(new Disco("Cielo de tambores", "Grupo Niche", Formato.mp3, 42, Genero.salsa));
        lista.add(new Disco("Titulo de amor", "Diomedes Diaz", Formato.wav, 50, Genero.vallenato));
        System.out.println(lista.toString());
        
        disco = new Disco("Un beso y una flor", "Nino Bravo", null, 0, null);
    }
}