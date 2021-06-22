/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author jenni
 */
public class PROYECTO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader BF =new BufferedReader(new InputStreamReader(System.in));
        Scanner SC = new Scanner(System.in);
        
      CLIENTE C[] = new CLIENTE[3];
      int n;
      String ID="";
      String NOMBRE ="";
      String APELLIDO_P="";
      String APELLIDO_M="";
      int EDAD=0;
      String CORREO="";
      String DIRECCION="";
      String TELEFONO="";
      String Eliminar;
      int posision;
      
      
            int opcion1,opcion2, SALIR;
        boolean salir = false;
       


        while (!salir) {
            System.out.println("                        ");
            System.out.println("************************");
            System.out.println("  CARTERA DE CLIENTES   ");
            System.out.println("************************");
            System.out.println("                        ");
            System.out.println("1. AGREGAR CLIENTES");
            System.out.println("2. MOSTRAR LISTA DE CLIENTES");
            System.out.println("3. BUSCAR CLIENTE ");
            System.out.println("0. SALIR ");
            System.out.println("Elige una opcion del menu: ");
            opcion1 = SC.nextInt();
            switch (opcion1) {
                case 1:
                    for(int i=0; i<C.length; i++){
                         System.out.println("                        ");
                        System.out.print("INGRESA EL ID DEL CLIENTE: \n");
                        ID = SC.nextLine();
                        System.out.print("INGRESA EL NOMBRE DEL CLIENTE: \n");
                        NOMBRE = SC.nextLine();
                        System.out.print("INGRESE EL APELLIDO PATERNO DEL CLIENTE: \n");
                        APELLIDO_P = SC.nextLine();
                        System.out.print("INGRESE EL APELLIDO MATERNO DEL CLIENTE: \n");
                        APELLIDO_M = SC.nextLine();
                        System.out.print("INGRESE LA EDAD  DEL CLIENTE: \n");
                        EDAD = SC.nextInt();
                        System.out.print("INGRESE LA DIRECCION DEL CLIENTE: \n");
                        DIRECCION = SC.nextLine();
                        System.out.print("INGRESE EL CORREO DEL CLIENTE: \n");
                        CORREO = SC.nextLine();
                        System.out.print("INGRESE EL TELEFONO DEL CLIENTE: \n");
                        TELEFONO = SC.nextLine();
                        C[i] = new CLIENTE(ID, NOMBRE, APELLIDO_P, APELLIDO_M, EDAD, DIRECCION, CORREO, TELEFONO);
                    }
                        break;
                        
                        case 2:
                            for(int i = 0; i<C.length; i++){
                                System.out.print(C[i].getId()+"\n"+
                                        C[i].getNOMBRE()+"\n"+
                                        C[i].getAPELLIDO_P()+"\n "+
                                        C[i].getAPELLIDO_M()+"\n"+ 
                                        C[i].getEDAD()+"\n"+ 
                                        C[i].getDIRECCION()+ "\n" + 
                                        C[i].getCORREO()+ "\n"+ 
                                        C[i].getTELEFONO());
                                
                            }
                    break;
              
                case 3:
                    System.out.print("INGRESAR EL NOMBRE A BUSCAR: ");
                   String BUSCADOR = SC.nextLine();
                    for(int i=0; i<C.length; i++){
                        if(C[i].getNOMBRE().equals(NOMBRE)){
                            posision=i;
                            System.out.print("CLIENTE ENCONTRADO");
                        }else{
                            System.out.print("CLIENTE NO ENCONTRADO EN EL SISTEMA");
                        }
                        
                    }
                break;
                
                case 0:
                    System.out.print("GRASIAS POR USAR EL PROGRAMA");
                break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
      
          
          
                  }

    }
}
    

           
