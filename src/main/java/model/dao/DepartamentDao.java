package model.dao;

import java.util.List;

import model.entities.Departament;

public interface DepartamentDao {

    void insert(Departament obj); // Inserir um departamento

    void update(Departament obj); // Atualizar um departamento

    void deleteById(Integer id); // Excluir um departamento por ID

    Departament findById(Integer id); // Buscar um departamento por ID

    List<Departament> findAll(); // Buscar todos os departamentos
}
