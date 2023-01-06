package kdn.spring.sample.springsample.example.repository;

public class ExampleSql {
    // 목록조회
    public static final String T_BOARD_SELECT_ALL = "SELECT SEQ, TTL, CTT, REG_DATE, USE_YN, PWD FROM T_BOARD WHERE USE_YN = 'Y' ";
}
