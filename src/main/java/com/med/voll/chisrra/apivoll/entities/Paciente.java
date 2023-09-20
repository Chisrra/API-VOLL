package com.med.voll.chisrra.apivoll.entities;

import com.med.voll.chisrra.apivoll.paciente.DatosRegistroPaciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Paciente")
@Table(name = "paciente")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String telefono;
    @Embedded
    private Direccion direccion;

    public Paciente(DatosRegistroPaciente registroPaciente) {
        this.nombre = registroPaciente.nombre();
        this.email = registroPaciente.email();
        this.telefono = registroPaciente.telefono();
        this.direccion = new Direccion(registroPaciente.direccion());
    }
}
