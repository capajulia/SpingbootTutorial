package caparrella.dam.projectewebsb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class ServerController {

    // mètode que mostra informació sobre el servidor
    // Endpoint: /info
    // Nom del mètode: info()
    // Nom del fitxer HTML: info.html

    @GetMapping("/info")   // Definició de l'endpoint /info per a GET
    public String info() {
        return "info.html";
    }

    // mètode que rep un paràmetre de tipus Model i retorna un String amb el contingut de l'html
    // Endpoint: /tinfo
    // Nom del mètode: tinfo()
    // Nom del fitxer HTML: tinfo.html

    @GetMapping("/tinfo")
    public String tinfo(Model model) {
        model.addAttribute("title", "Informació");
        model.addAttribute("message", "Servidor actiu");
        model.addAttribute("ip", "192.168.1.35");
        return "tinfo.html";
    }

    // Endpoint: /tminfo
    // Nom del mètode: tminfo()
    // Nom del fitxer HTML: tinfo.html    // podem retornar la mateixa pàgina que abans
    @GetMapping("/tminfo")
    public String tminfo(Map<String, String> model) {
        model.put("title", "Informació");
        model.put("message", "Servidor actiu");
        model.put("ip", "192.168.1.35");
        return "tinfo.html";
    }
}
