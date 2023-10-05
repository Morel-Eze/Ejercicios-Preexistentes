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
public class Clientes {
    
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private String ciudad;
    private Mascotas mascotas[]/*=new Mascotas[10]*/;
    
    
    public void setNombre (String nombre)
    {
        this.nombre=nombre;
    }
            
    public String getNombre ()
    {
        return nombre;
    }
    
    public void setApellido (String apellido)
    {
        this.apellido=apellido;
    }
            
    public String getApellido ()
    {
        return apellido;
    }
    
    public void setDireccion (String direccion)
    {
        this.direccion=direccion;
    }
            
    public String getDireccion ()
    {
        return direccion;
    }
    
    public void setTelefono (int telefono)
    {
        this.telefono=telefono;
    }
            
    public int getTelefono ()
    {
        return telefono;
    }
    
    public void setCiudad (String ciudad)
    {
        this.ciudad=ciudad;
    }
            
    public String getCiudad ()
    {
        return ciudad;
    }
    
    public Clientes()
    {
        
    }
    
    public Clientes (String nombre, String apellido, String direccion, int telefono, String ciudad, Mascotas mascotas[])
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
        this.telefono=telefono;
        this.ciudad=ciudad;
        
        for (int i=0;i<mascotas.length;i++)
        {
            this.mascotas[i]=mascotas[i];
        }
    }
    
    public void showCliente ()
    {
        JOptionPane.showMessageDialog(null, "Datos del cliente:"+
                                                    "\nNombre: "+nombre+
                                                    "\nApellido: "+apellido+
                                                    "\nDirección: "+direccion+
                                                    "\nTeléfono: "+telefono+
                                                    "\nCiudad: "+ciudad);
    }
    
    public void deleteCliente ()
    {
        nombre="";
        apellido="";
        direccion="";
        telefono=0; 
        ciudad="";
        
        for (int i=0;i<mascotas.length;i++)
        {
            mascotas[i].deleteMascota();
        }

    }
}
