package com.jpaDemo.jpaAplication.controller;
import com.jpaDemo.jpaAplication.model.Persona;
import com.jpaDemo.jpaAplication.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private IPersonaService interfacePersona;

    @GetMapping("/personas")
    public List<Persona> getPersonas(){
        return interfacePersona.getPersonas();
    }

    @PostMapping("/persona/crear")
    public String createStudent(@RequestBody Persona persona){
        interfacePersona.savePersona(persona);
        //devuelve un string indicando que la persona se creo correctamente
        return "La persona fue creada correctamente";
    }

    @DeleteMapping("/persona/borrar/{id}")
    public String deletePersona(@PathVariable Long id){

        interfacePersona.deletePersona(id);
        return "la persona fue eliminada correctamente";
    }
    //endpoint para modificar una persona
    @PutMapping("/persona/editar/{id_original}")
    public Persona editarPersona(@PathVariable Long id_original,
                                 @RequestParam(required = false, name = "nombre")String nuevoNombre,
                                 @RequestParam(required = false, name = "apellido")String nuevoApellido,
                                 @RequestParam(required = false, name = "edad")int nuevaEdad){

        //envio nuevos datos para modificar
        interfacePersona.editPersona(id_original, nuevoNombre, nuevoApellido, nuevaEdad);

        Persona persona = interfacePersona.findPersona(id_original);

        return persona;
    }

    @PutMapping("/personas/editar")
    public Persona editPersona(@RequestBody Persona persona){
        interfacePersona.editPersona(persona);

        return interfacePersona.findPersona(persona.getId());
    }
}
