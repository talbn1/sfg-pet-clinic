package talbn1.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import talbn1.petclinic.model.PetType;

/**
 * @author talbn on 6/13/2020
 **/

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
