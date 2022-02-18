package com.udemy.compras.entity;

import lombok.Data;

@Data
public class ProdutoInput {

    private Long id;
    private String nome;
    private Double valor;
}
