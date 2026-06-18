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
    
    public double leerDoubleNoNegativo(String mensaje){
        double valor = 0;
        boolean valido = false;
        
        while(!valido){
            System.out.println(mensaje);
            
            if(!sc.hasNextDouble()){
                System.out.println("Entrada invalida. Ingrese un numero");
                sc.next();
            }else{
                valor = sc.nextDouble();
                
                if(valor < 0){
                    System.out.println("El valor no puede ser negativo");
                }else{
                    valido = true;
                }
            }
        }
        
        return valor;
    }
    
    public double leerDoubleMayorCero(String mensaje){
        double valor = 0;
        boolean valido = false;
        
        while(!valido){
            System.out.println(mensaje);
            
            if(!sc.hasNextDouble()){
                System.out.println("Entrada invalida. Ingresa un NUMERO");
                sc.next();
            }else{
                valor = sc.nextDouble();
                
                if(valor <= 0){
                    System.out.println("El valor debe ser mayor a 0");
                }else{
                    valido = true;
                }
            }
        
        }
        
        return valor;
    }
    
    public int leerEntero(String mensaje){
        int numEntero = 0;
        boolean validoEntero = false;
        
        while(!validoEntero){
            System.out.println(mensaje);
            
            if(!sc.hasNextInt()){
                System.out.println("Entrada invalida. Ingrese un numero entero");
                sc.next();
            }else{
                numEntero = sc.nextInt();
                validoEntero = true;
            }
        
        }
        return numEntero;
    }
    
    public void cerrar(){
        sc.close();
    }
         
}