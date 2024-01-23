package projet.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projet.web.models.Personne;

import java.util.Optional;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
    Optional<Personne> findByNom(String nom);

}
