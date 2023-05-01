package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HelloData { //JSON 형식으로 파싱할 수 있도록 객체를 생성해주는 역할

    private String username;
    private int age;
}
