package talbn1.spring.petclinic.services;

import talbn1.spring.petclinic.model.Vet;

import java.util.Set;

public interface VetService extends CrudService<Vet, Long>{

    Vet findBylastName(String lastName);

}
