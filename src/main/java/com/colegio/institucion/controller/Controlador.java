package com.colegio.institucion.controller;

import com.colegio.institucion.domain.Estudiante;
import com.colegio.institucion.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class Controlador {

    @Autowired
    private IEstudianteService iEstudianteService;

    @GetMapping
    public List<Estudiante> listar() {
        return iEstudianteService.listarEstudiantes();
    }

    @PostMapping
    public void guardar(@RequestBody Estudiante estudiante) {
        iEstudianteService.guardar(estudiante);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        iEstudianteService.eliminar(id);
    }

    @PutMapping("/{id}")
    public void actualizar(@PathVariable Long id, @RequestBody Estudiante estudianteActualizado) {
        iEstudianteService.actualizar(id, estudianteActualizado);
    }

    @GetMapping("/{id}")
    public Estudiante encontrarPorId(@PathVariable Long id) {
        return iEstudianteService.encontrarEstudiantePorId(id);
    }

    @GetMapping("/grado/{grado}")
    public List<Estudiante> encontrarPorGrado(@PathVariable int grado) {
        return iEstudianteService.encontrarEstudiantesPorGrado(grado);
    }

    @GetMapping("/rango")
    public List<Estudiante> encontrarPorRangoEdad(@RequestParam int edadInicial, @RequestParam int edadFinal) {
        return iEstudianteService.encontrarEstudiantesPorRangoEdad(edadInicial, edadFinal);
    }
}
