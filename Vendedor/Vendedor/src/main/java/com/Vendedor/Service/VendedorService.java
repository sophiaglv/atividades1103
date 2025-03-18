package com.Vendedor.Service;

import com.Vendedor.Repository.VendedorRepository;
import com.Vendedor.Entities.Vendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendedorService {
    private final VendedorRepository vendedorRepository;

    @Autowired
    public VendedorService(VendedorRepository vendedorRepository) {
        this.vendedorRepository = vendedorRepository;
    }

    public Vendedor saveVendedor(Vendedor vendedor){
        return vendedorRepository.save(vendedor);
    }

    public Vendedor getVendedorById(Long id){
        return vendedorRepository.findById(id).orElse(null);
    }

    public List<Vendedor> getAllVendedor(){
        return vendedorRepository.findAll();
    }

    public void deleteVendedor(Long id){
        vendedorRepository.deleteById(id);
    }
}
