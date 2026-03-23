package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nelioalves.cursomc.entities.ItemPedido;
import com.nelioalves.cursomc.entities.ItemPedidoPk;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPk>{

}
