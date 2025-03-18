package com.Veiculo.Service;

import com.Veiculo.Repository.VeiculoRepository;
import com.Veiculo.Entities.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {
    private final VeiculoRepository veiculoRepository;

    @Autowired
    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public Veiculo saveVeiculo(Veiculo veiculo){
        return veiculoRepository.save(veiculo);
    }

    public Veiculo setVeiculoById(Long id){
        return veiculoRepository.findById(id).orElse(null);
    }

    public List<Veiculo> getAllVeiculo(){
        return veiculoRepository.findAll();
    }

    public void deleteVeiculo(Long id){
        veiculoRepository.deleteById(id);
    }
}
