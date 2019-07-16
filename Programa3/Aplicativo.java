import java.util.Scanner;

/**
        FECHA MARTES 16 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA :  CALCULAR LA CANTIDAD DE SEGUNDOS que QUE ESTAN INCLUIDOS EN EL NUMERO DE HORAS,
        MINUTOS Y SEGUNDOS
 	MATERIA : PROGRAMACION VISUAL
 	NIVEL : CUARTO DE SISTEMAS NOCTURNO
 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int horas,minutos,segundos,tiempo1,tiempo2,tiempo3,total;
       
        
        System.out.println("Diguite cantidad de horas :");
        horas=entrada.nextInt();
        System.out.println("Diguite cantidad de minutos :");
        minutos=entrada.nextInt();
        System.out.println("Diguite cantidad de segundos :");
        segundos=entrada.nextInt();
       
        
        Operaciones obj1= new Operaciones(horas, minutos, segundos);
        
        
        tiempo1=obj1.calcularH(horas);
        tiempo2=obj1.calcularM(minutos);
        tiempo3=obj1.calcularS(segundos);
        total=obj1.totalOp(tiempo1, tiempo2, tiempo3);
        obj1.imprimirV(total);
        
        
        System.out.println("Diguite cantidad de horas :");
        horas=entrada.nextInt();
        System.out.println("Diguite cantidad de minutos :");
        minutos=entrada.nextInt();
        System.out.println("Diguite cantidad de segundos :");
        segundos=entrada.nextInt();
       
        
        Operaciones obj2= new Operaciones(horas, minutos, segundos);
        
        
        tiempo1=obj2.calcularH(horas);
        tiempo2=obj2.calcularM(minutos);
        tiempo3=obj2.calcularS(segundos);
        total=obj2.totalOp(tiempo1, tiempo2, tiempo3);
        obj2.imprimirV(total);
        
        
        System.out.println("Diguite cantidad de horas :");
        horas=entrada.nextInt();
        System.out.println("Diguite cantidad de minutos :");
        minutos=entrada.nextInt();
        System.out.println("Diguite cantidad de segundos :");
        segundos=entrada.nextInt();
       
        
        Operaciones obj3= new Operaciones(horas, minutos, segundos);
        
        
        tiempo1=obj3.calcularH(horas);
        tiempo2=obj3.calcularM(minutos);
        tiempo3=obj3.calcularS(segundos);
        total=obj3.totalOp(tiempo1, tiempo2, tiempo3);
        obj3.imprimirV(total);
    }
    
}
