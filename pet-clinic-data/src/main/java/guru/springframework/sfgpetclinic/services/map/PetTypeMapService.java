package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetTypeMapService extends  AbstractMapService<PetType, Long>
        implements PetTypeService {


    @Override
    Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    PetType findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    void delete(PetType object) {
        super.delete(object);
    }
}
