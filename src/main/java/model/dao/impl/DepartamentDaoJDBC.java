package model.dao.impl;

import java.sql.Connection;
import java.util.List;

import model.dao.DepartamentDao;
import model.entities.Departament;

public class DepartamentDaoJDBC implements DepartamentDao {

    private final Connection conn;

    public DepartamentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    public Connection getConnection() {
        return conn;
    }

    @Override
    public void insert(Departament obj) {
        throw new UnsupportedOperationException("Metodo insert ainda nao implementado");
    }

    @Override
    public void update(Departament obj) {
        throw new UnsupportedOperationException("Metodo update ainda nao implementado");
    }

    @Override
    public void deleteById(Integer id) {
        throw new UnsupportedOperationException("Metodo deleteById ainda nao implementado");
    }

    @Override
    public Departament findById(Integer id) {
        throw new UnsupportedOperationException("Metodo findById ainda nao implementado");
    }

    @Override
    public List<Departament> findAll() {
        throw new UnsupportedOperationException("Metodo findAll ainda nao implementado");
    }
}
