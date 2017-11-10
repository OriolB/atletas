package atletas.medallas.demo.domain;

import atletas.medallas.demo.TipoMedalla;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Medalla {
    @Id
    @GeneratedValue
    private Long id;
    private TipoMedalla tipoMedalla;
    private String especialidad;
    private String competicion;

    public Medalla() {
    }

    public Medalla(TipoMedalla tipoMedalla, String especialidad, String competicion) {
        this.tipoMedalla = tipoMedalla;
        this.especialidad = especialidad;
        this.competicion = competicion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medalla{");
        sb.append("id=").append(id);
        sb.append(", tipoMedalla=").append(tipoMedalla);
        sb.append(", especialidad='").append(especialidad).append('\'');
        sb.append(", competicion='").append(competicion).append('\'');
        sb.append('}' + System.lineSeparator());
        return sb.toString();
    }
}
