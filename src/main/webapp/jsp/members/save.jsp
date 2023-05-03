<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<% //JSP도 나중에 결국 서블릿으로 변환된다.
    //사실상 서비스 메소드가 그대로 호출된다고 생각하면 된다.
    //=> request, response 그대로 사용 가능(문법상 지원되는 것)
    MemberRepository memberRepository = MemberRepository.getInstance();

    System.out.println("JspClass.jsp_service_method");
    System.out.println("save.jsp");
    String username = request.getParameter("username");
    int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username, age);
    System.out.println("member = " + member);
    memberRepository.save(member);
%>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
</head>
<body>
성공
<ul>
    <li>id=<%=member.getId()%>
    </li>
    <li>username=<%=member.getUsername()%>
    </li>
    <li>age=<%=member.getAge()%>
    </li>
</ul>
<a href="/index.html"></a>
</body>
</html>
