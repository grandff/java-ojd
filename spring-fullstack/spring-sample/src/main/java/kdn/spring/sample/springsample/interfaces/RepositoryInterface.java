package kdn.spring.sample.springsample.interfaces;

import java.util.List;

import kdn.spring.sample.springsample.example.model.Example;

public interface RepositoryInterface {
    List<?> selectList();
    int count();
    int insert(Example param);
    int update(Example param);
    int delete(int seq);
    Object detail(int seq);
}
