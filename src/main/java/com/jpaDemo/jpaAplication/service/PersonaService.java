package com.jpaDemo.jpaAplication.service;

import com.jpaDemo.jpaAplication.model.Persona;
import com.jpaDemo.jpaAplication.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{
    //inyeccion de dependencia mediante @autowired
    @Autowired
    private IPersonaRepository personaRepository;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = personaRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = personaRepository.findById(id).orElse(null);
        return persona;
    }

    @Override
    public void editPersona(Long idOriginal, Long nuevaId,
                            String nuevoNombre, String nuevoApellido,
                            int nuevaEdad) {
        //se utiliza this porque llamamos al mismo metodo findPersona de esta clase
        Persona persona = this.findPersona(idOriginal);
        persona.setId(nuevaId);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setEdad(nuevaEdad);

        //se utiliza this porque llamamos al mismo metodo savepersona de esta clase
        this.savePersona(persona);
    }


}
