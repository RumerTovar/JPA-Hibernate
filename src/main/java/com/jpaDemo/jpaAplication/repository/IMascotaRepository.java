package com.jpaDemo.jpaAplication.repository;

import com.jpaDemo.jpaAplication.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
}
