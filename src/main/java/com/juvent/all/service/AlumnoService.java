package com.juvent.all.service;

import org.springframework.stereotype.Service;

import com.juvent.all.repository.Alumno;

@Service
public class AlumnoService {

    public Alumno getInfo(Integer ci) {
        Alumno alumno = new Alumno();
        return alumno;
    }
}
