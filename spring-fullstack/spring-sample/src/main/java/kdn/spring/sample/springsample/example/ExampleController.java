package kdn.spring.sample.springsample.example;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    // 게시글 등록/수정 화면으로 이동
    @Override
    @RequestMapping(value="form")
    public ModelAndView form(@RequestParam(defaultValue = "insert") String mode) {
        ModelAndView mav = new ModelAndView();                
        mav.setViewName("example/form");    // 페이지라우팅 설정      
        mav.addObject("mode", mode);
        mav.addObject("now", "list");
        return mav;
    }
    
    // 게시글 등록/수정 액션 처리
    @PostMapping(value = "action")
    public ModelAndView action(@RequestBody @Valid Example requestDto) {
        log.info("param : {}", requestDto.toString());
        return null;
    }
}
