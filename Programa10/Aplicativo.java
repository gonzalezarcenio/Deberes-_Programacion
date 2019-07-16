import java.util.Scanner;

/**
        FECHA MARTES 16 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒGICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA : RESTA DE 2 NUMEROS 
 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1,n2,resta;
        
        System.out.println("Diguite un numero : ");
        n1=entrada.nextInt();
        System.out.println("Diguite un numero : ");
        n2=entrada.nextInt();
        
        Operaciones obj1 = new Operaciones(n1, n2);
        resta=obj1.calculoR(n1, n2);
        obj1.imprimir(resta);
    }
    
}
