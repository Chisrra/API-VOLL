package com.med.voll.chisrra.apivoll.medico;

import com.med.voll.chisrra.apivoll.entities.Medico;

public record DatosListaMedico(String nombre, String especialidad, String documento, String email) {

    public DatosListaMedico(Medico medico) {
        this(medico.getNombre(), medico.getEspecialidad().toString(), medico.getDocumento(), medico.getEmail());
    }
}
