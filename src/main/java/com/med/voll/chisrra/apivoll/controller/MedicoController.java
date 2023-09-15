package com.med.voll.chisrra.apivoll.controller;

import com.med.voll.chisrra.apivoll.medico.DatosRegistroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @PostMapping
    public  void registratMedico(@RequestBody DatosRegistroMedico registroMedico) {
        System.out.println("Todo chido");
        System.out.println(registroMedico);
    }
}
