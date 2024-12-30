package com.jpaDemo.jpaAplication.service;

import com.jpaDemo.jpaAplication.model.Mascota;
import com.jpaDemo.jpaAplication.model.Persona;
import com.jpaDemo.jpaAplication.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MascotaService implements IMascotaService{
    //inyeccion de dependencias
    @Autowired
    private IMascotaRepository repoMascota;

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascotas = repoMascota.findAll();
        return listaMascotas;
    }

    @Override
    public void saveMascota(Mascota mascota) {
        repoMascota.save(mascota);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        repoMascota.deleteById(id_mascota);
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        Mascota mascota = repoMascota.findById(id_mascota).orElse(null);

        return mascota;
    }

    @Override
    public void editMascota(Long id_mascota, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor) {


        //buscamos a quien vamos a modificar
        Mascota mascota = this.findMascota(id_mascota);

        //setiamos los nuevos valores
        mascota.setNombre(nuevoNombre);
        mascota.setEspecie(nuevaEspecie);
        mascota.setRaza(nuevaRaza);
        mascota.setColor(nuevoColor);

        //gaurdamos los cambos
        this.saveMascota(mascota);
    }
}
