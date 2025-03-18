package com.Cliente.Controller;

import com.Cliente.Entities.Cliente;
import com.Cliente.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente){
        return clienteService.saveCliente(cliente);
    }

    @GetMapping("/{id}")
    public Cliente getCliente(@PathVariable Long id){
        return clienteService.getClienteById(id);
    }

    @GetMapping
    public List<Cliente> getAllCliente(){
        return clienteService.getAllCliente();
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id){
        clienteService.deleteCliente(id);
    }
}
