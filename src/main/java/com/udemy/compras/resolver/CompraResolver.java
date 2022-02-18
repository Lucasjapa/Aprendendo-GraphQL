package com.udemy.compras.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.udemy.compras.entity.Cliente;
import com.udemy.compras.entity.Compra;
import com.udemy.compras.entity.Produto;
import com.udemy.compras.service.ClienteService;
import com.udemy.compras.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompraResolver implements GraphQLResolver<Compra> {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ProdutoService produtoService;

    public String status(Compra compra){
        return "Teste: " + compra.getStatus();
    }

    public Cliente cliente(Compra compra){
        return clienteService.findById(compra.getCliente().getId());
    }

    public Produto produto(Compra compra){
        return produtoService.findById(compra.getProduto().getId());
    }
}
