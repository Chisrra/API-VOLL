package com.med.voll.chisrra.apivoll.paciente;

import com.med.voll.chisrra.apivoll.entities.Paciente;

public record DatosListaPaciente(String nombre, String email, String telefono) {
    public DatosListaPaciente(Paciente paciente) {
        this(paciente.getNombre(), paciente.getEmail(), paciente.getTelefono());
    }
}
