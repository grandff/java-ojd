package kdn.spring.sample.springsample.example.model;

import javax.validation.constraints.NotEmpty;

import kdn.spring.sample.springsample.common.DefaultModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Example extends DefaultModel{
    //private int seq;        // 순번
    
    @NotEmpty(message = "제목을 입력해주세요")
    private String ttl;     // 제목
    @NotEmpty(message = "내용을 입력해주세요")
    private String ctt;     // 내용
    private String regDate; // 등록일자
    private String useYn;   // 사용여부
    private String pwd;     // 비밀번호
}
