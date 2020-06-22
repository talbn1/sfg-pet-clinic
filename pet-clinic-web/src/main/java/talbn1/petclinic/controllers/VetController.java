package talbn1.petclinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import talbn1.petclinic.model.Vet;
import talbn1.petclinic.services.VetService;

import java.util.Set;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
    public String listVets(Model model){
        Set<Vet> v = vetService.findAll();
        System.out.println(v.size());
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }




}
