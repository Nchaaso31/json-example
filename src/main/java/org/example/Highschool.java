package org.example;

import java.util.List;

public class Highschool {
    private String nombre;
    private List<Student> estudiantes;



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Student> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Student> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Highschool{" +
                "nombre='" + nombre + '\'' +
                ", estudiantes=" + estudiantes +
                '}';
    }
}
