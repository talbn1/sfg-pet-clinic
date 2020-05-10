package talbn1.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import talbn1.spring.petclinic.services.OwnerService;
import talbn1.spring.petclinic.services.VetService;


@Component
public class DataLoader implements CommandLineRunner  {


    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {

    }
}
