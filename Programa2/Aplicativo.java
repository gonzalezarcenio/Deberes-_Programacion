import java.util.Scanner;

/**
        FECHA MARTES 16 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA : SUMA DE N NUMEROS
 	MATERIA : PROGRAMACION VISUAL
 	NIVEL : CUARTO DE SISTEMAS NOCTURNO
 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int numero,valor;
       
        System.out.println("Diguite un numero : ");
        numero=entrada.nextInt();
        
         Operaciones obj1=new Operaciones(numero);
        
        valor=obj1.sumarV(numero);
       obj1.imprimir(valor);
      
        System.out.println("Diguite un numero : ");
        numero=entrada.nextInt();
        
         Operaciones obj2=new Operaciones(numero);
        
        valor=obj2.sumarV(numero);
       obj2.imprimir(valor);
       
       
        System.out.println("Diguite un numero : ");
        numero=entrada.nextInt();
        
         Operaciones obj3=new Operaciones(numero);
        
        valor=obj3.sumarV(numero);
       obj3.imprimir(valor);
       
    }
    
}
