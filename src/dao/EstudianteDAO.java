package dao;

import entities.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    private List<Estudiante> listaEstudiantes = new ArrayList<>();

    public void guardar(Estudiante nuevoEstudiante) {
        listaEstudiantes.add(nuevoEstudiante);
    }

    public List<Estudiante> obtenerTodos() {
        return listaEstudiantes;
    }
}

// String[] frutas = [3]
// String[] frutas = ["Manzana", "Pera", "Uva"]