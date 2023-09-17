package com.med.voll.chisrra.apivoll.entities;

import com.med.voll.chisrra.apivoll.medico.DatosRegistroMedico;
import com.med.voll.chisrra.apivoll.medico.Especialidad;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Medico")
@Table(name = "medico")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String telefono;
    private String documento;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    @Embedded
    private Direccion direccion;

    public Medico(DatosRegistroMedico registroMedico) {
        this.nombre = registroMedico.nombre();
        this.email = registroMedico.email();
        this.telefono = registroMedico.telefono();
        this.documento = registroMedico.documento();
        this.especialidad = registroMedico.especialidad();
        this.direccion = new Direccion(registroMedico.direccion());
    }
}
