package proyecto1;

public class Pelicula extends Multimedia{
    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String titulo, String autor, Formato formato, double duracion, String actor, String actriz){
        super(titulo, autor, formato, duracion);
        if(actor == null && actriz == null){
            throw new IllegalArgumentException("No pueden ser vacios ambos");
        }
        actorPrincipal = actor;
        actrizPrincipal = actriz;
    }

    public String getActorPrincipal(){
        return actorPrincipal;
    }
    public String getActrizPrincipal(){
        return actrizPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal){
        this.actorPrincipal = actorPrincipal;
    }
    public void setActrizPrincipal(String actrizPrincipal){
        this.actrizPrincipal = actrizPrincipal;
    }

    public String toString(){
        String s = " | Protagonizada por: ";
        if(actorPrincipal != null){
            s += actorPrincipal;
            if (actrizPrincipal != null){
                s += " y " + actrizPrincipal;
            }
        }else{
            assert actrizPrincipal != null;
            s += actrizPrincipal;
        }
        return super.toString() + s;
    }
}