package pt.com.projeto.exemplo01.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.com.projeto.exemplo01.modelo.Cargo;
import pt.com.projeto.exemplo01.repositorio.CargoRepoisitorio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/cargos")
public class CargoControle {
    @Autowired
    private CargoRepoisitorio cargo_Repoisitorio;
    
    @GetMapping("/listar")
    public Iterable<Cargo> listar(){

        return cargo_Repoisitorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Cargo cadastrar(@RequestBody Cargo obj){
        return cargo_Repoisitorio.save(obj);
    }
}
