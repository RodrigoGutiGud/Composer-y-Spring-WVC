package mx.unam.aragon.ico.te.gameweb.controladores;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/portal")
public class MainController {

    @GetMapping("/")
    public String index (){
        LoggerFactory.getLogger(MainController.class).info("Estamos en Index");
        return "index";
    }
}
