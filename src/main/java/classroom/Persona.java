package classroom;

public class Persona {
	
	final long cedula;
    String nombre;
    static int totalPersonas;
    static long cuentaCedulas = 0;
    
    static {
        totalPersonas = 0;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = generarCedula();
        totalPersonas++;
    }
    
    public Persona() {
        this.nombre = "";
        this.cedula = generarCedula();
        totalPersonas++;
    }
    
    public long generarCedula() {
    	return cuentaCedulas++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
