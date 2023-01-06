package kdn.spring.sample.springsample.example.model;

import lombok.Data;

@Data
public class Example {
    private int seq;        // 순번
    private String ttl;     // 제목
    private String ctt;     // 내용
    private String regDate; // 등록일자
    private String useYn;   // 사용여부
    private String pwd;     // 비밀번호
}
