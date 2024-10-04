package pt.com.projeto.exemplo01.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pt.com.projeto.exemplo01.modelo.Colaborador;

@Repository
public interface ColaboradorRepositorio extends CrudRepository<Colaborador, Long> {

}
