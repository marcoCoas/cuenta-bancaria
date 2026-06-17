package ejercicio1_CuentaBancaria;

public class CajeroApp {
    private LectorConsola lector;
    private CuentaBancaria cuenta;
    
    public CajeroApp(){
        lector = new LectorConsola();
    }
    
    public void iniciar(){
        String titular = lector.leerTexto("Ingrese el nombre del usuario");
        double saldo = lector.leerDoubleNoNegativo("Ingrese el saldo inicial");
        
        cuenta = new CuentaBancaria(titular, saldo);
        System.out.println(cuenta.obtenerInformacion());
        
        lector.cerrar();
    }
    
    private void crearCuenta(){
    }
    
    private void mostrarMenu(){
    
    }
    
    private void procesarOpcion(){
    
    
    }
    
    private void realizarDeposito(){
    
    }
    
    private void realizarRetiro(){
    
    }
   
    
}
