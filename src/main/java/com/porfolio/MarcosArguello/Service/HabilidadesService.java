package com.porfolio.MarcosArguello.Service;

import com.porfolio.MarcosArguello.Entity.Habilidades;
import com.porfolio.MarcosArguello.Repository.IHabilidadesRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HabilidadesService {

    @Autowired
    IHabilidadesRepository iHabilidadesRepository;

    public List<Habilidades> list() {
        return iHabilidadesRepository.findAll();
    }

    public Optional<Habilidades> getOne(int id) {
        return iHabilidadesRepository.findById(id);
    }

    public Optional<Habilidades> getByNombre(String nombre) {
        return iHabilidadesRepository.findByNombre(nombre);
    }

    public void save(Habilidades skill) {
        iHabilidadesRepository.save(skill);
    }

    public void delete(int id) {
        iHabilidadesRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return iHabilidadesRepository.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return iHabilidadesRepository.existsByNombre(nombre);
    }
}
