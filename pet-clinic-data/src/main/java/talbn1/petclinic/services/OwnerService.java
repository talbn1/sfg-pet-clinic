package talbn1.petclinic.services;


import talbn1.petclinic.model.Owner;

import java.util.List;


public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
