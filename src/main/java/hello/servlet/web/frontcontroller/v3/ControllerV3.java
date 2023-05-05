package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
    //=> 서블릿 종속성 제거
    //V2의 MyView 대신 ModelView를 반환하는 메서드 process를 갖고 있다.
    //Servlet과 관련된 HttpServletRequest, HttpServletResponse들의 인스턴스 대신 paramMap을 매개변수로 받는다.
    //기존에 HttpServletRequest가 제공했던 데이터는
    //프론트 컨트롤러가 paramMap에 담은 뒤, 구현 컨트롤러 인스턴스의 process 메서드를 호출하면서 전달될 것이다.
}
