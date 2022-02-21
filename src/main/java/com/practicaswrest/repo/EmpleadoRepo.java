
package com.practicaswrest.repo;

import com.practicaswrest.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Integer>{
    
}
