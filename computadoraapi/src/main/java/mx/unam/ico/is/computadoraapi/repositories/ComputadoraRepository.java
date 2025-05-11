package mx.unam.ico.is.computadoraapi.repositories;

import mx.unam.ico.is.computadoraapi.entities.Computadora;
import org.springframework.data.repository.CrudRepository;

public interface ComputadoraRepository extends CrudRepository<Computadora, Long> {
    public Computadora findComputadoraByClave(Long clave);
}
