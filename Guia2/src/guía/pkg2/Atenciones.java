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


public class Atenciones {
    
    private int codigo;
    private Fecha fecha;
    private Clientes cliente;
    private int numMascotas;
    private Mascotas mascotas[]=new Mascotas[10];
    
    public Atenciones (){}
    
    public Atenciones (int codigo, Fecha fecha, Clientes cliente, Mascotas mascotas[])
    {
        this.codigo=codigo;
        this.fecha=fecha;
        this.cliente=cliente;
        
        for (int i=0;i<mascotas.length;i++)
        {
            this.mascotas[i]=mascotas[i];
        }
    }
    
   public void setCodigo (int codigo)
    {
        this.codigo=codigo;
    }
    
    public int getCodigo ()
    {
        return codigo;
    }
    
    public void setFecha (Fecha fecha)
    {
        this.fecha=fecha;
    }
    
    public Fecha getFecha ()
    {
        return fecha;
    }
    
    public void setCliente (Clientes cliente)
    {
        this.cliente=cliente;
    }
    
    public Clientes getCliente ()
    {
        return cliente;
    }
    
    public void setNumMascotas (int k)
    {
        numMascotas=k;
    }
    
    public int getNumMascotas ()
    {
        return numMascotas;
    }
    
    public void setMascota (int k, Mascotas mascota)
    {
        mascotas[k]=mascota;
    }
    
    public void setMascotas (Mascotas mascotas[])
    {
        for (int i=0;i<mascotas.length;i++)
        {
            this.mascotas[i]=mascotas[i];
        }
    }
    
    public Mascotas getMascotas (int indice)
    {
        return mascotas[indice];
    }
    
    public void showMascota (int indice)
    {
        JOptionPane.showMessageDialog(null,"Nombre de la mascota en la posición "+(indice+1)+" "+mascotas[indice].getNombre());
    }
    
    public void showAtencion ()
    {
        String mensaje="";
        String Sfecha=fecha.getDia()+" - "+fecha.getNumMes()+" - "+fecha.getAnio();
        
        
                //VER POR QUE SOLO DEVUELVE EL VALOR DEL ULTIMO OBJETO EN EL VECTOR
        kjhgigighkgb
        for (int i=0;i<numMascotas;i++)
        {
            mensaje=mensaje+mascotas[i].getNombre();
            if (i<numMascotas-1)  mensaje=mensaje+" - ";
        }
        
        JOptionPane.showMessageDialog(null, "Datos de la atención"
                +"\nCódigo: "+codigo
                + "\nNombre y apellido del cliente: "+cliente.getNombre()+" "+cliente.getApellido()
                + "\nNombre mascotas atendidas: "+ mensaje
                + "\nFecha: "+Sfecha);       
    }
    
    public void deleteAtencion ()
    {
        codigo=0;
        fecha.deleteFecha();
        cliente.deleteCliente();
                
        for (int i=0;i<mascotas.length;i++)
        {
            mascotas[i].deleteMascota();
        }
    }
}
