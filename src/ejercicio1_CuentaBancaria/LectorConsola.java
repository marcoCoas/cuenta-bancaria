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
        System.out.println(100);
        return 0;
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