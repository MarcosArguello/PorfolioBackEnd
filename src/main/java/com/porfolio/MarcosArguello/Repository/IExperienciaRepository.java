package com.porfolio.MarcosArguello.Repository;

import com.porfolio.MarcosArguello.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository
        extends JpaRepository<Experiencia, Integer> {

    public Optional<Experiencia> findByNombreExperiencia(String nombreExperiencia);

    public boolean existsByNombreExperiencia(String nombreExperiencia);
}
