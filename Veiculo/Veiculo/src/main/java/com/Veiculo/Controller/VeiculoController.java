package com.Veiculo.Controller;

import com.Veiculo.Entities.Veiculo;
import com.Veiculo.Service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
    private final VeiculoService veiculoService;

    @Autowired
    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @PostMapping
    public Veiculo createVeiculo(@RequestBody Veiculo veiculo){
        return veiculoService.saveVeiculo(veiculo);
    }

    @GetMapping("/{id}")
    public Veiculo getVeiculo(@PathVariable Long id){
        return veiculoService.setVeiculoById(id);
    }

    @GetMapping
    public List<Veiculo> getAllVeiculo(){
        return veiculoService.getAllVeiculo();
    }

    @DeleteMapping("/{id}")
    public void deleteVeiculo(@PathVariable Long id){
        veiculoService.deleteVeiculo(id);
    }
}
