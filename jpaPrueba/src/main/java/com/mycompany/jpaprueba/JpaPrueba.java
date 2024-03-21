
package com.mycompany.jpaprueba;
import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;


public class JpaPrueba {

    public static void main(String[] args) {
        Controladora control =new Controladora();
        //Alumno alu =  new Alumno(01, "luisina", "palmucci", new Date());
        //control.crearAlumno(alu);
        //control.eliminarAlumno(01);
        //alu.setApellido("Grosso");
        //control.editarAlumno(alu);
        
        Alumno alu = control.traerAlumno(15);
        System.out.println("-------------BUSQUEDA INDIVIDUAL-------------");
        System.out.println("El alumno es: " + alu.toString());
        System.out.println("-------------BUSQUEDA GRUPAL-------------");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        for (Alumno al : listaAlumnos) {
            System.out.println("El alumno es: " + al.toString());
        }
    }
}
