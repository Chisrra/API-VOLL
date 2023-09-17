package com.med.voll.chisrra.apivoll.medico;

import com.med.voll.chisrra.apivoll.entities.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
