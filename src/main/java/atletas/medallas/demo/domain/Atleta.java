package atletas.medallas.demo.domain;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Atleta {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private String apellidos;
    private String nacionalidad;
    private LocalDate fechaNacimiento;

    @ManyToOne
    private Medalla medalla;

    public Atleta() {
    }

    public Atleta(String nombre, String apellidos, String nacionalidad, LocalDate fechaNacimiento, Medalla medalla) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.medalla = medalla;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atleta{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", nacionalidad='").append(nacionalidad).append('\'');
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", medalla=").append(medalla);
        sb.append('}'  + System.lineSeparator());
        return sb.toString();
    }


}
