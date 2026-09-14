package tp4;

import java.util.HashSet;

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
    
    
    private HashSet<Materia> materias = new HashSet<>();

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public int cantidadMaterias() {
        return materias.size();
    }
}
