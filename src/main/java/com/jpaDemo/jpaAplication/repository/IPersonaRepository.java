package com.jpaDemo.jpaAplication.repository;

import com.jpaDemo.jpaAplication.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
}
