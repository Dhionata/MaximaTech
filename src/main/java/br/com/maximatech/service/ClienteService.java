package br.com.maximatech.service;

import br.com.maximatech.model.Cliente;
import br.com.maximatech.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> clientes() {
        return clienteRepository.findAll();
    }

    public Cliente criar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente editar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public String deletar(long id) {
        if (clienteRepository.existsById(id)) {
            clienteRepository.deleteById(id);
            return "Cliente excluído com sucesso";
        } else {
            return "Cliente não encontrado";
        }
    }

    public Cliente cliente(Long id) {
        var a = clienteRepository.findById(id).orElseThrow();
        System.out.println(a.toString());
        return a;
    }

    // outros métodos de serviço relacionados a clientes
}
