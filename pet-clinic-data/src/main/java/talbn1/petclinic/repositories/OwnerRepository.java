package talbn1.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import talbn1.petclinic.model.Owner;

import java.util.List;

/**
 * @author talbn on 6/13/2020
 **/
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
