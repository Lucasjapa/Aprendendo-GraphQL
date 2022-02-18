package com.udemy.compras.repository;

import com.udemy.compras.entity.Cliente;
import com.udemy.compras.entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompraRepositorio extends JpaRepository<Compra, Long> {

    List<Compra> findAllByCliente(Cliente cliente);
}
