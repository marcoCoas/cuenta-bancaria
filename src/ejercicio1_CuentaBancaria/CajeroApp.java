package ejercicio1_CuentaBancaria;

public class CajeroApp {
    private LectorConsola lector;
    private CuentaBancaria cuenta;
    
    public CajeroApp(){
        lector = new LectorConsola();
    }
    
    public void iniciar(){
        crearCuenta();
        
        int opcion = 0;
        while(opcion != 4){
            mostrarMenu();
            opcion = lector.leerEntero("Ingrese una opcion");
            procesarOpcion(opcion);
        }
        
        lector.cerrar();
    }
    
    private void crearCuenta(){
        String titular = lector.leerTexto("Ingrese el nombre del usuario");
        double saldo = lector.leerDoubleNoNegativo("Ingrese el saldo inicial");
        
        cuenta = new CuentaBancaria(titular, saldo);
        //System.out.println(cuenta.obtenerInformacion());
        //mostrarMenu();
    }
    
    private void mostrarMenu(){
        System.out.println("===============MENU=========================");
        System.out.println("1. Ver informacion");
        System.out.println("2. Depositar");
        System.out.println("3. Retirar");
        System.out.println("4. Salir");
    }
    
    private void procesarOpcion(int opcion){
        switch(opcion){
            case 1:
                System.out.println(cuenta.obtenerInformacion());
                break;
            case 2:
                System.out.println("Ingrese el deposito");
                realizarDeposito();
                break;
            case 3:
                System.out.println("Ingrese el retiro");
                realizarRetiro();
                break;
            case 4:
                System.out.println("Gracias por usar el sistema");
                break;
                
            default:
                System.out.println("Opcion INVALIDA");
        }
    
    }
    
    private void realizarDeposito(){
    
    }
    
    private void realizarRetiro(){
    
    }
   
    
}
