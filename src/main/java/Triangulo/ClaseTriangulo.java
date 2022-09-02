package Triangulo;

public class ClaseTriangulo {
    
    //Atributos de la clase
    private int base;
    private int altura;
    
//Constructor
    ClaseTriangulo() {
    }
    
//Metodos de envio y para recibir datos    
    public void setbase(int base){
        this.base=base;
    }
    public int getbase(){
        return this.base;
    }
    
    public void setaltura(int altura){
        this.altura=altura;
    }
    public int getaltura(){
        return this.altura;
    }
        
    //Metodo para calcular el area
    public int getarea(){
       return ((this.altura * this.base)/2);
   }
}
