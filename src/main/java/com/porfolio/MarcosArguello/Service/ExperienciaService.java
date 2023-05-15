package com.porfolio.MarcosArguello.Service;

import com.porfolio.MarcosArguello.Entity.Experiencia;
import com.porfolio.MarcosArguello.Repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {

    @Autowired
    IExperienciaRepository iExperienciaRepository;

    public List<Experiencia> list() {
        return iExperienciaRepository.findAll();
    }

    public Optional<Experiencia> getOne(int id) {
        return iExperienciaRepository.findById(id);
    }

    public Optional<Experiencia> getByNombreExperiencia(String nombreExperiencia) {
        return iExperienciaRepository.findByNombreExperiencia(nombreExperiencia);
    }

    public void save(Experiencia expe) {
        iExperienciaRepository.save(expe);
    }

    public void delete(int id) {
        iExperienciaRepository.deleteById(id);
    }

    public boolean existByid(int id) {
        return iExperienciaRepository.existsById(id);
    }

    public boolean existsByNombreExperiencia(String nombreExperiencia) {
        return iExperienciaRepository.existsByNombreExperiencia(nombreExperiencia);
    }
;
}
