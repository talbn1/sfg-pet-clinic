package talbn1.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import talbn1.petclinic.model.Vet;

/**
 * @author talbn on 6/13/2020
 **/

public interface VetRepository extends CrudRepository<Vet,Long> {
}
