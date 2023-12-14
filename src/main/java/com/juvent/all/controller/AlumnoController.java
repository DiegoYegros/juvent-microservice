package com.juvent.all.controller;

import com.juvent.all.model.CalificacionesRequest;
import com.juvent.all.repository.Alumno;
import com.juvent.all.service.AlumnoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/alumno")
public class AlumnoController {
    @Autowired
    AlumnoService service;
    @GetMapping(value = "/{numero_ci}")
    public ResponseEntity<Alumno> alumno(@PathVariable Integer numero_ci){
        return ResponseEntity.ok(service.getInfo(numero_ci));
    }

    @GetMapping(value = "/{numero_ci}/calificaciones")
    public ResponseEntity<Object> calificaciones(@PathVariable Integer numero_ci, @RequestBody CalificacionesRequest calificacionesRequest){
        return ResponseEntity.ok(new Object());
    }
}
