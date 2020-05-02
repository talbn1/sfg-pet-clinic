package talbn1.spring.petclinic.services;

import talbn1.spring.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
    Owner findBylastName(String lastName);


}
