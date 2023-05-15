package com.porfolio.MarcosArguello.Service;

import com.porfolio.MarcosArguello.Entity.Educacion;
import com.porfolio.MarcosArguello.Repository.IEducacionRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {

    @Autowired
    IEducacionRepository iEducacionRepository;

    public List<Educacion> list() {
        return iEducacionRepository.findAll();
    }

    public Optional<Educacion> getOne(int id) {
        return iEducacionRepository.findById(id);
    }

    public Optional<Educacion> getByNmbreE(String nombreE) {
        return iEducacionRepository.findByNombreE(nombreE);
    }

    public void save(Educacion educacion) {
        iEducacionRepository.save(educacion);
    }

    public void delete(int id) {
        iEducacionRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return iEducacionRepository.existsById(id);
    }

    public boolean existsByNombreE(String nombreE) {
        return iEducacionRepository.existsByNombreE(nombreE);
    }
}
