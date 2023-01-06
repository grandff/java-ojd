package kdn.spring.sample.springsample.example;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kdn.spring.sample.springsample.example.model.Example;
import kdn.spring.sample.springsample.example.service.ExampleService;
import kdn.spring.sample.springsample.interfaces.ControllerInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "board")
@RequiredArgsConstructor
public class ExampleController implements ControllerInterface{
    // 생성자
    private final ExampleService exampleService;

    // 게시판 목록 화면 이동
    @Override
    @RequestMapping(value="list")
    public ModelAndView list(){        
        ModelAndView mav = new ModelAndView();
        // 등록된 게시글 목록 조회
        List<Example> resultList = exampleService.selectList();        
        mav.setViewName("example/list");    // 페이지라우팅 설정
        mav.addObject("boardList", resultList);
        mav.addObject("listSize", resultList.size());
        mav.addObject("now", "list");
        return mav;
    }

    @Override
    public ModelAndView view() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ModelAndView form() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String action() {
        // TODO Auto-generated method stub
        return null;
    }
}
