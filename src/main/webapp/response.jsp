<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 4/24/21
  Time: 9:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ page import="java.lang.String" %>
<%@ page import="by.itClass.entity.FormValues" %>
<html>
<head>
    <title>response</title>
    <style>
        td, th {
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <table style="border-collapse: separate; border: 1px solid black">
        <thead>
            <tr style="background-color: yellow">
                <th>Parameter Name</th>
                <th>Parameter Value(s)</th>
            </tr>
        </thead>
        <tbody>
            <%
                FormValues formValues = (FormValues) request.getAttribute("formValues");
                String checkbox1 = formValues.getCheckbox1();
                String checkbox2 = formValues.getCheckbox2();
                String checkbox3 = formValues.getCheckbox3();

                checkbox1 = checkbox1 != null ? "<tr><td>box1</td><td>" + checkbox1 + "</td></tr>" : "";
                checkbox2 = checkbox2 != null ? "<tr><td>box2</td><td>" + checkbox2 + "</td></tr>" : "";
                checkbox3 = checkbox3 != null ? "<tr><td>box3</td><td>" + checkbox3 + "</td></tr>" : "";

            %>
            <%= checkbox1%>
            <%= checkbox2%>
            <%= checkbox3%>
            <tr>
                <td>param3</td>
                <td>
                    <ul>
                        <%
                            String ul = "";

                            for (String str : formValues.getThirdParams() ) {
                               ul += ("<li>" + str + "</li>");
                            }
                        %>
                        <%= ul%>
                    </ul>
                </td>
            </tr>
            <tr>
                <td>param2</td>
                <td>${formValues.secondParam}</td>
            </tr>
            <tr>
                <td>param1</td>
                <td>${formValues.firstParam}</td>
            </tr>
            <tr>
                <td>radio</td>
                <td>${formValues.radio}</td>
            </tr>
        </tbody>
    </table>
    <a href="/lesson40">back</a>
</body>
</html>
