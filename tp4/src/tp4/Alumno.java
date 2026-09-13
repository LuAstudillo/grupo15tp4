/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4;

import java.util.HashSet;

/**
 *
 * @author Luly2
 */
public class Alumno {
    private int nroLegajo;
    private String Apellido;
    private String Nombre;

    public Alumno(int nroLegajo, String Apellido, String Nombre) {
        this.nroLegajo = nroLegajo;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public HashSet<Materia> getMaterias() {
        return materias;
    }
    
    
    
    private HashSet<Materia> materias;
    

public void agregarMateria(Materia materia){
    materias.add(materia);
}
public int cantidadMaterias(){
    return materias.size();
}
}
