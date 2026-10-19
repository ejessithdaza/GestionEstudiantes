import presentation.EstudianteUI;
import service.EstudianteService;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);

        EstudianteService estudianteService = new EstudianteService();

        do {
            System.out.println("\n========== Menu Estudiantes ==========");
            System.out.println("1. Registrar Estudiantes");
            System.out.println("2. Listar Estudiantes");
            System.out.println("3. Modificar registro del Estudiante");
            System.out.println("4. Eliminar registro del Estudiante");
            System.out.println("5. Salir del menu");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    EstudianteUI.registrarEstudiantes(sc, estudianteService);
                    break;

                case 2:
                    EstudianteUI.listarEstudiantes(estudianteService);
                    break;

                case 3:
                    System.out.println("Opcion 3 Selecionada");
                    break;

                case 4:
                    System.out.println("Opcion 4 Selecionada");
                    break;

                case 5:
                    System.out.println("Saliendo del menu...");
                    break;

                default:
                    System.out.println("Opcion inavlida. Intente nuevamente");
            }
        } while(opcion != 5);
        sc.close();
    }
}