package talbn1.spring.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import talbn1.spring.petclinic.model.Speciality;

/**
 * @author talbn on 6/13/2020
 **/

public interface SpecialtyRepository extends CrudRepository<Speciality,Long> {
}
