package kdn.spring.sample.springsample.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    // 메인화면 이동
    @RequestMapping("/")
    public ModelAndView main(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("bio", "Hello World!");
        mav.addObject("main", "active");
        mav.setViewName("index");
        return mav;
    }
}
