package talbn1.spring.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import talbn1.spring.petclinic.model.Visit;

/**
 * @author talbn on 6/13/2020
 **/

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
