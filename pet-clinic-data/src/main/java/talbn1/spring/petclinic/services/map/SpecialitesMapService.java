package talbn1.spring.petclinic.services.map;

import talbn1.spring.petclinic.model.Specialty;
import talbn1.spring.petclinic.services.SpecialitesService;

import java.util.Set;

public class SpecialitesMapService extends AbstractMapService<Specialty,Long> implements SpecialitesService {
    @Override
    public Set<Specialty> findAll() {
         return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}
