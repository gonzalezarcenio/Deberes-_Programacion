/**
        FECHA MARTES 16 DE JULIO DEL 2019
 	INSTITUTO TECNOL�GICO SUPERIOR RUMI�AHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA : RESTA DE 2 NUMEROS 
 */
public class Operaciones {
    private int numero1;
    private int numero2;

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    
    public int calculoR(int n1,int n2){
         int resta;
         
         resta=n1-n2;
        
         return resta;
    }
    
    public void imprimir(int resta){
        System.out.println("LA RESTA ES :"+resta);
    }

    
}
