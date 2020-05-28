package talbn1.spring.petclinic.model.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import talbn1.spring.petclinic.model.*;
import talbn1.spring.petclinic.services.OwnerService;
import talbn1.spring.petclinic.services.PetTypeService;
import talbn1.spring.petclinic.services.SpecialtyService;
import talbn1.spring.petclinic.services.VetService;


@Component
public class DataLoader implements CommandLineRunner  {


    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }


    @Override
    public void run(String... args) throws Exception {
        int cout = petTypeService.findAll().size();
        if(cout == 0){
            loadData();
        }
    }

    private void loadData() {


        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        PetType savedCatType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("radiology");
        Speciality savedradiology = specialtyService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("surgery");
        Speciality savedSurgery = specialtyService.save(surgery);

        Speciality dentestry = new Speciality();
        dentestry.setDescription("dentestry");
        Speciality savedentestry = specialtyService.save(dentestry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("122 Moav");
        owner1.setCity("Arad");
        owner1.setTelephpne("123456789");
        Pet p1 = new Pet();
        p1.setPetType(savedDogType);
        p1.setOwner(owner1);
        p1.setName("lasi");
        owner1.getPets().add(p1);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("331 Moav");
        owner2.setCity("Beer Sheva");
        owner2.setTelephpne("123444444");
        Pet p2 = new Pet();
        p2.setPetType(savedCatType);
        p2.setOwner(owner2);
        p2.setName("mitsi");
        owner2.getPets().add(p2);

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedradiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(savedSurgery);

        vetService.save(vet2);
    }





}
