import java.util.Scanner;

/**
        FECHA MARTES 16 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒGICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA : MULTIPLICACION DE 2 NUMEROS 
 */
public class Aplicativo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n1,n2,mul;
        
        System.out.println("Diguite un numero : ");
        n1=entrada.nextInt();
        System.out.println("Diguite un numero : ");
        n2=entrada.nextInt();
        
        Operaciones obj1 = new Operaciones(n1, n2);
              
        mul=obj1.calculoM(n1, n2);
        obj1.imprimir(mul);
        
        
         System.out.println("Diguite un numero : ");
        n1=entrada.nextInt();
        System.out.println("Diguite un numero : ");
        n2=entrada.nextInt();
        
        Operaciones obj2 = new Operaciones(n1, n2);
              
        mul=obj2.calculoM(n1, n2);
        obj2.imprimir(mul);
        
        System.out.println("Diguite un numero : ");
        n1=entrada.nextInt();
        System.out.println("Diguite un numero : ");
        n2=entrada.nextInt();
        
        Operaciones obj3 = new Operaciones(n1, n2);
              
        mul=obj3.calculoM(n1, n2);
        obj3.imprimir(mul);
        
        
    }
    
    }
