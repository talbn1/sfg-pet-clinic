package talbn1.spring.petclinic.services;


import talbn1.spring.petclinic.model.Owner;

import java.util.List;


public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
