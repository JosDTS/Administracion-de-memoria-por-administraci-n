/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package administracion.por.paginacion;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author ESTUDIANTE
 */
public class AdministracionPorPaginacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proceso pr = new Proceso(); 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("MENU");
        System.out.println("1.Ingresar procesos");
        System.out.println("2.Ejecutar proceso");
        
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                pr.addProcess();
                System.out.println("--------------------------------");
                pr.mostrarProcesos();
                System.out.println("---------------------------------");
                break;
                
            case 2:
                
                
            case 3:
                pr.mostrarProcesos();
            default:
                throw new AssertionError();
        }
        
        
        //Memoria Primaria
        
        ArrayList <Proceso> memoriaPrimaria = new ArrayList <> ();
        
        // Memoria Secundaria       
        ArrayList <Proceso> memoriaSecundaria = new ArrayList <> ();
    }
    
   
    
    
    
}
