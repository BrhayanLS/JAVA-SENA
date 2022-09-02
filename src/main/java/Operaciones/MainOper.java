package Operaciones;
import java.util.Scanner;

public class MainOper {
    public static void main(String[] args) {
        Operaciones ct = new Operaciones();
        int des = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que desea hacer?" +"\n"+
                            "1. Suma"+"\n"+
                            "2. Resta"+"\n"+
                            "3. Multiplicacion"+"\n"+
                            "4. Division");
        des = sc.nextInt();
        
        System.out.println("Ingrese el primer numero: ");
        ct.setnum1(sc.nextInt());
        
        System.out.println("Ingrese el segundo numero: ");
        ct.setnum2(sc.nextInt());
        
        switch (des) {
    case 1:
        System.out.println("El resultado de la suma es: " + ct.getsuma());
        ct.getsuma();
         break;
    case 2:
        System.out.println("El resultado de la resta es: " + ct.getresta());
        ct.getsuma();
         break;
    case 3:
        System.out.println("El resultado de la multiplicacion es: " + ct.getmulti());
        ct.getsuma();
         break;
    case 4:
        System.out.println("El resultado de la divison es: " + ct.getdivision());
        ct.getsuma();
         break;
                        }
                    }
    }
