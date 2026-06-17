package ejercicio1_CuentaBancaria;

public class CajeroApp {
    private LectorConsola lector;
    private CuentaBancaria cuenta;
    
    public CajeroApp(){
        lector = new LectorConsola();
    }
    
    public void iniciar(){
        crearCuenta();
        
        lector.cerrar();
    }
    
    private void crearCuenta(){
        String titular = lector.leerTexto("Ingrese el nombre del usuario");
        double saldo = lector.leerDoubleNoNegativo("Ingrese el saldo inicial");
        
        cuenta = new CuentaBancaria(titular, saldo);
        System.out.println(cuenta.obtenerInformacion());
        mostrarMenu();
    }
    
    private void mostrarMenu(){
        System.out.println("===============MENU=========================");
        System.out.println("1. Ver informacion");
        System.out.println("2. Depositar");
        System.out.println("3. Retirar");
        System.out.println("4. Salir");
        
    
    }
    
    private void procesarOpcion(){
    
    }
    
    private void realizarDeposito(){
    
    }
    
    private void realizarRetiro(){
    
    }
   
    
}
