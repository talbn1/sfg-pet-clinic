package talbn1.spring.petclinic.model.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import talbn1.spring.petclinic.services.OwnerService;


@Controller
public class OwnerController {


    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/owners", "/owner/index", "owner/index.html"})
    public String getOwnersList(Model model){
        System.out.println("check Own Controller");

        model.addAttribute("owners", ownerService.findAll());

        return "/owners/ownersList";
    }
}
