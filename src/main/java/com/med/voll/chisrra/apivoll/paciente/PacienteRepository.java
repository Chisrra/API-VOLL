package com.med.voll.chisrra.apivoll.paciente;

import com.med.voll.chisrra.apivoll.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
