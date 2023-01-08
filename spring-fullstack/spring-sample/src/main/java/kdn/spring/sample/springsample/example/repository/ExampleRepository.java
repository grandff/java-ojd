package kdn.spring.sample.springsample.example.repository;

import java.util.List;

import org.springframework.jdbc.core.namedparam.EmptySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
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

    // 등록하기
    @Override
    public int insert(Example requestDto) {
        SqlParameterSource param = new MapSqlParameterSource("ttl", requestDto.getTtl())
        .addValue("ctt", requestDto.getCtt())
        .addValue("pwd", requestDto.getPwd());
        int result = namedParameterJdbcTemplate.update(ExampleSql.T_BOARD_INSERT, param);
        return result;
    }

    // 삭제하기
    @Override
    public int delete(int seq) {
        SqlParameterSource param = new MapSqlParameterSource("seq", seq);
        int result = namedParameterJdbcTemplate.update(ExampleSql.T_BOARD_DELETE, param);
        return result;
    }

    // 상세보기
    @Override
    public Example detail(int seq) {
        SqlParameterSource param = new MapSqlParameterSource("seq", seq);
        Example resultDto = namedParameterJdbcTemplate.queryForObject(ExampleSql.T_BOARD_DETAIL, param, this.exampleMapper);
        return resultDto;
    }

    // 수정하기
    @Override
    public int update(Example requestDto) {
        SqlParameterSource param = new MapSqlParameterSource("seq", requestDto.getSeq())
        .addValue("ttl", requestDto.getTtl())
        .addValue("ctt", requestDto.getCtt());        
        int result = namedParameterJdbcTemplate.update(ExampleSql.T_BOARD_UPDATE, param);
        return result;
    }

    // 글 갯수조회
    @Override
    public int count() {
        List<Example> resultList = namedParameterJdbcTemplate.query(ExampleSql.T_BOARD_SELECT_ALL, EmptySqlParameterSource.INSTANCE, this.exampleMapper);
        return resultList.size();        
    }

    
    
}
