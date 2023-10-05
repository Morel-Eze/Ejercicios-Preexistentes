/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guía.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Bit Store TDF
 */
public class Guía2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Atenciones atenciones [] = new Atenciones [100];
        int k=0;
        
        atenciones[0]=nuevaAtencion(k);
        k++;
        atenciones[0].showAtencion();
                
    }
    
    public static Atenciones nuevaAtencion (int k)
    {
        Atenciones atencion = new Atenciones ();
        Clientes cliente = new Clientes ();
        Fecha fecha = new Fecha ();
        int dia,anio;
        int numMes=0;
        int numMascotas;
        String mes;
        boolean error=true;
        
        atencion.setCodigo(k);
               
                        //INGRESO DATOS CLIENTE
                        
        cliente.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del cliente"));
        cliente.setApellido(JOptionPane.showInputDialog("Ingrese el apellido del cliente"));
        cliente.setDireccion(JOptionPane.showInputDialog("Ingrese la dirección del cliente"));
        do {
            cliente.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el teléfono del cliente")));
            if (cliente.getTelefono()<0)    JOptionPane.showMessageDialog(null, "ERROR. Número de teléfono inválido");
        }   while (cliente.getTelefono()<0); 
        cliente.setCiudad(JOptionPane.showInputDialog("Ingrese la ciudad del cliente"));
        
        
                        //INGRESO DATOS MASCOTAS
        
        do{
            atencion.setNumMascotas(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de mascotas")));
            numMascotas=atencion.getNumMascotas();
        }   while (atencion.getNumMascotas()<0);
        
        Mascotas mascotas[] = new Mascotas [numMascotas];
        Mascotas obj = new Mascotas ();
        
        
        for (int i=0;i<atencion.getNumMascotas();i++)
        {
                                    //VER POR QUE SE ROMPE EN EL VECTOR, DICE VALOR NULL EN MASCOTAS[I] -- Cree variable aparte y despues la volqué en el vector
            obj.setNombre(JOptionPane.showInputDialog("Ingrese el nombre de la mascota"));
            do{
                obj.setEspecie(JOptionPane.showInputDialog("Ingrese la especie de la mascota (perro/gato)"));
            }   while   (obj.getEspecie().equalsIgnoreCase("perro")==false &&
                        obj.getEspecie().equalsIgnoreCase("gato")==false);
            
            do {
                dia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de nacimiento de la mascota"));
                if (dia<=0 || dia>31)    JOptionPane.showMessageDialog(null,"ERROR. Día inválido.");
                
            }   while (dia<=0 || dia>31);
            
            do {
                do{
                    
                    error=true;
                    mes=JOptionPane.showInputDialog("Ingrese el mes de nacimiento de la mascota");
                    
                    error=checkMes(mes);
                    fecha.setNumMes(setMes(mes));
                    
                    if (error==true)    JOptionPane.showMessageDialog(null,"ERROR. Mes inválido.");
                    
                }   while (error==true);
                
                
            }   while (numMes<1 || numMes>12);  
            
            do {
                anio=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento de la mascota"));
                if (anio<2000 || anio>2023)    JOptionPane.showMessageDialog(null,"ERROR. Año inválido.");
                 
            }   while (anio<2000 || anio>2023);
            
            fecha.setDia(dia);
            fecha.setNumMes(numMes);
            fecha.setAnio(anio);
            obj.setNacimiento(fecha);
            obj.setRaza(JOptionPane.showInputDialog("Ingrese la raza de la mascota"));
            //atencion.setMascota(i, obj);
            
            mascotas[i]=obj;
            atencion.setMascota(i, mascotas[i]);
            JOptionPane.showMessageDialog(null, "Paso la vuelta "+(i+1));
            mascotas[i].showMascota();
            
        }
        
                        //INGRESO DATOS FECHA
        
        do {
            fecha.setDia(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de atención")));
            if (fecha.getDia()<=0 || fecha.getDia()>31)    JOptionPane.showMessageDialog(null,"ERROR. Día inválido.");
            
        }   while (fecha.getDia()<=0 || fecha.getDia()>31);

        do {
            do{
                error=true;
                mes=JOptionPane.showInputDialog("Ingrese el mes de atención");

                error=checkMes(mes);
                fecha.setNumMes(setMes(mes));
                
                if (error==true)    JOptionPane.showMessageDialog(null,"ERROR. Mes inválido.");
                
            }   while (error==true);
        }   while (fecha.getNumMes()<1 || fecha.getNumMes()>12);  

        do {
            fecha.setAnio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de atención")));
            if (fecha.getAnio()<2000 || fecha.getAnio()>2023)    JOptionPane.showMessageDialog(null,"ERROR. Año inválido.");
            
        }   while (fecha.getAnio()<2000 || fecha.getAnio()>2023);      
        
        atencion.setCliente(cliente);
        atencion.setFecha(fecha);
                
        atencion.getMascotas(0).showMascota();
        atencion.getMascotas(1).showMascota();
        
        return atencion;
    }
    
    public static boolean checkMes (String mes)
    {
        boolean error=true;
        
        if (mes.equalsIgnoreCase("Enero")==true         || mes.equalsIgnoreCase("1")==true)     {error=false;}
        if (mes.equalsIgnoreCase("Febrero")==true       || mes.equalsIgnoreCase("2")==true)     {error=false;}
        if (mes.equalsIgnoreCase("Marzo")==true         || mes.equalsIgnoreCase("3")==true)     {error=false;}
        if (mes.equalsIgnoreCase("Abril")==true         || mes.equalsIgnoreCase("4")==true)     {error=false;}
        if (mes.equalsIgnoreCase("Mayo")==true          || mes.equalsIgnoreCase("5")==true)     {error=false;}
        if (mes.equalsIgnoreCase("Junio")==true         || mes.equalsIgnoreCase("6")==true)     {error=false;}
        if (mes.equalsIgnoreCase("Julio")==true         || mes.equalsIgnoreCase("7")==true)     {error=false;}
        if (mes.equalsIgnoreCase("Agosto")==true        || mes.equalsIgnoreCase("8")==true)     {error=false;}
        if (mes.equalsIgnoreCase("Septiembre")==true    || mes.equalsIgnoreCase("9")==true)     {error=false;}
        if (mes.equalsIgnoreCase("Octubre")==true       || mes.equalsIgnoreCase("10")==true)    {error=false;}
        if (mes.equalsIgnoreCase("Noviembre")==true     || mes.equalsIgnoreCase("11")==true)    {error=false;}
        if (mes.equalsIgnoreCase("Diciembre")==true     || mes.equalsIgnoreCase("12")==true)    {error=false;}

        return error;
    }
    
    public static int setMes (String mes)
    {
        int meses=0; 
        
        if (mes.equalsIgnoreCase("Enero")==true         || mes.equalsIgnoreCase("1")==true)     {meses=1;}
        if (mes.equalsIgnoreCase("Febrero")==true       || mes.equalsIgnoreCase("2")==true)     {meses=2;}
        if (mes.equalsIgnoreCase("Marzo")==true         || mes.equalsIgnoreCase("3")==true)     {meses=3;}
        if (mes.equalsIgnoreCase("Abril")==true         || mes.equalsIgnoreCase("4")==true)     {meses=4;}
        if (mes.equalsIgnoreCase("Mayo")==true          || mes.equalsIgnoreCase("5")==true)     {meses=5;}
        if (mes.equalsIgnoreCase("Junio")==true         || mes.equalsIgnoreCase("6")==true)     {meses=6;}
        if (mes.equalsIgnoreCase("Julio")==true         || mes.equalsIgnoreCase("7")==true)     {meses=7;}
        if (mes.equalsIgnoreCase("Agosto")==true        || mes.equalsIgnoreCase("8")==true)     {meses=8;}
        if (mes.equalsIgnoreCase("Septiembre")==true    || mes.equalsIgnoreCase("9")==true)     {meses=9;}
        if (mes.equalsIgnoreCase("Octubre")==true       || mes.equalsIgnoreCase("10")==true)    {meses=10;}
        if (mes.equalsIgnoreCase("Noviembre")==true     || mes.equalsIgnoreCase("11")==true)    {meses=11;}
        if (mes.equalsIgnoreCase("Diciembre")==true     || mes.equalsIgnoreCase("12")==true)    {meses=12;}
        
        return meses;
    }
}
