package ejercicio1_CuentaBancaria;

import java.util.Scanner;

public class MainCuenta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        
        System.out.println("Ingresa el nombre del usuario");
        String titular = sc.nextLine();
        
        
        double saldo = 0;
        
        boolean saldoValido = false;
        
        
        while(!saldoValido){
            System.out.println("Ingrese el saldo inicial");
            
            if(!sc.hasNextDouble()){
                System.out.println("Entrada invalida. Vuelva a ingresar un numero");
                sc.next();
            }else{
                saldo = sc.nextDouble();
                
                if(saldo < 0){
                    System.out.println("El saldo no puede ser negativo");
                }else{
                    saldoValido = true;   
                            
                }
            }
        } 
        
        CuentaBancaria usuario1 = new CuentaBancaria(titular, saldo);
        
        System.out.println(usuario1.obtenerInformacion());
        
        
        opcion = 0;
        
        while(opcion != 4){
            System.out.println("==========MENU============");
            System.out.println("1. Ver información");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion");
            
            if(!sc.hasNextInt()){
                System.out.println("Entrada INVALIDA. Ingrese un numero");
                sc.next();
            }else{
                opcion = sc.nextInt();
                
                    switch(opcion){
                        case 1:
                            System.out.println(usuario1.obtenerInformacion());
                            break;
                        case 2:
                            System.out.println("Pedir monto a DEPOSITAR");
                            break;
                        case 3:
                            System.out.println("Pedir monto a RETIRAR");
                            break;
                        case 4:
                            System.out.println("Gracias por usar el sistema ");
                            break;

                        default:
                            System.out.println("Opcion invalida");
                    }
            
            }
            
        }
        
        
        boolean montoValido = false;
        double monto = 0;
        
        while(!montoValido){
            System.out.println("Ingrese un MONTO");
            
            if(!sc.hasNextDouble()){
                System.out.println("Entrada INVALIDA. Vuelve a ingresar un numero");
                sc.next();
            }else{
                
                monto = sc.nextDouble();
                
                if(monto <= 0){
                    System.out.println("El monto no puede ser negativo");
                }else{
                    montoValido = true;   
                }
            }
        }
        
        boolean depositoCorrecto = usuario1.depositar(monto);
        
        if(depositoCorrecto){
            System.out.println("Deposito realizado CORRECTAMENTE");
        }else{
            System.out.println("No se pudo realizar el deposito");
        }
        
        System.out.println(usuario1.obtenerInformacion());
        
        
        boolean retiroValido = false;
        double retiro = 0;
        
        while(!retiroValido){
            System.out.println("Ingrese monto a RETIRAR");
            
            if(!sc.hasNextDouble()){
                System.out.println("Entrada invalida. ingrese un NUMERO");
                sc.next();
            }else{
                
                retiro = sc.nextDouble();
                
                if(retiro <= 0){
                    System.out.println("El retiro no puede ser negativo");
                }else{
                    retiroValido = true;
                }
            }
        }
        
        boolean retiroCorrecto = usuario1.retirar(retiro);
        
        if(retiroCorrecto){
            System.out.println("Retiro realizado CORRECTAMENTE");
        }else{
            System.out.println("No se pudo realizar el retiro");
        }
        
        System.out.println(usuario1.obtenerInformacion());
        
    }
    
}