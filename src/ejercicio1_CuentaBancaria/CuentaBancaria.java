package ejercicio1_CuentaBancaria;


public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        if(titular == null || titular.trim().isEmpty()){
            this.titular = "Sin titular";
        }else{
            this.titular = titular.trim();
        }
        
        if(saldo<0){
            this.saldo=0;
        }else{
            this.saldo = saldo;
        }
        
    }
    

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public boolean depositar(double monto){
        if(monto <= 0){
            return false;
        }
        
        saldo = saldo + monto;
        return true;
    }
    
    public boolean retirar(double monto){
        if(monto <= 0){
            return false;
        }
        
        if(monto> saldo){
            return false;
        }
        
        saldo = saldo - monto;
        
        return true;
    }
    
    public String obtenerInformacion(){
        return "Titular: " + titular + " | Saldo: S/ " + String.format("%.2f", saldo);
    }
           
}
