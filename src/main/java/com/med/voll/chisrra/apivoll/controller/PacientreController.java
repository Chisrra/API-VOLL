package com.med.voll.chisrra.apivoll.controller;

import com.med.voll.chisrra.apivoll.entities.Paciente;
import com.med.voll.chisrra.apivoll.paciente.DatosRegistroPaciente;
import com.med.voll.chisrra.apivoll.paciente.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacientreController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    public void registrarPaciente(@RequestBody @Valid DatosRegistroPaciente registroPaciente) {
        System.out.println("Todo bien");
        System.out.println(registroPaciente);
        pacienteRepository.save(new Paciente(registroPaciente));
    }
}
