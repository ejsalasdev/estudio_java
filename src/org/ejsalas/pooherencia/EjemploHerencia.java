package org.ejsalas.pooherencia;

public class EjemploHerencia {

    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        alumno.setNombre("Edgar");
        alumno.setApellido("Salas");

        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor " + profesor.getAsignatura()
        + ": " + profesor.getNombre()
        + " " + alumno.getApellido());


    }
}
