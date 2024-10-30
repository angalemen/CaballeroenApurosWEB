package com.bd.caballeroenapuros.Controladores;

import com.bd.caballeroenapuros.Entidades.Jugador;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://snazzy-otter-3796ba.netlify.app/")
public class JugadorController {

    @GetMapping("/jugadores")
    public Jugador getJugador() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/resources/static/datos.json");
        return mapper.readValue(file, Jugador.class);
    }

    @PostMapping("/jugadores")
    public void saveJugador(@RequestBody Jugador jugador) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/resources/static/datos.json");
        mapper.writeValue(file, jugador);
    }

}