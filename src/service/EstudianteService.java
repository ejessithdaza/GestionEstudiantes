package service;

import dao.EstudianteDAO;
import entities.Estudiante;

import java.util.List;

public class EstudianteService {
    EstudianteDAO EstudianteDAO = new EstudianteDAO();

    public void registrarEstudiantes(String id, String nombre, int edad) {
        Estudiante nuevoEstudiante = new Estudiante(id, nombre, edad);
        EstudianteDAO.guardar(nuevoEstudiante);
    }

    public List<Estudiante> listarEstudiantes() {
        return EstudianteDAO.obtenerTodos();
    }
}