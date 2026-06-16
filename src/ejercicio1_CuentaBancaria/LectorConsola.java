package ejercicio1_CuentaBancaria;

import java.util.Scanner;

public class LectorConsola {
    
    private Scanner sc;
    
    public LectorConsola(){
        sc = new Scanner(System.in);
    }
    
    public String leerTexto(String mensaje){
        System.out.println(mensaje);
        return sc.nextLine();
    }
    
    public double leerDouble(){
        return 0;
    }
    
    public double leerDoubleNegativo(String mensaje){
        return 0;
    }
    
    public double leerDoubleMayorCero(){
        return 0;
    }
    
    public int leerEntero(){
        return 0;
    }
    
    public void cerrar(){
        sc.close();
    }
         
}
