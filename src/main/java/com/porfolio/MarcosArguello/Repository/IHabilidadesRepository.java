package com.porfolio.MarcosArguello.Repository;

import com.porfolio.MarcosArguello.Entity.Habilidades;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadesRepository extends JpaRepository<Habilidades, Integer> {

    Optional<Habilidades> findByNombre(String nombre);

    public boolean existsByNombre(String nombre);
}
