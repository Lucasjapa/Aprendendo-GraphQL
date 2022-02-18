package com.udemy.compras.service;

import com.udemy.compras.entity.Produto;
import com.udemy.compras.repository.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepositorio produtoRepositorio;

    public Produto findById(Long id) {
        return produtoRepositorio.findById(id).orElse(null);
    }

    public List<Produto> findAll() {
        return produtoRepositorio.findAll();
    }

    @Transactional
    public Produto save(Produto produto){
        return produtoRepositorio.save(produto);
    }

    @Transactional
    public boolean deleteById(Long id){
        if(produtoRepositorio.findById(id).isPresent()){
            produtoRepositorio.deleteById(id);
            return true;
        }
        return false;
    }

}