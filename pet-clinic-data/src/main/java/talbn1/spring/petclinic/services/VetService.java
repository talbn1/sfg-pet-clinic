package talbn1.spring.petclinic.services;

import talbn1.spring.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
    Vet findBylastName(String lastName);

}
