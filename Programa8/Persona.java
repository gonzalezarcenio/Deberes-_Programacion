/**
        FECHA MARTES 16 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA : INGRESAR DATOS POR TECLADO NOMBRE,APELLIDO,DIRECCION,TELEFONO,Y MOSTRARLOS 
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String direcion;
    private  int nTelefono ;

    public Persona(String nombre, String apellido, String direcion, int nTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direcion = direcion;
        this.nTelefono = nTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public int getnTelefono() {
        return nTelefono;
    }

    public void setnTelefono(int nTelefono) {
        this.nTelefono = nTelefono;
    }
    
    public void imprimirDatos(String nombre,String apellido,String direccion,int nTelefono){
        System.out.println("nombre :"+nombre);
        System.out.println("apellido: "+apellido);
        System.out.println("direccion :"+direccion);
        System.out.println("numero telefonico : "+nTelefono);
        
    }
}

