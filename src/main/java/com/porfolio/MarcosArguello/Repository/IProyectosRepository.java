package com.porfolio.MarcosArguello.Repository;

import com.porfolio.MarcosArguello.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectosRepository
        extends JpaRepository<Proyectos, Integer> {

    public Optional<Proyectos> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);
}
