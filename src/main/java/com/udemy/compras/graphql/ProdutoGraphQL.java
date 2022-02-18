package com.udemy.compras.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.udemy.compras.entity.Produto;
import com.udemy.compras.entity.ProdutoInput;
import com.udemy.compras.service.ProdutoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private ProdutoService produtoService;

    public Produto produto(Long id) {
        return produtoService.findById(id);
    }

    public List<Produto> produtos() {
        return produtoService.findAll();
    }

    public Produto salvarProduto(ProdutoInput produtoInput){
        return produtoService.save(new ModelMapper().map(produtoInput, Produto.class));
    }

    public boolean deletarProduto(Long id){
        return produtoService.deleteById(id);
    }

}
