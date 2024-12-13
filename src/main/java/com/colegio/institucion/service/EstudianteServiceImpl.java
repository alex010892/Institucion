package com.colegio.institucion.service;

import com.colegio.institucion.dao.IEstudianteDao;
import com.colegio.institucion.domain.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public List<Estudiante> listarEstudiantes() {
        return estudianteDao.findAll();
    }

    @Override
    public void guardar(Estudiante estudiante) {
        estudianteDao.save(estudiante);
    }

    @Override
    public void eliminar(Long id) {
        estudianteDao.deleteById(id);
    }

    @Override
    public void actualizar(Long id, Estudiante estudianteActualizado) {
        Estudiante estudianteExistente = estudianteDao.findById(id).orElse(null);
        if (estudianteExistente != null) {
            estudianteExistente.setNombre(estudianteActualizado.getNombre());
            estudianteExistente.setFechaNacimiento(estudianteActualizado.getFechaNacimiento());
            estudianteExistente.setGrado(estudianteActualizado.getGrado());
            estudianteExistente.setEdad(estudianteActualizado.getEdad());
            estudianteDao.save(estudianteExistente);
        }

    }

    @Override
    public Estudiante encontrarEstudiantePorId(Long id) {
        return estudianteDao.findById(id).orElse(null);
    }

    @Override
    public List<Estudiante> encontrarEstudiantesPorGrado(int grado) {
        return estudianteDao.findByGrado(grado);
    }

    @Override
    public List<Estudiante> encontrarEstudiantesPorRangoEdad(int edadInicial, int edadFinal) {
        return estudianteDao.findByEdadBetween(edadInicial, edadFinal);
    }
}
