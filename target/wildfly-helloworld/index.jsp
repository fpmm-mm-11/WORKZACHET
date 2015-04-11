<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Request</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
<form id="testForm" action="do.test" method="POST">
    <h4>Request</h4>
    <!--
        <table class="simpletablestyle">
            <thead>
            <tr>
                <th>id</th>
                <th>Name</th>
                <th>SurName</th>
                <th>Email</th>
            </tr>
            </thead>
            <tbody>
            <!--  iterate on the member list @named attribute and display name,email and phone number
            <td><c:out value="${Users.surname}"/></td>
            <c:forEach items="${members}" var="Users">
                <tr>
                    <td><c:out value="${Users.id}"/></td>
                    <td><c:out value="${Users.name}"/></td>
                    <td><c:out value="${Users.email}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    -->
    <p>Name<Br>
       <textarea name="name" cols="40" rows="1"></textarea>
       <Br>Surname<Br>
       <textarea name="surname" cols="40" rows="1"></textarea>
       <Br>Email<Br>
       <textarea name="email" cols="40" rows="1"></textarea>
       <Br>Text<Br>
       <textarea name="text" cols="40" rows="3"></textarea>
    </p>
    <p>
        <input id="register" type="submit" value="Send" name="action">

    </p>
    <p>
        <label style="color: green;width: 100%;text-align: left;">${infoMessage}</label>
    </p>
</form>
</head>
</html>