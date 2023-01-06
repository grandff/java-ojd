package kdn.spring.sample.springsample.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kdn.spring.sample.springsample.example.model.Example;
import kdn.spring.sample.springsample.example.repository.ExampleRepository;
import kdn.spring.sample.springsample.interfaces.ServiceInterface;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExampleService implements ServiceInterface{

    private final ExampleRepository exampleRepository;

    // 게시판 목록 조회
    @Override
    public List<Example> selectList() {
        List<Example> resultList = exampleRepository.selectList();
        return resultList;
    }
    
}
