package Cuentas;
import java.util.Scanner;

public class MaiCuentaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int des;
        int rep = 1;
        
        Cuenta ct1 = new Cuenta();
        ct1.setnombreTitular("Usuario1");
        ct1.setsueldo(5000000);
        
        Cuenta ct2 = new Cuenta();
        ct2.setnombreTitular("Usuario2");
        ct2.setsueldo(5000000);
        
        while (rep == 1) {            
            System.out.println("Que desea hacer?");
            System.out.println("1. Consultar datos cuentas");
            System.out.println("2. Consignar");
            System.out.println("3. Transferir");
            System.out.println("4. Retirar");
            System.out.println("5. Salir");
            des = sc.nextInt();
            
            switch (des) {
                case 1 -> {
                    System.out.println("Titular de la cuenta:"+ct1.getConsultarN()+" - Saldo de la cuenta: "+ ct1.getConsultarS());
                    System.out.println("Titular de la cuenta:"+ct2.getConsultarN()+" - Saldo de la cuenta: "+ ct2.getConsultarS());
                }
                case 2 -> {
                    System.out.println("Ingrese la cuenta a consignar: ");
                    int ctc = sc.nextInt();
                    if (ctc == 1) {
                        System.out.println("Cuanto va a consignar?");
                        ct1.getConsignar(sc.nextInt());
                        System.out.println("Listo!!");
                        System.out.println("Titular de la cuenta:"+ct1.getConsultarN()+" - Saldo de la cuenta: "+ ct1.getConsultarS());
                    }
                    if (ctc == 2) {
                        System.out.println("Cuanto va a consignar?");
                        ct2.getConsignar(sc.nextInt());
                        System.out.println("Listo!!");
                        System.out.println("Titular de la cuenta:"+ct2.getConsultarN()+" - Saldo de la cuenta: "+ ct2.getConsultarS());
                    }
                }
                case 3 -> {
                    System.out.println("Ingrese su cuenta: ");
                    int ctt = sc.nextInt();
                    if (ctt == 1) {
                        System.out.println("Cuanto va a transferir?");
                        ct1.getTransferir(sc.nextInt(), ct2);
                        System.out.println("Listo!!");
                        System.out.println("Titular de la cuenta:"+ct1.getConsultarN()+" - Saldo de la cuenta: "+ ct1.getConsultarS());
                    }
                    if (ctt == 2) {
                        System.out.println("Cuanto va a transferir?");
                        ct2.getTransferir(sc.nextInt(), ct1);
                        System.out.println("Listo!!");
                        System.out.println("Titular de la cuenta:"+ct2.getConsultarN()+" - Saldo de la cuenta: "+ ct2.getConsultarS());
                    }
                }
                case 4 -> {
                    System.out.println("Ingrese su cuenta: ");
                    int ctr = sc.nextInt();
                    if (ctr == 1) {
                        System.out.println("Cuanto va a retirar?");
                        ct1.getRetirar(sc.nextInt());
                        System.out.println("Listo!!");
                        System.out.println("Titular de la cuenta:"+ct1.getConsultarN()+" - Saldo de la cuenta: "+ ct1.getConsultarS());
                    }
                    if (ctr == 2) {
                        System.out.println("Cuanto va a retirar?");
                        ct2.getRetirar(sc.nextInt());
                        System.out.println("Listo!!");
                        System.out.println("Titular de la cuenta:"+ct2.getConsultarN()+" - Saldo de la cuenta: "+ ct2.getConsultarS());
                    }
                }
                case 5 -> rep++;
                default -> System.out.println("Ingrese una opcion valida");
            }
        }
    }
}