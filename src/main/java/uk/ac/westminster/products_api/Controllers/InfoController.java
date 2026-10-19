package uk.ac.westminster.products_api.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/info")
    public String info(){return "This is a API made using Spring boot.";}
}
