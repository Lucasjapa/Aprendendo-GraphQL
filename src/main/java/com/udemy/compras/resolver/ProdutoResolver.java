package com.udemy.compras.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.udemy.compras.entity.Compra;
import com.udemy.compras.entity.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoResolver implements GraphQLResolver<Produto> {

    public String valorReais(Produto produto){
        return "R$" + produto.getValor();
    }
}
