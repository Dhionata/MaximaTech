package br.com.maximatech.controller;

import br.com.maximatech.model.Cliente;
import br.com.maximatech.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> todosClientes() {
        List<Cliente> listaDeClientes = clienteService.clientes();
        return ResponseEntity.ok(listaDeClientes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> clienteUnico(@Valid @PathVariable Long id) {
        return ResponseEntity.ok(clienteService.cliente(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@Valid @RequestBody Cliente cliente) {
        Cliente createdCliente = clienteService.criar(cliente);
        return ResponseEntity.ok(createdCliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarCliente(@Valid @PathVariable long id) {
        var ar = clienteService.deletar(id);
        if (ar.equals("Cliente excluído com sucesso")) {
            return ResponseEntity.ok("Excluido com sucesso");
        } else
            return ResponseEntity.ok("Cliente não encontrado para exclusão");
    }

    @PutMapping()
    public ResponseEntity<Cliente> editarCliente(@Valid @RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteService.editar(cliente));
    }

}
