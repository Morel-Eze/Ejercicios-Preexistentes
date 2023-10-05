/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guía.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Bit Store TDF
 */
public class Fecha {
    
    private int dia;
    private int numMes;
    private int anio;
    
   public void setDia (int dia)
    {
        this.dia=dia;
    }
            
   public int getDia ()
   {
       return dia;
   }

   public void setNumMes (int numMes)
    {
        this.numMes=numMes;
    }
            
   public int getNumMes ()
   {
       return numMes;
   }
   
   public void setAnio (int anio)
    {
        this.anio=anio;
    }
            
   public int getAnio ()
   {
       return anio;
   }
   
   public Fecha ()
   {
       
   }
   
   public Fecha (int dia, int numMes, int anio)
   {
       this.dia=dia;
       this.numMes=numMes;
       this.anio=anio;
   }
   
   public void showFecha ()
   {
       JOptionPane.showMessageDialog(null, "La fecha es: "+dia+" - "+numMes+" - "+anio);
   }
   
   public void deleteFecha ()
   {
       dia=0;
       numMes=0;
       anio=0;
   }
}
