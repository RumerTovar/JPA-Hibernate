package com.jpaDemo.jpaAplication.service;

import com.jpaDemo.jpaAplication.model.Mascota;

import java.util.List;

public interface IMascotaService {

    List<Mascota> getMascotas();

    void saveMascota(Mascota mascota);

    void deleteMascota(Long id_mascota);

    Mascota findMascota(Long id_mascota);

    void editMascota(Long id_mascota,
                     String nuevoNombre,
                     String nuevaEspecie,
                     String nuevaRaza,
                     String nuevoColor);
}



