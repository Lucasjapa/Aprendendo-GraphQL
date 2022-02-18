package com.udemy.compras.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.udemy.compras.repository.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QueryGraphQL implements GraphQLQueryResolver {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    public String hello() {
        return "Hello GraphQL";
    }

    public Integer soma(int a, int b) {
        return a + b;
    }

}
