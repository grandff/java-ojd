package kdn.spring.sample.springsample.example.repository;

import java.util.List;

import org.springframework.jdbc.core.namedparam.EmptySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import kdn.spring.sample.springsample.example.model.Example;
import kdn.spring.sample.springsample.interfaces.RepositoryInterface;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ExampleRepository implements RepositoryInterface{
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private final ExampleMapper exampleMapper;

    // 목록조회    
    @Override
    public List<Example> selectList() {
        List<Example> resultList = namedParameterJdbcTemplate.query(ExampleSql.T_BOARD_SELECT_ALL, EmptySqlParameterSource.INSTANCE, this.exampleMapper);        
        return resultList;
    }


}
