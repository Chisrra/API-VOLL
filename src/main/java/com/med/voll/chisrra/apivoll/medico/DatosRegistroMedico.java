package com.med.voll.chisrra.apivoll.medico;

import com.med.voll.chisrra.apivoll.base.DatosDireccion;

public record DatosRegistroMedico(String nombre, String email, String documento, Especialidad especialidad, DatosDireccion direccion) {
}
