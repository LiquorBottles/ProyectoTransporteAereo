/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transporte.aero;

import java.util.Scanner;

/**
 *
 * @author JR
 */
public class CodigoTransporteAereo {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
         
         //Variables
        String numVuelo;
        int opcionMenu,edad, operador = 0, respuesta = 0, boleteria = 0, respuesta1 = 0;
        long identidad;
        
        //Variable para boleteria
        int asientosDisponibles = 8;
        int a1 = 1, a2 = 1,a3 = 1,a4 = 1,a5 = 1,a6 = 1,a7 = 1,a8 = 1, compraBoletoTotal=0;
        int b1 = 1,b2 = 1,b3 = 1,b4 = 1,b5 = 1,b6 = 1,b7 = 1,b8 =1 ,b9 = 1,b10 = 1,b11 = 1,b12 = 1,b13 = 1,b14 = 1,b15 = 1,b16 = 1;
        int c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
        int d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;
       
        int asientosDisponibles2 = 16;
        int asientosDisponibles3 = 10;
        int asientosDisponibles4 = 10;
        String nombrePasajero,nombreCompleto,genero;
        long Identidad;
        
        //Variables para asientos.
         String hn012boleto;
        //Variables
         
        //Codigo del menu.
         do{
            //Descripcion del menu 
            System.out.println("");
            System.out.println("Sistema TRANSPORTE AEREO");
            System.out.println("MENU");
            System.out.println("1. Boleteria");
            System.out.println("2.Despachar vuelo");
            System.out.println("3.Reportes");
            System.out.println("4.Cerrar Programa");
        
            //Codigo para poder entrar a una opcion del menu.
            System.out.println("");
            opcionMenu = leer.nextInt();
            //Condicion para solo poder ingresar las opciones del menu.
           while(opcionMenu != 1 && opcionMenu != 2 && opcionMenu != 3 && opcionMenu != 4){
               System.out.println("Ingresa un dato correcto");
               opcionMenu = leer.nextInt();
               leer.nextLine();
           }
           
           //Switch del menu.
            switch(opcionMenu){
                
                case 1:
                    do{
                       
                        System.out.println("\nIngresa una opcion:" + "\n1.Vender Ticket" + "\n2.Cancelar Ticket" + "\n3.Menu Principal" );
                        boleteria = leer.nextInt();
                        
                        //Condicion para switch Boleteria
                        while(boleteria != 1 && boleteria != 2 && boleteria != 3){
                            
                            System.out.println("Ingresa una opcion valida");
                            boleteria = leer.nextInt();
                        }
                        
                     switch(boleteria){
                         
                         case 1:
                                System.out.println("Vender Ticket");
                                System.out.println("");
                                
                                System.out.println("|-----------|----------------|---------|----------|--------|----------|");
                                System.out.println("|           |                |         |          |        |          |");
                                System.out.println("| Numero del|     Origen     | Destino | Cantidad | Precio | Costo en |");
                                System.out.println("| vuelo     |                |         | Asiento  | en $   | $        |");
                                System.out.println("|-----------|----------------|---------|----------|--------|----------|");
                                System.out.println("| HN012     | San Pedro Sula | Roatan  |    8     |  165.7 |  1200.7  |");
                                System.out.println("| HNO13     | Comoayagua     | Roatan  |    16    |  278.9 |  4500    |");
                                System.out.println("| HNO16     | Tegucigalpa    | S.P.S   |    10    |  125.8 |  1245.69 |");
                                System.out.println("| HNO19     | Ceiba          | Roatan  |    10    |  124.9 |  2550.54 |");
                                System.out.println("|-----------|----------------|---------|----------|--------|----------|");
                                System.out.println("");
                                
                                leer.nextLine();
                                System.out.println("Ingresa el número de vuelo");
                                numVuelo = leer.nextLine().toLowerCase().toUpperCase().replaceAll("\\s", "");
                                
                                String origen = "";
                                String destino = "";
                                
                                numVuelo = numVuelo.trim();
                                
                                
                                switch(numVuelo){
                                    case "HN012":
                                        origen = "San Pedro Sula";
                                        destino = "Roatan";
                                        System.out.println(origen);
                                        System.out.println(destino);
                                        System.out.println("");
                                        if(asientosDisponibles == 0){
                                            System.out.println("Cantidad de asientos disponibles" + asientosDisponibles);
                                            System.out.println("NO HAY BOLETOS, AVIÓN LISTO PARA DESPACHAR");
                                             break;
                                        }else{
                                            //comprar el asiento.
                                            System.out.println("Cantidad de asientos disponibles: " + asientosDisponibles);
                                            System.out.println("\na1" + "\na2" + "\na3" + "\na4" + "\na5" + "\na6" + "\na7" + "\na8" );
                                            System.out.println("Ingrese el asiento que quiere comprar");
                                            hn012boleto = leer.nextLine().toLowerCase().toUpperCase().replaceAll("\\s", "");
                                            
                                            switch(hn012boleto){
                                                case "a1":
                                                   compraBoletoTotal++;
                                                   asientosDisponibles--;
                                                   a1--;
                                                   while(a1 == 1){
                                                       System.out.println("El asiento ya fue comprado");  
                                                   }  
                                                   break;
                                                case "a2":
                                                    compraBoletoTotal++;
                                                    asientosDisponibles--;
                                                    a2--;
                                                    while(a2 == 0){
                                                        System.out.println("El asiento ya fue comprado");
                                                    }
                                                    break;
                                                case "a3":
                                                    compraBoletoTotal++;
                                                    asientosDisponibles--;
                                                    while(a3 == 0){
                                                        System.out.println("El asiento ya fue comprado");
                                                    }
                                                    break;
                                                case "a4":
                                                    compraBoletoTotal++;
                                                    asientosDisponibles--;
                                                    while(a4 == 0){
                                                        System.out.println("El asiento ya fue comprado");
                                                    }
                                                    break;
                                                case "a5":
                                                    compraBoletoTotal++;
                                                    asientosDisponibles--;
                                                    while(a5 == 1){
                                                        System.out.println("El asiento ya fue comprado");
                                                    }
                                                    break;
                                                case "a6":
                                                    compraBoletoTotal++;
                                                    asientosDisponibles--;
                                                    while(a6 == 0){
                                                        System.out.println("El asiento ya fue comprado");
                                                    }    
                                                        break;
                                                case "a7":
                                                    compraBoletoTotal++;
                                                    asientosDisponibles--;
                                                    while(a7 == 0){
                                                        System.out.println("El asiento ya fue comprado");
                                                    }
                                                    break;
                                                case "a8":
                                                    compraBoletoTotal++;
                                                    asientosDisponibles--;
                                                    while(a8 == 0){
                                                        System.out.println("El asiento ya fue comprado");  
                                                        break;
                                                    } 
                                                default:
                                                    System.out.println("Este asiento no existe, regreseras al menu de boleteria");
                                                    operador = 2;
                                                    break;
                                            }
                                            
                                            System.out.println("Ingresa el numero de identidad");
                                            identidad = leer.nextLong();
                                            System.out.println("Ingrese su nombre completo");
                                            nombreCompleto = leer.nextLine().toLowerCase().toUpperCase().replaceAll("\\s", "");
                                            leer.nextLine();
                                            System.out.println("Ingrese su edad");
                                            edad = leer.nextInt();
                                            System.out.println("Ingresa tu genero");
                                            genero = leer.nextLine().toLowerCase().toUpperCase().replaceAll("\\s", "");
                                            leer.nextLine();
                                            //factura
                                            System.out.println("----Factura----");
                                            System.out.println("Nombre:" + nombreCompleto);
                                            System.out.println("Numero de identidad:" + identidad);
                                            System.out.println("Numero de vuelo:" + numVuelo);
                                            System.out.println("Origen: " + origen);
                                            System.out.println("Destino:" + destino);
                                            System.out.println("Asientos: " + hn012boleto);
                                            System.out.println("Cantidad de boletos: " + compraBoletoTotal);
                                            System.out.println("Precio Unitario del boleto:");
                                            System.out.println("Subtotal:");
                                            System.out.println("Descuento: ");
                                            System.out.println("Impuesto aereo: ");
                                            
                                            System.out.println("Deseas comprar otro boleto? (1.Si/2.No)");
                                            operador = leer.nextInt();
                                            //while de operador
                                            while(operador != 1 && operador !=2){
                                                System.out.println("ingrese una opcion valida (1.Si/2.No)");
                                                operador = leer.nextInt();
                                            }
                                        }
                                        break;
                                        
                                    case "HN013":
                                        origen = "Comayagua";
                                        destino = "Roatan";
                                        System.out.println(origen);
                                        System.out.println(destino);
                                        System.out.println("");
                                        if(asientosDisponibles2 == 0){
                                            System.out.println("Cantidad de asientos disponibles" + asientosDisponibles2);
                                            System.out.println("NO HAY BOLETOS, AVIÓN LISTO PARA DESPACHAR ");
                                            break;
                                        }else{
                                            System.out.println("Cantidad de asientos disponibles: " + asientosDisponibles2);
                                            System.out.println("Ingresa el numero de identidad");
                                              identidad = leer.nextLong();
                                              System.out.println("Ingrese su nombre completo");
                                              nombreCompleto = leer.nextLine().toLowerCase().toUpperCase().replaceAll("\\s", "");
                                              leer.nextLine();
                                              System.out.println("Ingrese su edad");
                                              edad = leer.nextInt();
                                              System.out.println("Ingresa tu genero");
                                              genero = leer.nextLine().toLowerCase().toUpperCase().replaceAll("\\s", "");
                                              leer.nextLine();
                                              System.out.println("Deseas comprar otro boleto? (1.Si/2.No)");
                                            operador = leer.nextInt();
                                            //while de operador
                                            while(operador != 1 && operador !=2){
                                                System.out.println("ingrese una opcion valida (1.Si/2.No)");
                                                operador = leer.nextInt();
                                            }
                                        }
                                        
                                        break;
                                    
                                    case "HN016":
                                        origen = "Tegucigalpa";
                                        destino = "San Pedro Sula";
                                        System.out.println(origen);
                                        System.out.println(destino);
                                        System.out.println("");
                                        if(asientosDisponibles3 == 0){
                                            System.out.println("Cantidad de asientos disponibles" + asientosDisponibles3);
                                           System.out.println("NO HAY BOLETOS, AVIÓN LISTO PARA DESPACHAR ");
                                           break;
                                        }else{
                                            System.out.println("Cantidad de asientos disponibles: " + asientosDisponibles3);
                                            System.out.println("Ingrese el numero de identidad");
                                            identidad = leer.nextLong();
                                            System.out.println("Ingrese su nombre completo");
                                            nombreCompleto = leer.nextLine().toLowerCase().toUpperCase().replaceAll("\\s", "");
                                            leer.nextLine();
                                            System.out.println("Ingrese su edad");
                                            edad = leer.nextInt();
                                            System.out.println("Ingresa tu genero");
                                            genero = leer.nextLine().toLowerCase().toUpperCase().replaceAll("\\s", "");
                                            leer.nextLine();
                                            System.out.println("Deseas comprar otro boleto? (1.Si/2.No)");
                                            operador = leer.nextInt();
                                            //while de operador
                                            while(operador != 1 && operador !=2){
                                                System.out.println("ingrese una opcion valida (1.Si/2.No)");
                                                operador = leer.nextInt();
                                            }
                                        }
                                        break;
                                        
                                    case "HN019":
                                         origen = "Ceiba";
                                        destino = "Roatan";
                                        System.out.println(origen);
                                        System.out.println(destino);
                                        System.out.println("");
                                        if(asientosDisponibles4 == 0){
                                          System.out.println("Cantidad de asientos disponibles" + asientosDisponibles3);
                                          System.out.println("NO HAY BOLETOS, AVIÓN LISTO PARA DESPACHAR ");
                                          break;
                                            
                                        }else{
                                            System.out.println("Cantidad de asientos disponibles: " + asientosDisponibles4);
                                             System.out.println("Ingrese el numero de identidad");
                                            identidad = leer.nextLong();
                                            System.out.println("Ingrese su nombre completo");
                                            nombreCompleto = leer.nextLine().toLowerCase().toUpperCase().replaceAll("\\s", "");
                                            leer.nextLine();
                                            System.out.println("Ingrese su edad");
                                            edad = leer.nextInt();
                                            System.out.println("Ingresa tu genero");
                                            genero = leer.nextLine().toLowerCase().toUpperCase().replaceAll("\\s", "");
                                            leer.nextLine();
                                            System.out.println("Deseas comprar otro boleto? (1.Si/2.No)");
                                            operador = leer.nextInt();
                                            //while de operador
                                            while(operador != 1 && operador !=2){
                                                System.out.println("ingrese una opcion valida (1.Si/2.No)");
                                                operador = leer.nextInt();
                                            }
                                            
                                        }
                                        break;
                                        
                                    default:
                                        System.out.println("El vuelo no existe, regresando al menú principal");
                                        System.out.println("");
                                        operador = 2; // Cambiado a 3 para salir del bucle Boletería
                                        break;
                                }
                                
                                if (!origen.isEmpty() && !destino.isEmpty()) {
                                System.out.println("Origen: " + origen);
                                System.out.println("Destino: " + destino);
                            }
    
                                break;
                                
                                
                         case 2:  
                             System.out.println("Cancelar ticket");
                             break;
                         case 3:
                             System.out.println("Regresar Menu Principal");
                             operador = 2;
                             break;
                        }   
                        
                        }while(operador == 1);
                        break;
                    
                case 2:
                    System.out.println("Despechar Vuelo"); 
                    break;
                case 3:
                    System.out.println("Reportes");
                    
                    break;
                case 4:
                    System.out.println("Cerrar Programa");
                    operador = 3;  
                
            }
                
           }while(operador != 3);
        
    }

    
 
}

   
