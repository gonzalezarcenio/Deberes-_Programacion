/**
        FECHA MARTES 16 DE JULIO DEL 2019
 	INSTITUTO TECNOL�ICO SUPERIOR RUMI�AHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA :ESCRIBA UN PROGRAMA QUE SOLICITE UNA EDAD (UN ENTERO)
      	E INDIQUE EN LA SALIDA EST�NDAR SI 
      	LA EDAD INTRODUCIDA EST� EN EL RANGO 18-25
        
  *
 */
public class Operaciones {
    private int edad;

    public Operaciones(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public void procesoE(int edad){
        
        if(edad>=18&& edad<=25){
            System.out.println("cumple");
        }
        
        else{
            System.out.println("no cumple");
        }
        
    }
}
