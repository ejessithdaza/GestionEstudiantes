package presentation;

import entities.Estudiante;
import service.EstudianteService;

import java.util.List;
import java.util.Scanner;

public class EstudianteUI {
    public static void registrarEstudiantes(Scanner sc, EstudianteService estudianteService) {
        System.out.println("========== Registrar Estudiante ==========");
        sc.nextLine();
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el codigo del estudiante");
        String id = sc.nextLine();
        System.out.println("Ingrese la edad del estudiante");
        int edad = sc.nextInt();

        estudianteService.registrarEstudiantes(id, nombre, edad);
        System.out.println("¡Estudiante registrado con éxito!\n");
    }

    public static void listarEstudiantes(EstudianteService estudianteService) {
        System.out.println("========== Lista de Estudiante Registrados ==========");
        List<Estudiante> listaEstudiantes = estudianteService.listarEstudiantes();

        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados");
        } else {
            for (int i = 0; i < listaEstudiantes.size(); i++) {
                Estudiante estudiante = listaEstudiantes.get(i);
                System.out.println("Codigo: " + estudiante.getId() + " | " +
                        "Nombre: " + estudiante.getNombre() + " | " +
                        "Edad: " + estudiante.getEdad());
            }
        }
    }
}
