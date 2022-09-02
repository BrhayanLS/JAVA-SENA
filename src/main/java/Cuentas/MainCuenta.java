package Cuentas;
import java.util.Scanner;

public class MainCuenta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Cuenta ct1 = new Cuenta();
        ct1.setnombreTitular("Usuario1");
        ct1.setsueldo(5000000);
        
        Cuenta ct2 = new Cuenta();
        ct2.setnombreTitular("Usuario2");
        ct2.setsueldo(5000000);
        
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Informacion inicial de las cuentas");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Titular de la cuenta:"+ct1.getConsultarN()+" - Saldo de la cuenta: "+ ct1.getConsultarS());
        System.out.println("Titular de la cuenta:"+ct2.getConsultarN()+" - Saldo de la cuenta: "+ ct2.getConsultarS());
        
        ct1.getRetirar(500000);
        ct2.getConsignar(500000);
        
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Retiro de 500000 de cuenta 1 y consignar 500000 en cuenta 2");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Titular de la cuenta:"+ct1.getConsultarN()+" - Saldo de la cuenta: "+ ct1.getConsultarS());
        System.out.println("Titular de la cuenta:"+ct2.getConsultarN()+" - Saldo de la cuenta: "+ ct2.getConsultarS());
        
        ct1.getTransferir(800000, ct2);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Transferencia de 800000 de cuenta 1 a cuenta 2");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Titular de la cuenta:"+ct1.getConsultarN()+" - Saldo de la cuenta: "+ ct1.getConsultarS());
        System.out.println("Titular de la cuenta:"+ct2.getConsultarN()+" - Saldo de la cuenta: "+ ct2.getConsultarS());
    }
}
