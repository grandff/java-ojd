package kdn.spring.sample.springsample.example.repository;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kdn.spring.sample.springsample.example.model.Example;

@Component
public class ExampleMapper implements RowMapper<Example>{

    @Override
    public Example mapRow(ResultSet rs, int rowNum) throws SQLException {
        Example result = new Example();
        result.setSeq(rs.getInt("SEQ"));
        result.setTtl(String.valueOf(rs.getString("TTL")));
        result.setCtt(String.valueOf(rs.getString("CTT")));
        result.setRegDate(String.valueOf(rs.getString("REG_DATE")));
        result.setUseYn(String.valueOf(rs.getString("USE_YN")));
        result.setPwd(String.valueOf(rs.getString("PWD")));
        return result;
    }
    
    
}
