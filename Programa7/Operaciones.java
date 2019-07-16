/**
        FECHA MARTES 16 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA : MOSTRAR LOS MESES DEL AÑO, PIDIÉNDOLE AL USUARIO UN NÚMERO ENTRE (1-12), 
        Y MOSTRAR EL MES AL QUE CORRESPONDE

 */
public class Operaciones {
    private int numero;

    public Operaciones(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void enero(int numero){
        switch(numero){
            case 1:
                System.out.println("Enero");
                break;
        }
    }
    
    public void febrero(int numero){
        switch(numero){
            case 2:
                System.out.println("febrero");
                break;
        }   
}
    
    public void marzo(int numero){
        switch(numero){
            case 3:
                System.out.println("Marzo");
                break;
        }   
}
    
    public void abril(int numero){
        switch(numero){
            case 4:
                System.out.println("abril");
                break;
        }   
}
    
    
    public void mayo(int numero){
        switch(numero){
            case 5:
                System.out.println("Mayo");
                break;
        }   
}




public void junio(int numero){
        switch(numero){
            case 6:
                System.out.println("julio");
                break;
        }   
}



public void julio(int numero){
        switch(numero){
            case 7:
                System.out.println("Julio");
                break;
        }   
}

public void agosto(int numero){
        switch(numero){
            case 8:
                System.out.println("agosto");
                break;
        }   
}

public void septiembre(int numero){
        switch(numero){
            case 9:
                System.out.println("septiembre");
                break;
        }   
}
    
    
 public void octubre (int numero){
        switch(numero){
            case 10:
                System.out.println("Octubre");
                break;
        }   
}   
    
 public void noviembre(int numero){
        switch(numero){
            case 11:
                System.out.println("noviembre");
                break;
        }   
}   
 
 
 public void diciembre (int numero){
        switch(numero){
            case 12:
                System.out.println("diciembre");
                break;
        }   
}   
    
     public void error(int numero){
         
         if(numero>12){
             
             System.out.println("error");
             
         }
     }
}