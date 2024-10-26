/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administracion.por.paginacion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Proceso {
    
    private int NumPaginacion; 
    private String NombreProceso; 
    private int estado; 

    public Proceso(int NumPaginacion, String NombreProceso, int estado) {
        this.NumPaginacion = NumPaginacion;
        this.NombreProceso = NombreProceso;
        this.estado = estado;
    }

    public Proceso() {
    }

    public int getNumPaginacion() {
        return NumPaginacion;
    }

    public void setNumPaginacion(int NumPaginacion) {
        this.NumPaginacion = NumPaginacion;
    }

    public String getNombreProceso() {
        return NombreProceso;
    }

    public void setNombreProceso(String NombreProceso) {
        this.NombreProceso = NombreProceso;
    }

    public int isEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Proceso" + "NumPaginacion: " + NumPaginacion + " NombreProceso: " + NombreProceso + " Estado: " + estado + '}';
    }
    
       //Lista de Porcesos
         ArrayList <Proceso> memoriaProcesos  = new ArrayList <> ();
         
           String [] memoriaPrincipal = new String[8];
           String [] memoriaSecundaria = new String[16];
           
           
          Scanner scanner = new Scanner(System.in); 
          
      public void addProcess (){
          
              System.out.println("Ingrese el numero de paginación");
              NumPaginacion = scanner.nextInt();
              scanner.nextLine(); 
              
              System.out.println("Ingrese el nombre del proceso:");
              NombreProceso = scanner.nextLine(); 
              
              estado = 0;
              
               Proceso nuevoProceso = new Proceso(NumPaginacion, NombreProceso, estado);
               memoriaProcesos.add(nuevoProceso);
               
               System.out.println("Proceso ingresado corretamente");
          
      }
      
  
    
      public void mostrarProcesos(){
          System.out.println("Lista de procesos almacenados");
          for (Proceso proceso : memoriaProcesos) {
              System.out.println(proceso.toString());
          }
      }
    
        public void ejecutarProceso(Proceso nuevoProceso){
          
          
            for (int i = 0; i < 10; i++) {
                
                 if (memoriaPrincipal == null) {
                     
                    
                }
            }
          
          
      }
      
    
    
}
