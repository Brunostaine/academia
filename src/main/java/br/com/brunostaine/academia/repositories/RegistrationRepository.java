package br.com.brunostaine.academia.repositories;

import br.com.brunostaine.academia.entities.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
