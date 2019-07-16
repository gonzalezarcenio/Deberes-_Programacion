import java.util.Scanner;

/**
        FECHA MARTES 16 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA : MOSTRAR LOS MESES DEL AÑO, PIDIÉNDOLE AL USUARIO UN NÚMERO ENTRE (1-12), 
        Y MOSTRAR EL MES AL QUE CORRESPONDE

 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int numero;
        
        System.out.println("Diguite un numero  1-12: ");
        numero= entrada.nextInt();
        
        Operaciones obj1 =  new Operaciones(numero);
        obj1.enero(numero);
        obj1.febrero(numero);
        obj1.marzo(numero);
        obj1.abril(numero);
        obj1.mayo(numero);
        obj1.junio(numero);
        obj1.julio(numero);
        obj1.agosto(numero);
        obj1.octubre(numero);
        obj1.noviembre(numero);
        obj1.diciembre(numero);
        obj1.error(numero);
        
        
        System.out.println("Diguite un numero : ");
        numero= entrada.nextInt();
        
        Operaciones obj2 =  new Operaciones(numero);
        obj2.enero(numero);
        obj2.febrero(numero);
        obj2.marzo(numero);
        obj2.abril(numero);
        obj2.mayo(numero);
        obj2.junio(numero);
        obj2.julio(numero);
        obj2.agosto(numero);
        obj2.octubre(numero);
        obj2.noviembre(numero);
        obj2.diciembre(numero);
        obj2.error(numero);
    }
}
