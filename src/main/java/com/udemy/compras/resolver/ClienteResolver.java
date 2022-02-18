package com.udemy.compras.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.udemy.compras.entity.Cliente;
import com.udemy.compras.entity.Compra;
import com.udemy.compras.entity.Produto;
import com.udemy.compras.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteResolver implements GraphQLResolver<Cliente> {

    @Autowired
    private CompraService compraService;

    public String status(Compra compra) {
        return "Teste: " + compra.getStatus();
    }

    public List<Compra> compras (Cliente cLiente) {
        return compraService.findAllByCliente(cLiente);
    }

}
