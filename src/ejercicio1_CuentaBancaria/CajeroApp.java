package ejercicio1_CuentaBancaria;

public class CajeroApp {
    private LectorConsola lector;
    private CuentaBancaria cuenta;
    
    public CajeroApp(){
        lector = new LectorConsola();
    }
    
    public void iniciar(){
        String titular = lector.leerTexto("Ingrese el nombre del usuario");
        System.out.println("Usuario ingresado " + titular);
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
