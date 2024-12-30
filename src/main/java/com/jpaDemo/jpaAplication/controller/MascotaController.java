package com.jpaDemo.jpaAplication.controller;

import com.jpaDemo.jpaAplication.model.Mascota;
import com.jpaDemo.jpaAplication.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    //inyeccion de dependencia
    @Autowired
    private IMascotaService mascotaService;

    @PostMapping("/mascota/crear")
    public String crearMascota(@RequestBody Mascota mascota){
        mascotaService.saveMascota(mascota);
        return "La mascota fue creada correctamente";
    }
}
