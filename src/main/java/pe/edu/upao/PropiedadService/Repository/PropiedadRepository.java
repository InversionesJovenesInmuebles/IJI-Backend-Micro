package pe.edu.upao.PropiedadService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upao.PropiedadService.Entity.Propiedad;

@Repository
public interface PropiedadRepository extends JpaRepository<Propiedad, Long> {
}
