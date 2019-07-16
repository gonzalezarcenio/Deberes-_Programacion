import java.util.Scanner;

/**
        FECHA MARTES 16 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA : GRADOS CELSIUS S FARENHEIT
 	MATERIA : PROGRAMACION VISUAL
 	NIVEL : CUARTO DE SISTEMAS NOCTURNO
 
 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
           float gradosC,valor;
       
        
       
        
        System.out.println("Diguite grados celsius : ");
        gradosC=entrada.nextFloat();
        
       Operaciones obj1= new Operaciones(gradosC); 
        
        valor=obj1.calculo(gradosC);
        obj1.imprimirC(valor);
        
        
         System.out.println("Diguite grados celsius : ");
        gradosC=entrada.nextFloat();
        
       Operaciones obj2= new Operaciones(gradosC); 
        
        valor=obj2.calculo(gradosC);
        obj2.imprimirC(valor);
        
        
    }
    
}
