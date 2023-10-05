/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.lab.alumnos;
import javax.swing.JOptionPane;

/**
 *
 * @author Bit Store TDF
 */
public class ProyectoLabAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        String Opcion,Mod;
        Alumno alumnos[]= new Alumno[100];
        int i=0;
        int k=0;
        int op;
        
        /*for (i=0;i<alumnos.length;i++)
        {
            alumnos[i].setLegajo(0);
            alumnos[i].setNombre("");
            alumnos[i].setAñoIngreso(0);
            alumnos[i].setDireccion("");
            alumnos[i].setDni(0);
            alumnos[i].setEmail("");
            alumnos[i].setEgresado("");
        }
        */
        do {
            alumnos[i]=registrarAlumno();
            alumnos[i].showAlumno();
            Mod=JOptionPane.showInputDialog("¿Desea realizar alguna modificación?");
            
            while (Mod.compareToIgnoreCase("Si")!=0 && Mod.compareToIgnoreCase("Sí")!=0 && Mod.compareToIgnoreCase("No")!=0)
            {
                Mod=JOptionPane.showInputDialog(null, "Por favor, ingrese una opción válida.");
                        
                while (Mod.compareToIgnoreCase("Sí") ==0 || Mod.compareToIgnoreCase("Si")==0)  
                {
                    alumnos[i].modAlumno();
                    alumnos[i].showAlumno();
                    Mod=JOptionPane.showInputDialog("¿Desea realizar alguna modificación?");
                }
            }
            
            Opcion=JOptionPane.showInputDialog("¿Desea agregar otro alumno? ");
            
            while (Opcion.compareToIgnoreCase("Si")!=0 && Opcion.compareToIgnoreCase("Sí")!=0 && Opcion.compareToIgnoreCase("No")!=0)
            {
                Opcion=JOptionPane.showInputDialog(null, "Por favor, ingrese una opción válida.");
            }
            
            i++;
            k++;
            
        }   while (Opcion.compareToIgnoreCase("Si")==0 ||Opcion.compareToIgnoreCase("Sí")==0);
        
        op=menu();
        while (op!=6)
        {
            switch (op)
            {
                case 1:

                    listAñoActual(alumnos,k);
                    break;

                case 2:

                    listAntiguedad(alumnos,k);
                    break;

                case 3:

                    ordenarPorDni(alumnos,k);
                    break;

                case 4:

                    noEgresados(alumnos,k);
                    break;

                case 5: 

                    busquedaAlumno(alumnos,k);
                    break;

            }
            
            op=menu();
        }
    }
    
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
        public static Alumno registrarAlumno()
        {         
            int leg=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el legajo: "));
            String nya=JOptionPane.showInputDialog("Ingrese el apellido y nombre del alumno: ");
            String dire=JOptionPane.showInputDialog("Ingrese la dirección del alumno: ");
            int dni=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni del alumno: "));
            int añoIngreso=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de ingreso del alumno: "));
            String email=JOptionPane.showInputDialog("Ingrese el email del alumno: ");
            String egresado=JOptionPane.showInputDialog("¿Es egresado del secundario? ");

            boolean egre=true;

            while (egresado.compareToIgnoreCase("Si")!=0 && egresado.compareToIgnoreCase("Sí")!=0 && egresado.compareToIgnoreCase("No")!=0)
            {
                egresado=JOptionPane.showInputDialog("Por favor, ingrese 'Sí' o 'No'. ");
            }

            if (egresado.compareToIgnoreCase("Si")==0 || egresado.compareToIgnoreCase("Sí")==0)     egre=true;
            if (egresado.compareToIgnoreCase("No")==0)                                                  egre=false;
            
            Alumno a1 = new Alumno(leg,nya,dire,dni,añoIngreso,email,egre);
            //(int leg, String nya, String dire, int dni, String email, boolean egre)
            return a1;
        }
        
        public static int menu ()
        {
            int op=-1;
            
            while (op<0 || op>6)
            {
                op=Integer.parseInt(JOptionPane.showInputDialog(  "\n\t Menú de opciones"+
                                                                    "\n\n1 - Listado de Alumnos que ingresaron el año actual"+
                                                                    "\n2 - Listado de alumnos que ingresaron hace 5 años"+
                                                                    "\n3 - Listado ordenado de alumnos por dni"+
                                                                    "\n4 - Listado de alumnos que NO han egresado del secundario"+
                                                                    "\n5 - Búsqueda de un alumno por su nombre y apellido"+
                                                                    "\n6 - SALIR"));
                if (op<0 || op>6)   JOptionPane.showMessageDialog(null,"Por favor, ingrese una opción válida");
            }      
            
            return op;
        }
        
        public static void listAñoActual (Alumno[] alumnos, int k)
        {
            String mensaje="Listado de alumnos que ingresaron el año actual (2023)";
            
            String mensaje1="Legajo         Nombre y apellido           Domicilio           DNI             Email                           ¿Egresado?";
            String mensaje2="";
            
            for (int i=0; i<k;i++)
            {
                if (alumnos[i].getAñoIngreso()==2023)   //mensaje=mensaje+alumnos[i];
                {
                   /*mensaje2=mensaje2+
                   "\n"+alumnos[i].getLegajo()+"          "+alumnos[i].getNombre()+"             "+alumnos[i].getDomicilio()+"       "+alumnos[i].getDni()+"     "+alumnos[i].getEmail()+"       "+alumnos[i].getEgresado(); 
                    */
                    mensaje=mensaje + "\n\nLegajo: "                    +alumnos[i].getLegajo()+ 
                                      "\nNombre y Apellido: "           +alumnos[i].getNombre()+
                                      "\nDomicilio: "                   +alumnos[i].getDomicilio()+ 
                                      "\nDNI: "                         +alumnos[i].getDni()+
                                      "\nEmail: "                       +alumnos[i].getEmail()+
                                      "\n¿Es egresado del secundario? " +alumnos[i].getEgresado();
                    
                }
            }
            
            JOptionPane.showMessageDialog(null, mensaje);
            //JOptionPane.showMessageDialog(null,mensaje1+mensaje2);   
        }
        
        public static void listAntiguedad (Alumno[] alumnos, int k)
        {
            String mensaje = "Listado de alumnos que ingresaron hace 5 años";
            
            for (int i=0; i<alumnos.length;i++)
            {
                if (2023-alumnos[i].getAñoIngreso()==5)
                {
                    mensaje=mensaje + "\n\nLegajo: "                    +alumnos[i].getLegajo()+ 
                                      "\nNombre y Apellido: "           +alumnos[i].getNombre()+
                                      "\nDomicilio: "                   +alumnos[i].getDomicilio()+ 
                                      "\nDNI: "                         +alumnos[i].getDni()+
                                      "\nEmail: "                       +alumnos[i].getEmail()+
                                      "\n¿Es egresado del secundario? " +alumnos[i].getEgresado();                   
                }
            }
            
            JOptionPane.showMessageDialog(null, mensaje);
        }
        
        public static void ordenarPorDni (Alumno[] alumnos, int k)
        {
            String mensaje = "Listado de alumnos en orden ascendente por dni";
            
            Alumno aux;
            
            for (int i=0;i<alumnos.length-1;i++)
            {
                for (int j=i+1;j<alumnos.length;j++)
                {
                    if (alumnos[i].getDni()>alumnos[j].getDni())
                    {
                        aux=alumnos[i];
                        alumnos[i]=alumnos[j];
                        alumnos[j]=aux;
                    }
                }
            }
            
            for (int i=0;i<alumnos.length;i++)
            {
                    mensaje=mensaje + 
                                      "\nDNI: "                         +alumnos[i].getDni()+
                                      "\n\nLegajo: "                    +alumnos[i].getLegajo()+ 
                                      "\nNombre y Apellido: "           +alumnos[i].getNombre()+
                                      "\nDomicilio: "                   +alumnos[i].getDomicilio()+ 
                                      "\nEmail: "                       +alumnos[i].getEmail()+
                                      "\n¿Es egresado del secundario? " +alumnos[i].getEgresado();                
            }
            
            JOptionPane.showMessageDialog(null, mensaje);
        }
        
        public static void noEgresados (Alumno[] alumnos, int k)
        {
            String mensaje = "Listado de alumnos NO egresados del secundario";
            
            for (int i=0; i<alumnos.length;i++)
            {
                if (alumnos[i].getEgresado().compareToIgnoreCase("no")==0)
                {
                    mensaje=mensaje + "\n\nLegajo: "                    +alumnos[i].getLegajo()+ 
                                      "\nNombre y Apellido: "           +alumnos[i].getNombre()+
                                      "\nDomicilio: "                   +alumnos[i].getDomicilio()+ 
                                      "\nDNI: "                         +alumnos[i].getDni()+
                                      "\nEmail: "                       +alumnos[i].getEmail();
                                      //"\n¿Es egresado del secundario? " +alumnos[i].getEgresado();                   
                }
            }
            
            JOptionPane.showMessageDialog(null, mensaje);
        }
        
        public static void busquedaAlumno (Alumno[] alumnos, int k)
        {
            String busqueda=JOptionPane.showInputDialog("Ingrese el nombre y apellido del alumno a buscar");
            String mensaje="Datos del alumno";
                    
            for (int i=0; i<alumnos.length; i++)
            {
                if (alumnos[i].getNombre().compareToIgnoreCase(busqueda)==0)
                {
                    mensaje=mensaje + "\n\nLegajo: "                    +alumnos[i].getLegajo()+ 
                                      "\nNombre y Apellido: "           +alumnos[i].getNombre()+
                                      "\nDomicilio: "                   +alumnos[i].getDomicilio()+ 
                                      "\nDNI: "                         +alumnos[i].getDni()+
                                      "\nEmail: "                       +alumnos[i].getEmail()+
                                      "\n¿Es egresado del secundario? " +alumnos[i].getEgresado();                      
                }
            }
            
            JOptionPane.showMessageDialog(null,mensaje);
        }
        
}
