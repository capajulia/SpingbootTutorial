package caparrella.dam.projecterestsb.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ServiceRestController {

    // mètode que retorna dades del servidor en format JSON (un map on les claus són els atributs del JSON que s'ha de crear)
    // Endpoint: /api/info
    // Mètode: info()
    // no es crea cap fitxer, no retorna cap HTML. les dades es consumeixen al client (a qui invoca aquest servei web)
    @GetMapping("api/info")
    @CrossOrigin(origins = "*")  // acceptem peticions de qualsevol origen (és públic)
    public Map<String, String> info() {
        Map<String, String> data = new HashMap<>();
        data.put("title", "Informació RestAPI");
        data.put("message", "Servidor RestAPI actiu");
        data.put("ip", "192.168.1.35");

        return data;
        }
    }
