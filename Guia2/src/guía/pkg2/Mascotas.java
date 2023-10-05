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
public class Mascotas {
    private String nombre;
    private String especie;
    private Fecha nacimiento;
    private String raza;
    
    public void setNombre (String nombre)
    {
        this.nombre=nombre;
    }
    
    public String getNombre ()
    {
        return nombre;
    }
    
    public void setEspecie (String especie)
    {
        this.especie=especie;
    }
    
    public String getEspecie ()
    {
        return especie;
    }
    
    public void setNacimiento (Fecha nacimiento)
    {
        this.nacimiento=nacimiento;
    }
    
    public void setNacimiento (int dia, int numMes, int anio)
    {
        nacimiento.setDia(dia);
        nacimiento.setNumMes(numMes);
        nacimiento.setAnio(anio);
    }
    
    public Fecha getNacimiento ()
    {
        return nacimiento;
    }
    
    public void setRaza (String raza)
    {
        this.raza=raza;
    }
    
    public String getRaza ()
    {
        return raza;
    }
    
    public Mascotas (){}
    
    public Mascotas (String nombre, String especie, Fecha nacimiento, String raza)
    {
        this.nombre=nombre;
        this.especie=especie;
        this.nacimiento=nacimiento;
        this.raza=raza;
    }
    
    public void showMascota ()
    {
        JOptionPane.showMessageDialog(null, "Datos de la mascota: \n"+
                                                    "Nombre: "+nombre+
                                                    "\nEspecie: "+especie+
                                                    "\nNacimiento: "+nacimiento.getDia()+" - "+nacimiento.getNumMes()+" - "+nacimiento.getAnio()+
                                                    "\nRaza: "+raza);
    }
    
    public void deleteMascota ()
    {
        nombre="";
        especie="";
        nacimiento.deleteFecha();
        raza="";
    }
    
}
