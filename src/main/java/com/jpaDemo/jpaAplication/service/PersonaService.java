package com.jpaDemo.jpaAplication.service;

import com.jpaDemo.jpaAplication.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    private IPersonaRepository personaRepository;
}
