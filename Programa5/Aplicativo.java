/**
 *      FECHA MARTES 16 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA :ESCRIBA UN PROGRAMA QUE SOLICITE UNA EDAD (UN ENTERO)
      	E INDIQUE EN LA SALIDA ESTÁNDAR SI 
      	LA EDAD INTRODUCIDA ESTÁ EN EL RANGO 18-25

 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int edad;
        
        System.out.println("Diguite la edad : ");
        edad=entrada.nextInt();
        
        Operaciones obj1 = new Operaciones(edad);
        obj1.procesoE(edad);
       
      
        System.out.println("Diguite la edad : ");
        edad=entrada.nextInt();
        
        Operaciones obj2 = new Operaciones(edad);
        obj2.procesoE(edad);
       
        
        System.out.println("Diguite la edad : ");
        edad=entrada.nextInt();
        
        Operaciones obj3 = new Operaciones(edad);
        obj3.procesoE(edad);
      
        
    }
    
}
