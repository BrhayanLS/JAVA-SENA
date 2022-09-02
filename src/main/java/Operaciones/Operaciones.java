package Operaciones;

public class Operaciones {
    
    //Atributos
    private int num1;
    private int num2;
    
    
    //envio y recibo
    public void setnum1(int num1){
        this.num1=num1;
    }
    public void getnum1(int num1){
        this.num1=num1;
    }
    
    public void setnum2(int num2){
        this.num2=num2;
    }
    public void getnum2(int num2){
        this.num2=num2;
    }
    
    //Metodo
    public int getsuma(){
        return (this.num1 + this.num2);
    }
    public int getresta(){
        return (this.num1 - this.num2);
    }
    public int getmulti(){
        return (this.num1 * this.num2);
    }
    public int getdivision(){
        return (this.num1 / this.num2);
    }
}
