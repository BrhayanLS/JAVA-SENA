package Cuentas;

public class Cuenta {
    
    //Atributo
    private String nombreTitular;
    private int sueldo;
    private int monto;
    
    //Constructor vacio
    Cuenta() {
    }
    
    public void setnombreTitular(String nombreTitular){
        this.nombreTitular=nombreTitular;
    }
    public void getnombreTitular(String nombreTitular){
        this.nombreTitular=nombreTitular;
    }
    
    public void setsueldo(int sueldo){
        this.sueldo=sueldo;
    }
    public void getsueldo(int sueldo){
        this.sueldo=sueldo;
    }
    
    public void setmonto(int monto){
        this.monto=monto;
    }
    public void getmonto(int monto){
        this.monto=monto;
    }
    //Metodos
    //Nombre y saldo
    public String getConsultarN(){
        return (nombreTitular);
    }
    public int getConsultarS(){
        return (sueldo);
    }
    
    //Consignar
    public int getConsignar(int monto){
        return (sueldo = sueldo + monto);
    }
    
    //Retirar
    public int getRetirar(int monto){
        return(sueldo = sueldo - monto);
    }
    
    //Transferir
    public void getTransferir (int monto, Cuenta ct){
        this.sueldo = (this.sueldo - monto);
        ct.sueldo = (ct.sueldo + monto);
        
    };
}