import java.util.Scanner;

/**
        FECHA MARTES 16 DE JULIO DEL 2019
 	INSTITUTO TECNOL�ICO SUPERIOR RUMI�AHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA :UN ALUMNO QUIERE SABER CUAL SERA SU CALIFICACION FINAL EN LA MATERIA DE ALGORITMOS
        SE COMPONE DE LOS SIGUIENTE :

        � 55% DEL PROMEDIO DE SUS 3 CALIFICACIONES .
        � 30% DE LA CALIFICACION DEL EXAMEN FINAL.
        � 15% DE LA CALIFICACION DE UN TRABAJO FINAL.
 	MATERIA : PROGRAMACION VISUAL
 	NIVEL : CUARTO DE SISTEMAS NOCTURNO      
        
 */
public class Aplicativo {
    public static void main(String[] args) {
        float parcial1=0,parcial2=0,parcial3=0,examen=0,trabajo=0,cFinal=0;
        float pParcial=0,promedioE=0,promedioT=0;
        Scanner entrada= new Scanner (System.in);
        
         
        
        System.out.println("Diguite nota del primer parcial :");
        parcial1=entrada.nextFloat();
        System.out.println("Diguite nota del segundo parcial :");
        parcial2=entrada.nextFloat();
        System.out.println("Diguite nota del tercer parcial :");
        parcial3=entrada.nextFloat();
        System.out.println("Diguite nota del examen f :");
        examen=entrada.nextFloat();
        System.out.println("Diguite nota del trabajo :");
        trabajo=entrada.nextFloat();
        
        
         Operaciones obj1=new Operaciones(parcial1, parcial2, parcial3, examen, trabajo);
        
        
        pParcial=obj1.promedioParcial(parcial1, parcial2,parcial3);
        promedioE=obj1.promedioExamen(examen);
        trabajo=obj1.promedioTrabajo(trabajo);
        cFinal=obj1.calificacionFinal(pParcial, promedioE,trabajo);
        obj1.imprimirR(cFinal);
        
        
        
       System.out.println("Diguite nota del primer parcial :");
        parcial1=entrada.nextFloat();
        System.out.println("Diguite nota del segundo parcial :");
        parcial2=entrada.nextFloat();
        System.out.println("Diguite nota del tercer parcial :");
        parcial3=entrada.nextFloat();
        System.out.println("Diguite nota del examen f :");
        examen=entrada.nextFloat();
        System.out.println("Diguite nota del trabajo :");
        trabajo=entrada.nextFloat();
        
        
         Operaciones obj2=new Operaciones(parcial1, parcial2, parcial3, examen, trabajo);
        
        
        pParcial=obj2.promedioParcial(parcial1, parcial2,parcial3);
        promedioE=obj2.promedioExamen(examen);
        trabajo=obj2.promedioTrabajo(trabajo);
        cFinal=obj2.calificacionFinal(pParcial, promedioE,trabajo);
        obj2.imprimirR(cFinal); 
        
        
        
        
    }
    
    
}
