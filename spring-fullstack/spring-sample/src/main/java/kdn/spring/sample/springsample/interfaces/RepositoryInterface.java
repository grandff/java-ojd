package kdn.spring.sample.springsample.interfaces;

import java.util.List;

import kdn.spring.sample.springsample.example.model.Example;

public interface RepositoryInterface {
    List<?> selectList();
    int insert(Example param);
}
