package hello.servlet.web.springmvc.v3;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * v3
 * Model 도입
 * ViewName을 ModelAndView에 넘기지 않고 String으로 직접 반환
 * @RequestParam 사용
 * @RequestMapping -> @GetMapping, @PostMapping
 */
@Controller
@RequestMapping("/springmvc/v3/members")
public class SpringMemberControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    //@RequestMapping("/springmvc/v3/members/new-form")
    //@RequestMapping("/new-form")
    //@RequestMapping(value = "/new-form", method = RequestMethod.GET) //HTTP 메서드 제한
    @GetMapping("/new-form")
    public String newForm() {
        //return new ModelAndView("new-form");
        return "new-form";
    }

    //@RequestMapping("/springmvc/v3/members/save")
    //@RequestMapping("/save")
    //@RequestMapping(value = "/save", method = RequestMethod.POST)
    @PostMapping("/save")
    //public ModelAndView save(HttpServletRequest request, HttpServletResponse response) {
//    public ModelAndView save(@RequestParam("username") String username, @RequestParam("age") int age, Model model) {
    public String save(@RequestParam("username") String username, @RequestParam("age") int age, Model model) {

        // @RequestParam에 의해 HttpServletRequest 인스턴스 request에서 파라미터 가져오는 부분 제거 가능
//        String username = request.getParameter("username");
//        int age = Integer.parseInt(request.getParameter("age")); //파싱까지 스프링에서 자동 처리

        Member member = new Member(username, age);
        memberRepository.save(member);

//        ModelAndView mv = new ModelAndView("save-result");
//        mv.addObject("member", member);

        model.addAttribute("member", member);

        return "save-result";
    }

    //@RequestMapping("/springmvc/v3/members")
    //@RequestMapping
    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
//    public ModelAndView members() {
    public String members(Model model) {

        List<Member> members = memberRepository.findAll();

//        ModelAndView mv = new ModelAndView("members");
//        mv.addObject("members", members);

        model.addAttribute("members", members);
        return "members";
    }
}
