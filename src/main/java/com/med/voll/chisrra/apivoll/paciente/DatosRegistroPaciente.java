package com.med.voll.chisrra.apivoll.paciente;

import com.med.voll.chisrra.apivoll.base.DatosDireccion;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroPaciente(
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefono,
        @NotNull
        DatosDireccion direccion
) {}
