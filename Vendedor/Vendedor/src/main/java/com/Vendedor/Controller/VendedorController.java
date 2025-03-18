package com.Vendedor.Controller;

import com.Vendedor.Entities.Vendedor;
import com.Vendedor.Service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
    private final VendedorService vendedorService;

    @Autowired
    public VendedorController(VendedorService vendedorService) {
        this.vendedorService = vendedorService;
    }

    @PostMapping
    public Vendedor createVendedor(@RequestBody Vendedor vendedor){
        return vendedorService.saveVendedor(vendedor);
    }

    @GetMapping("/{id}")
    public Vendedor getVendedor(@PathVariable Long id){
        return vendedorService.getVendedorById(id);
    }

    @GetMapping
    public List<Vendedor> getAllVendedor(){
        return vendedorService.getAllVendedor();
    }

    @DeleteMapping("/{id}")
    public void deleteVendedor(@PathVariable Long id){
        vendedorService.deleteVendedor(id);
    }
}
