package com.med.voll.chisrra.apivoll.controller;

import com.med.voll.chisrra.apivoll.entities.Medico;
import com.med.voll.chisrra.apivoll.medico.DatosListaMedico;
import com.med.voll.chisrra.apivoll.medico.DatosRegistroMedico;
import com.med.voll.chisrra.apivoll.medico.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping
    public Page<DatosListaMedico> obtenerMedicos(@PageableDefault(size = 3, sort = "nombre") Pageable paginacion) {
        return medicoRepository.findAll(paginacion).map(DatosListaMedico::new);
    }
}
