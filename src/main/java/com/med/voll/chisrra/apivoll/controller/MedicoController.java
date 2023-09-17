package com.med.voll.chisrra.apivoll.controller;

import com.med.voll.chisrra.apivoll.entities.Medico;
import com.med.voll.chisrra.apivoll.medico.DatosRegistroMedico;
import com.med.voll.chisrra.apivoll.medico.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository medicoRepository;

    @PostMapping
    public  void registratMedico(@RequestBody @Valid DatosRegistroMedico registroMedico) {
        System.out.println("Todo chido");
        medicoRepository.save(new Medico(registroMedico));
    }
}
