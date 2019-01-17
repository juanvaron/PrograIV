package hola1;

interface Funcion<T extends Comparable<T>> {
    void funcion(T dato, Object parametros);
}
 
class Contacto implements Comparable<Contacto> {
 
    private String telefono;
    private String nombre;
    private String correo;
    private String direccion;
    private String alias;
             
    @Override
    public boolean equals(Object contacto) {
        return this==contacto || (contacto instanceof Contacto && telefono.equals(((Contacto)contacto).telefono));
    }
 
    @Override
    public int compareTo(Contacto contacto) {
        return telefono.compareTo(contacto.telefono);
    }
 
    @Override
    public String toString() {
        return
            "nombre        : " + nombre + "\n" +
            "telefono      : " + telefono + "\n" +
            "correo        : " + correo + "\n" +
            "direccion     : " + direccion + "\n" +
            "alias         : " + alias + "\n";
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getTelefono() {
        return telefono;
    }
 
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
 
    public String getCorreo() {
        return correo;
    }
 
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getDireccion() {
        return direccion;
    }
 
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getAlias() {
        return alias;
    }
 
    public void setAlias(String alias) {
        this.alias = alias;
    }
    
}

