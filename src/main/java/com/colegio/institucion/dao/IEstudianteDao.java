package com.colegio.institucion.dao;

import com.colegio.institucion.domain.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEstudianteDao extends JpaRepository<Estudiante, Long> {

    List<Estudiante> findByGrado(int grado);

    List<Estudiante> findByEdadBetween(int edadInicial, int edadFinal);
}
