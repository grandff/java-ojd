package kdn.spring.sample.springsample.interfaces;

import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.ModelAndView;

import kdn.spring.sample.springsample.example.model.Example;

// 컨트롤러에서 기본으로 들어가야할 메서드 목록
public interface ControllerInterface {
    ModelAndView list();
    ModelAndView view(int seq);
    ModelAndView form(String mode);
    ResponseEntity<?> delete(Example param);
}
