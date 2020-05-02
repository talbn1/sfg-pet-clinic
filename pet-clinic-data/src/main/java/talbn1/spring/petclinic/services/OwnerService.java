package talbn1.spring.petclinic.services;

import talbn1.spring.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findBylastName(String lastName);
}
