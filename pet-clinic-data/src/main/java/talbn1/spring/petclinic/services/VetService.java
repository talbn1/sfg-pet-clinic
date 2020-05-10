package talbn1.spring.petclinic.services;

import org.springframework.stereotype.Service;
import talbn1.spring.petclinic.model.Vet;

@Service
public interface VetService extends CrudService<Vet, Long>{

    Vet findBylastName(String lastName);

}
