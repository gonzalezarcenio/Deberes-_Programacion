import java.util.Scanner;

/**
        FECHA MARTES 16 DE JULIO DEL 2019
 	INSTITUTO TECNOL�ICO SUPERIOR RUMI�AHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA :ESCRIBE UN PROGRAMA QUE LEA DE LA ENTRADA EST�NDAR TRES N�MEROS. 
        DESPU�S DEBE LEER UN CUARTO N�MERO E INDICAR 
        SI EL N�MERO COINCIDE CON ALGUNO DE LOS INTRODUCIDOS CON ANTERIORIDAD
 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n1,n2,n3,n4;
        
        System.out.println("Diguite un numero : ");
        n1=entrada.nextInt();
        System.out.println("Diguite un numero : ");
        n2=entrada.nextInt();
        System.out.println("Diguite un numero : ");
        n3=entrada.nextInt();
        System.out.println("Diguite un numero : ");
        n4=entrada.nextInt();
        
           Operaciones obj1 = new Operaciones(n1, n2, n3, n4);
           
           obj1.procesoN(n1, n2, n3, n4);
        
           
            System.out.println("Diguite un numero : ");
        n1=entrada.nextInt();
        System.out.println("Diguite un numero : ");
        n2=entrada.nextInt();
        System.out.println("Diguite un numero : ");
        n3=entrada.nextInt();
        System.out.println("Diguite un numero : ");
        n4=entrada.nextInt();
        
           Operaciones obj2 = new Operaciones(n1, n2, n3, n4);
           
           obj2.procesoN(n1, n2, n3, n4);
           
    }
     
 
    
}
