import java.util.Scanner;

/**
        FECHA MARTES 16 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒGICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA : INGRESAR DATOS POR TECLADO NOMBRE,APELLIDO,DIRECCION,TELEFONO,Y MOSTRARLOS 
        
 */
public class Aplicativo {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        Scanner lee  = new Scanner(System.in);
        String nombre;
        String apellido;
        String direccion;
        int nTelefono;
        
        System.out.println("diguite el nombre : ");
        nombre=entrada.nextLine();
        System.out.println("Diguite apellido");
        apellido=entrada.nextLine();
        System.out.println("diguite direccion");
        direccion=entrada.nextLine();
        System.out.println("telfono :");
        nTelefono=entrada.nextInt();
        
        Persona obj1 = new Persona(nombre, apellido, direccion, nTelefono);
        
        obj1.imprimirDatos(nombre, apellido, direccion, nTelefono);
        
        System.out.println("");
        
        System.out.println("diguite el nombre : ");
        nombre=lee.nextLine();
        System.out.println("Diguite apellido");
        apellido=lee.nextLine();
        System.out.println("diguite direccion");
        direccion=lee.nextLine();
        System.out.println("telfono :");
        nTelefono=lee.nextInt();
        
        Persona obj2 = new Persona(nombre, apellido, direccion, nTelefono);
        
        obj2.imprimirDatos(nombre, apellido, direccion, nTelefono);
        
        
    }
    
}
