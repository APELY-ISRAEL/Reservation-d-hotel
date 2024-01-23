package projet.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projet.web.models.Personne;
import projet.web.repository.PersonneRepository;
import projet.web.service.PersonneService;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class PersonneServiceImpl implements PersonneService {
    private PersonneRepository personneRepository;
    @Autowired
    public PersonneServiceImpl(PersonneRepository personneRepository){
        this.personneRepository = personneRepository;
    }

    @Override
    public List<Personne> findAllPersonne() {
        List<Personne> personnes = personneRepository.findAll();
            return personneRepository.findAll();
        }

    @Override
    public Personne savePersonne(Personne personne) {
        return personneRepository.save(personne);
    }
}





