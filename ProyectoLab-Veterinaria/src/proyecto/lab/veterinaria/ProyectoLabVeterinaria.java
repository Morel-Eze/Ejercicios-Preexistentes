/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.lab.veterinaria;

import javax.swing.JOptionPane;

/**
 *
 * @author Bit Store TDF
 */
public class ProyectoLabVeterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String agregar="No";
        int contador=0;
        int k=0;
        int opcion=0;
        int dia,numMes,año;
        String mes;
        String fecha;
        String vivo;
        boolean error=false;
        String nombre;
        
        Mascotas vector [] = new Mascotas [100];
        
        while (agregar.equalsIgnoreCase("Si")==true ||agregar.equalsIgnoreCase("Sí")==true)
        {
            contador++;
            
            dia=numMes=año=0;
            mes=null;
                        
            vector[k].setCode(contador);
            vector[k].setName(JOptionPane.showInputDialog(null,"Ingrese el nombre de la mascota "));
            do {
                vector[k].setSpecies(JOptionPane.showInputDialog("Ingrese la especie: "));
                
                if (vector[k].getSpecies().equalsIgnoreCase("perro")==false    &&
                    vector[k].getSpecies().equalsIgnoreCase("gato")==false      &&
                    vector[k].getSpecies().equalsIgnoreCase("conejo")==false)
                {
                    vector[k].setSpecies(JOptionPane.showInputDialog("Ingrese la especie "));
                }
                
            } while (vector[k].getSpecies().equalsIgnoreCase("perro")==false    &&
                    vector[k].getSpecies().equalsIgnoreCase("gato")==false      &&
                    vector[k].getSpecies().equalsIgnoreCase("conejo")==false);
            
            vector[k].setRace(JOptionPane.showInputDialog("Ingrese la raza "));
            
            do{
                año=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento de la mascota"));
                if (año>2023 || año <2000)  error=true;
                
                if (error==true)    JOptionPane.showMessageDialog(null,"ERROR. Año inválido.");
            } while (error==true);
            
            do{
                mes=(JOptionPane.showInputDialog("Ingrese el mes de nacimiento de la mascota"));
                error=true;
                
                 error=checkMes(mes);  
                 if (error==false)   numMes=numMes(mes);
                 
                if (error==true)    JOptionPane.showMessageDialog(null,"ERROR. Mes inválido.");
            } while (error==true);
            
            do{
                dia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de nacimiento de la mascota"));
                if (dia>31 || dia <1)  error=true;
                
                if (error==true)    JOptionPane.showMessageDialog(null,"ERROR. Día inválido.");
            } while (error==true);
            
            fecha=año+" - "+numMes+" - "+dia;
            vector[k].setBirth(fecha);
            
            vivo=JOptionPane.showInputDialog("¿La mascota falleció?");
            
            vector[k].setVivo(vivo);
            
            if (vivo.equalsIgnoreCase("no")==true)
            {
                fecha="";
                
                do{
                    año=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de fallecimiento de la mascota"));
                    if (año>2023 || año <2000)  error=true;

                    if (error==true)    JOptionPane.showMessageDialog(null,"ERROR. Año inválido.");
                } while (error==true);

                do{
                    mes=(JOptionPane.showInputDialog("Ingrese el mes de fallecimiento de la mascota"));
                    error=true;
                    
                    error=checkMes(mes);
                    if (error==false)   numMes=numMes(mes);
                    
                    if (error==true)    JOptionPane.showMessageDialog(null,"ERROR. Mes inválido.");
                } while (error==true);

                do{
                    dia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de fallecimiento de la mascota"));
                    if (dia>31 || dia <1)  error=true;

                    if (error==true)    JOptionPane.showMessageDialog(null,"ERROR. Día inválido.");
                } while (error==true);
                
                fecha=año+" - "+numMes+" - "+dia;
                vector[k].setDeath(fecha);
            }
            
            agregar=JOptionPane.showInputDialog("¿Desea agregar otra mascota?");
        }
        
        opcion=Integer.parseInt(JOptionPane.showInputDialog ("Menú de opciones\n"+
                                    
                                    "1 - Registrar defunción\n"+
                                    "2 - Modificar mascota\n"+
                                    "3 - Eliminar mascota\n"+
                                    "4 - Perro más viejo\n"+
                                    "5 - Edades conejos\n"+
                                    "6 - Perros fallecidos este mes\n"+
                                    "7 - Listado gatos (orden por nacimiento)\n"+
                                    "8 - SALIR"
            ));
        
        switch (opcion)
        {
            case 1: 
                
                nombre=JOptionPane.showInputDialog("Ingrese el nombre de la mascota");
                
                JOptionPane.showMessageDialog(null, "Buscando mascotas con el nombre "+nombre);
                
                for (int i=0;i<k;i++)
                {
                    if (vector[i].getName().equalsIgnoreCase(nombre)==true) vector[i].showMascota();
                    JOptionPane.showInputDialog("¿Es la mascota correcta?");
                }
                
                
                
        }
        
    }
    
    public static boolean checkMes (String mes)
    {
        boolean error=true;
        
        if (mes.equalsIgnoreCase("Enero")==true         || mes.equals("1")==true)         error=false;
        if (mes.equalsIgnoreCase("Febrero")==true       || mes.equals("2")==true)         error=false;
        if (mes.equalsIgnoreCase("Marzo")==true         || mes.equals("3")==true)         error=false;
        if (mes.equalsIgnoreCase("Abril")==true         || mes.equals("4")==true)         error=false;
        if (mes.equalsIgnoreCase("Mayo")==true          || mes.equals("5")==true)         error=false;
        if (mes.equalsIgnoreCase("Junio")==true         || mes.equals("6")==true)         error=false;
        if (mes.equalsIgnoreCase("Julio")==true         || mes.equals("7")==true)         error=false;
        if (mes.equalsIgnoreCase("Agosto")==true        || mes.equals("8")==true)         error=false;
        if (mes.equalsIgnoreCase("Septiembre")==true    || mes.equals("9")==true)         error=false;
        if (mes.equalsIgnoreCase("Octubre")==true       || mes.equals("10")==true)        error=false;
        if (mes.equalsIgnoreCase("Noviembre")==true     || mes.equals("11")==true)        error=false;
        if (mes.equalsIgnoreCase("Diciembre")==true     || mes.equals("12")==true)        error=false;
        
        return error;
    }
    
    public static int numMes (String mes)
    {
        int numMes=0;
        
        if (mes.equalsIgnoreCase("Enero")==true         || mes.equals("1")==true)         numMes=1; 
        if (mes.equalsIgnoreCase("Febrero")==true       || mes.equals("2")==true)         numMes=2;
        if (mes.equalsIgnoreCase("Marzo")==true         || mes.equals("3")==true)         numMes=3;
        if (mes.equalsIgnoreCase("Abril")==true         || mes.equals("4")==true)         numMes=4;
        if (mes.equalsIgnoreCase("Mayo")==true          || mes.equals("5")==true)         numMes=5;
        if (mes.equalsIgnoreCase("Junio")==true         || mes.equals("6")==true)         numMes=6;
        if (mes.equalsIgnoreCase("Julio")==true         || mes.equals("7")==true)         numMes=7;
        if (mes.equalsIgnoreCase("Agosto")==true        || mes.equals("8")==true)         numMes=8;
        if (mes.equalsIgnoreCase("Septiembre")==true    || mes.equals("9")==true)         numMes=9;
        if (mes.equalsIgnoreCase("Octubre")==true       || mes.equals("10")==true)        numMes=10;
        if (mes.equalsIgnoreCase("Noviembre")==true     || mes.equals("11")==true)        numMes=11;
        if (mes.equalsIgnoreCase("Diciembre")==true     || mes.equals("12")==true)        numMes=12; 
        
        return numMes;
    }
    
}
