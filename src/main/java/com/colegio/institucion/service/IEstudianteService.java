package com.colegio.institucion.service;

import com.colegio.institucion.domain.Estudiante;

import java.util.List;

public interface IEstudianteService {

    List<Estudiante> listarEstudiantes();

    void guardar(Estudiante estudiante);

    void eliminar(Long id);

    void actualizar(Long id, Estudiante estudianteActualizado);

    Estudiante encontrarEstudiantePorId(Long id);

    List<Estudiante> encontrarEstudiantesPorGrado(int grado);

    List<Estudiante> encontrarEstudiantesPorRangoEdad(int edadInicial, int edadFinal);
}
