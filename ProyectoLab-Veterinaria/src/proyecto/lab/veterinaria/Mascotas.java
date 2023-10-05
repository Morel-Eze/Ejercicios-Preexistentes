/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.lab.veterinaria;

import javax.swing.JOptionPane;

/**
 *
 * @author Bit Store TDF
 */
public class Mascotas {
    
    private int code;
    private String name;
    private String species;
    private String race;
    private String birth;
    private String death;
    private boolean vivo;
    
    public void setCode (int code)
    {
        this.code=code;
    }
    
    public int getCode ()
    {
        return code;
    }
    
    public void setName (String name)
    {
        this.name=name;
    }
    
    public String getName ()
    {
        return name;
    }
    
    public void setSpecies (String species)
    {
        this.species=species;
    }
    
    public String getSpecies ()
    {
        return species;
    }
    
    public void setRace (String race)
    {
        this.race=race;
    }
    
    public String getRace ()
    {
        return race;
    }
    
    public void setBirth (String birth)
    {
        this.birth=birth;
    }
    
    public String getBirth ()
    {
        return birth;
    }
    
    public void setDeath (String death)
    {
        this.death=death;
    }
    
    public String getDeath ()
    {
        return death;
    }
    
    public void setVivo (String vivo)
    {
        if (vivo.equalsIgnoreCase("Si")==true || vivo.equalsIgnoreCase("Sí")==true)
        {
            this.vivo=true;
        }
        
        else this.vivo=false;
        
    }
    
    public boolean getVivo()
    {
        return vivo;
    }
    
    public void Mascotas ()
    {
    }
    
    public void Mascotas (int code, String name, String species, String race, String birth, String death)
    {
        this.code=code;
        this.name=name;
        this.species=species;
        this.race=race;
        this.birth=birth;
        this.death=death;
    }
    
    public void showMascota ()
    {
        if (vivo==true) death="Sigue vivo";
        
        JOptionPane.showMessageDialog(null, "Datos de la mascota:\n"+
                                                        "Nombre: "+name+
                                                        "\nCódigo: "+code+
                                                        "\nEspecie: "+species+
                                                        "\nRaza: "+race+
                                                        "\nNacimiento: "+birth+
                                                        "\nFallecimiento: "+death
        );
    }
    
}
