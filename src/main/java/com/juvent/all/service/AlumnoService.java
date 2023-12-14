package com.juvent.all.service;
import com.juvent.all.repository.Alumno;
import org.springframework.stereotype.Service;

@Service
public class AlumnoService {

    public Alumno getInfo(Integer ci){
        Alumno alumno = new Alumno();
        return alumno;
    }
}
