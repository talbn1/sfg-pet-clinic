package talbn1.spring.petclinic.services;

import org.springframework.stereotype.Service;
import talbn1.spring.petclinic.model.Owner;

import java.util.List;


@Service
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findBylastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
