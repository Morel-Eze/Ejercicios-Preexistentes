/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.lab.alumnos;
import javax.swing.JOptionPane;

/**
 *
 * @author Bit Store TDF
 */
public class Alumno {
    
    private int legajo;
    private String apeynom;
    private String domicilio;
    private int dni;
    private int añoIngreso;
    private String email;
    private boolean egresadoSecu;
    private String egresado;
       
    Alumno (){}     //constructor vacio
    
    Alumno (int leg, String nya, String dire, int dni, int añoIngreso, String email, boolean egre)
    {
        legajo=leg;
        apeynom=nya;
        domicilio=dire;
        this.dni=dni;
        this.añoIngreso=añoIngreso;
        this.email=email;
        
        if (egre==true) egresado="Sí";
        else            egresado="No";
    }
    
    public int getLegajo()
    {
        return this.legajo;
    }
    
    public void setLegajo (int leg)
    {
        this.legajo=leg;
    }
    
    public String getNombre()
    {
        return this.apeynom;
    }
    
    public void setNombre (String nya)
    {
        this.apeynom=nya;
    }
    
    public String getDomicilio()
    {
        return this.domicilio;
    }
    
    public void setDireccion (String dire)
    {
        this.domicilio=dire;
    }
    
    public int getDni ()
    {
        return this.dni;
    }
    
    public void setDni (int dni)
    {
        this.dni=dni;
    }
        
    public int getAñoIngreso ()
    {
        return this.añoIngreso;
    }
    
    public void setAñoIngreso (int añoIn)
    {
        this.añoIngreso=añoIn;
    }
    
    
    public String getEmail ()
    {
        return this.email;
    }
    
    public void setEmail (String email)
    {
        this.email=email;
    }
        
    public String getEgresado ()
    {
        return this.egresado;
    }
    
    public void setEgresado (String egre)
    {
        this.egresado=egre;
    }
    
    public void showAlumno()
    {
        JOptionPane.showMessageDialog(null,    
            "Legajo: "+legajo+
            "\nNombre y Apellido: "+apeynom+
            "\nDomicilio: "+domicilio+
            "\nDNI: "+dni+
            "\nEmail: "+email+
            "\n¿Es egresado del secundario? "+egresado);
    }
    
    public void modAlumno()
    {
        legajo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo legajo: "));
        apeynom=JOptionPane.showInputDialog("Ingrese el apellido y nombre del alumno: ");
        domicilio=JOptionPane.showInputDialog("Ingrese la dirección del alumno: ");
        dni=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni del alumno: "));
        añoIngreso=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de ingreso del alumno: "));
        email=JOptionPane.showInputDialog("Ingrese el email del alumno: ");
        egresado=JOptionPane.showInputDialog("¿Es egresado del secundario? ");
        while (egresado.compareToIgnoreCase("Si")!=0 && egresado.compareToIgnoreCase("Sí")!=0 && egresado.compareToIgnoreCase("No")!=0)
            {
                egresado=JOptionPane.showInputDialog("Por favor, ingrese 'Sí' o 'No'. ");
            }
    }
}
