/**
        FECHA MARTES 16 DE JULIO DEL 2019
 	INSTITUTO TECNOLÒICO SUPERIOR RUMIÑAHUI 
 	NOMBRE : BRYAN GONZALEZ 
 	NOMBRE DE PROGRAMA :ESCRIBE UN PROGRAMA QUE LEA DE LA ENTRADA ESTÁNDAR TRES NÚMEROS. 
        DESPUÉS DEBE LEER UN CUARTO NÚMERO E INDICAR 
        SI EL NÚMERO COINCIDE CON ALGUNO DE LOS INTRODUCIDOS CON ANTERIORIDAD
 */
public class Operaciones {
    private int n1,n2,n3,n4;

    public Operaciones(int n1, int n2, int n3, int n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public int getN4() {
        return n4;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }

    public void  procesoN(int n1,int n2,int n3,int n4){
    
        if((n4==n1) || (n4==n2) ||(n4==n3) ){
            System.out.println("coincide ");
        }
        else{
            System.out.println("no cooincide nunguno");
        }
        
    }
    
}
