package com.udemy.compras.service;

import com.udemy.compras.entity.Cliente;
import com.udemy.compras.repository.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public Cliente findById(Long id) {
        return clienteRepositorio.findById(id).orElse(null);
    }

    public List<Cliente> findAll() {
        return clienteRepositorio.findAll();
    }

    @Transactional
    public Cliente save(Cliente cLiente){
        return clienteRepositorio.save(cLiente);
    }

    @Transactional
    public boolean deleteById(Long id){
        if(clienteRepositorio.findById(id).isPresent()){
            clienteRepositorio.deleteById(id);
            return true;
        }
        return false;
    }

}