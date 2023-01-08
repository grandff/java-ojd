package kdn.spring.sample.springsample.example.repository;

import org.springframework.stereotype.Component;

@Component
public class ExampleSql {
    // 목록조회
    public static final String T_BOARD_SELECT_ALL = "SELECT SEQ, TTL, CTT, REG_DATE, USE_YN, PWD FROM T_BOARD WHERE USE_YN = 'Y' ";

    // 글 등록
    public static final String T_BOARD_INSERT = "INSERT INTO T_BOARD (SEQ, TTL, CTT, PWD) VALUES (T_BOARD_SEQ.NEXTVAL, :ttl, :ctt, :pwd) ";    

    // 글 조회
    public static final String T_BOARD_DETAIL = "SELECT SEQ, TTL, CTT, TO_CHAR(REG_DATE, 'YYYY.MM.DD') AS REG_DATE, USE_YN, PWD FROM T_BOARD WHERE USE_YN = 'Y' AND SEQ = :seq ";

    // 글 수정
    public static final String T_BOARD_UPDATE = "UPDATE T_BOARD SET TTL = :ttl, CTT = :ctt, REG_DATE = SYSDATE WHERE SEQ = :seq";

    // 글 삭제
    public static final String T_BOARD_DELETE = "UPDATE T_BOARD SET USE_YN = 'N' WHERE SEQ = :seq";    
}
