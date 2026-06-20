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
        String titular = lector.leerTextoNoVacio("Ingrese el nombre del usuario");
        double saldo = lector.leerDoubleNoNegativo("Ingrese el saldo inicial");
        
        cuenta = new CuentaBancaria(titular, saldo);
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
                realizarDeposito();
                break;
            case 3:
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
        double monto = lector.leerDoubleMayorCero("Ingrese el monto a DEPOSITAR");
        boolean depositoCorrecto = cuenta.depositar(monto);
        
        if(depositoCorrecto){
            System.out.println("El DEPOSITO se realizo correctamente");
        }else{
            System.out.println("No se pudo realizar el deposito");
        }
        
        System.out.println(cuenta.obtenerInformacion());
        
    }
    
    private void realizarRetiro(){
        double monto = lector.leerDoubleMayorCero("Ingrese el monto a RETIRAR");
        boolean retiroCorrecto = cuenta.retirar(monto);
        
        if(retiroCorrecto){
            System.out.println("El retiro se realizo CORRECTAMENTE");
        }else{
            System.out.println("No se pudo REALIZAR el retiro");
        }
        
        System.out.println(cuenta.obtenerInformacion());
    }
   
}
