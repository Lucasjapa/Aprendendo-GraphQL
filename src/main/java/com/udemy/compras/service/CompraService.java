package com.udemy.compras.service;

import com.udemy.compras.entity.Cliente;
import com.udemy.compras.entity.Compra;
import com.udemy.compras.entity.Produto;
import com.udemy.compras.repository.CompraRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CompraService {

    @Autowired
    private CompraRepositorio compraRepositorio;

    public Compra findById(Long id) {
        return compraRepositorio.findById(id).orElse(null);
    }

    public List<Compra> findAll() {
        return compraRepositorio.findAll();
    }

    @Transactional
    public Compra save(Compra compra){
        return compraRepositorio.save(compra);
    }

    @Transactional
    public boolean deleteById(Long id){
        if(compraRepositorio.findById(id).isPresent()){
            compraRepositorio.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Compra> findAllByCliente(Cliente cliente) {
        return compraRepositorio.findAllByCliente(cliente);
    }
}