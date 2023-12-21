package com.juvent.all.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juvent.all.model.CalificacionesRequest;
import com.juvent.all.repository.Alumno;
import com.juvent.all.service.AlumnoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/alumno")
@RequiredArgsConstructor
public class AlumnoController {

    final AlumnoService service;

    @GetMapping(value = "/{numero_ci}")
    public ResponseEntity<Alumno> alumno(@PathVariable Integer numeroCi) {
        return ResponseEntity.ok(service.getInfo(numeroCi));
    }

    @GetMapping(value = "/{numero_ci}/calificaciones")
    public ResponseEntity<Object> calificaciones(@PathVariable Integer numeroCi,
            @RequestBody CalificacionesRequest calificacionesRequest) {
        return ResponseEntity.ok(new Object());
    }
}