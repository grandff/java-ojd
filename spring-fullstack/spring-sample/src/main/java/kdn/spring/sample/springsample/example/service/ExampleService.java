package kdn.spring.sample.springsample.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kdn.spring.sample.springsample.example.model.Example;
import kdn.spring.sample.springsample.example.repository.ExampleRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExampleService {

    private final ExampleRepository exampleRepository;

    // 게시판 목록 조회    
    public List<Example> selectList() {
        List<Example> resultList = exampleRepository.selectList();
        return resultList;
    }
    
    // 게시글 등록/수정 처리
    public int insertUpdateDeleteForm(String mode, Example requestDto){
        int result = 0;
        if(mode.equals("insert")) result = exampleRepository.insert(requestDto);        
        return result;
    }
}
