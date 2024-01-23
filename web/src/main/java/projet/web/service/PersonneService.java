package projet.web.service;

import projet.web.models.Personne;

import java.util.List;

public interface PersonneService {
    List<Personne> findAllPersonne();
    Personne savePersonne(Personne personne);
}
