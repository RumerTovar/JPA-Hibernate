package com.jpaDemo.jpaAplication.service;

import com.jpaDemo.jpaAplication.model.Persona;
import java.util.List;

public interface IPersonaService {

    //metodo para traer todas las personas
     List<Persona> getPersonas();

    //metodo para dar de alta una persona
     void savePersona(Persona persona);

    //metodo para borrar una persona
     void deletePersona(Long id);

    //metodo para encontrar una persona
     Persona findPersona(Long id);

     void editPersona(Long id_original,
                            String nuevoNombre, String nuevoApellido,
                            int nuevaEdad);

    void editPersona(Persona persona);
}
