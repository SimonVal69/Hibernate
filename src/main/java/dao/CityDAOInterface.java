package dao;

import java.io.Serializable;
import java.util.List;

public interface CityDAOInterface<T, Id extends Serializable> {
    void addNewEmployee(T entity);

    void updateById(T entity);

    T findById(Id id);

    void deleteById(T entity);

    List<T> findAll();
}
