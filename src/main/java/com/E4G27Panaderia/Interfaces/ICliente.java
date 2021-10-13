package com.E4G27Panaderia.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.E4G27Panaderia.Modelo.Cliente;

@Repository
public interface ICliente extends CrudRepository<Cliente, Integer> {

}
