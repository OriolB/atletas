package atletas.medallas.demo.controller;

import atletas.medallas.demo.domain.Atleta;
import atletas.medallas.demo.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/atletas")
public class AtletaController {

    @Autowired
    private AtletaRepository atletaRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Atleta createAtleta(@RequestBody Atleta atleta) {
        return atletaRepository.save(atleta);
    }

    @PutMapping
    public Atleta updateAtleta(@RequestBody Atleta atleta) {
        return atletaRepository.save(atleta);
    }

    @GetMapping
    public List<Atleta> findAll() {
        return atletaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Atleta findById(@PathVariable Long id) {
        Atleta atleta = atletaRepository.findOne(id);
        return atleta;
    }

    @GetMapping("/byName/{nombre}")
    public Atleta findByNombre(@PathVariable String nombre) {
        return atletaRepository.findByNombreContaining(nombre);
    }

    @GetMapping("/fechaAnterior/{fechaNacimiento}")
    public List<Atleta> atletaByFechaNacimiento2(
            @PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") LocalDate fechaNacimiento) {
        return atletaRepository.findByFechaNacimientoBefore(fechaNacimiento);
    }

    @DeleteMapping("/{id}")
    public void deleteAtleta(@PathVariable Long id) {
        atletaRepository.delete(id);
    }
}

