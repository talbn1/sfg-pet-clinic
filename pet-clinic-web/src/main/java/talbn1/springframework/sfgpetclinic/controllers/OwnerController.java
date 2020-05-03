package talbn1.springframework.sfgpetclinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {

    @RequestMapping({"/owners", "/owner/index", "owner/index.html"})
    public String getOwnersList(){
        return "/owner/index";
    }
}
