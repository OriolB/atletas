package atletas.medallas.demo.repository;

import atletas.medallas.demo.domain.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AtletaRepository extends JpaRepository<Atleta, Long> {

    Atleta findByNombreContaining(String nombre);

    List<Atleta>  findByNacionalidad(String nacionalidad);

    List<Atleta>  findByFechaNacimientoBefore(LocalDate fechaNacimiento);



}
