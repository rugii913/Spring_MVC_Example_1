<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="java.util.List" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%
    MemberRepository memberRepository = MemberRepository.getInstance();
    List<Member> members = memberRepository.findAll();
%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<a href="/index.html">메인</a>
<table>
    <thead>
    <th>id</th>
    <th>username</th>
    <th>age</th>
    </thead>
    <tbody>
    <%--    <%--%>
    <%--        for (Member member : members) {--%>
    <%--            out.write(" <tr>");--%>
    <%--            out.write(" <td>" + member.getId() + "</td>");--%>
    <%--            out.write(" <td>" + member.getUsername() + "</td>");--%>
    <%--            out.write(" <td>" + member.getAge() + "</td>");--%>
    <%--            out.write(" </tr>");--%>
    <%--        }--%>
    <%--    %>--%>
    <%-- 위처럼 말고 아래처럼도 가능하다 --%>
    <% for (Member member : members) { %>
    <tr>
        <td><%=member.getId()%>
        </td>
        <td><%=member.getUsername()%>
        </td>
        <td><%=member.getAge()%>
        </td>
    </tr>
    <% } %>
    </tbody>
</table>
</body>
</html>
