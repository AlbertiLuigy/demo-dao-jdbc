package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

    void insert(Seller obj); // Inserir um vendedor

    void update(Seller obj); // Atualizar um vendedor

    void deleteById(Integer id); // Excluir um vendedor por ID

    Seller findById(Integer id); // Buscar um vendedor por ID

    List<Seller> findAll(); // Buscar todos os vendedores
}
