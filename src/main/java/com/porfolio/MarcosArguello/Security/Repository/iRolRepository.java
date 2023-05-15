package com.porfolio.MarcosArguello.Security.Repository;

import com.porfolio.MarcosArguello.Security.Entity.Rol;
import com.porfolio.MarcosArguello.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
