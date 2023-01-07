package kdn.spring.sample.springsample.example.repository;

import org.springframework.stereotype.Component;

@Component
public class ExampleSql {
    // 목록조회
    public static final String T_BOARD_SELECT_ALL = "SELECT SEQ, TTL, CTT, REG_DATE, USE_YN, PWD FROM T_BOARD WHERE USE_YN = 'Y' ";

    // 글 등록
    public static final String T_BOARD_INSERT = "INSERT INTO T_BOARD (SEQ, TTL, CTT, PWD) VALUES (T_BOARD_SEQ.NETVAL, :ttl, :ctt, :pwd) ";    
}
