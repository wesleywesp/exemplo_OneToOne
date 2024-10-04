package pt.com.projeto.exemplo01.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pt.com.projeto.exemplo01.modelo.Cargo;

@Repository
public interface CargoRepoisitorio extends CrudRepository<Cargo, Long>{

}
