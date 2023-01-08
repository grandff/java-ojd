package kdn.spring.sample.springsample.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kdn.spring.sample.springsample.example.service.ExampleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class MainController {
    private final ExampleService exampleService;

    // 메인화면 이동
    @RequestMapping("/")
    public ModelAndView main(){
        ModelAndView mav = new ModelAndView();

        // 현재 게시글 갯수 
        int totalCount = exampleService.count();
        log.info("totalCount : {}", totalCount);

        mav.addObject("bio", "Hello World!");
        mav.addObject("main", "active");
        mav.addObject("totalCount", totalCount);
        mav.setViewName("index");
        return mav;
    }
}
