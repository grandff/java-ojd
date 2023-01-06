package kdn.spring.sample.springsample.interfaces;

import org.springframework.web.servlet.ModelAndView;

// 컨트롤러에서 기본으로 들어가야할 메서드 목록
public interface ControllerInterface {
    ModelAndView list();
    ModelAndView view();
    ModelAndView form();
    String action();
}
