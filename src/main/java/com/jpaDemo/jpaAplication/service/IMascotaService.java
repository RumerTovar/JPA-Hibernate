package com.jpaDemo.jpaAplication.service;

import com.jpaDemo.jpaAplication.model.Mascota;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IMascotaService {

    public List<Mascota> getMascotas();

    public void saveMascota(Mascota mascota);

    public void deleteMascota(Long id_mascota);

    public Mascota findMascota(Long id_mascota);

    public void editMascota(Long id_mascota,
                     String nuevoNombre,
                     String nuevaEspecie,
                     String nuevaRaza,
                     String nuevoColor);
}



