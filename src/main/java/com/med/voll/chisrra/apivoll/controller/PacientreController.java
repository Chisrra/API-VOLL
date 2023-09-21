package com.med.voll.chisrra.apivoll.controller;

import com.med.voll.chisrra.apivoll.entities.Paciente;
import com.med.voll.chisrra.apivoll.paciente.DatosListaPaciente;
import com.med.voll.chisrra.apivoll.paciente.DatosRegistroPaciente;
import com.med.voll.chisrra.apivoll.paciente.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/pacientes")
public class PacientreController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    public void registrarPaciente(@RequestBody @Valid DatosRegistroPaciente registroPaciente) {
        System.out.println("Todo bien");
        System.out.println(registroPaciente);
        pacienteRepository.save(new Paciente(registroPaciente));
    }

    @GetMapping
    public Page<DatosListaPaciente> obtenerPacientes(@PageableDefault(size = 3, sort = "nombre") Pageable pageable) {
        return pacienteRepository.findAll(pageable).map(DatosListaPaciente::new);
    }
}
