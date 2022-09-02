package Triangulo;

public class Triangulo {
    
    public static void main(String[] args) {
        ClaseTriangulo ct = new  ClaseTriangulo();
        
        ct.setaltura(7);
        ct.setbase(13);
        
        System.out.println("El area del triangulo es: " + ct.getarea());
        ct.getarea();
    }
}
