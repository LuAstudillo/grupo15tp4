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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.nroLegajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return this.nroLegajo == other.nroLegajo;
    }
    
}
