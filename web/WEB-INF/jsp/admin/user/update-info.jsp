<%-- 
    Document   : update-info
    Created on : Mar 20, 2020, 2:44:01 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ABC Group</title>
        <base href="${pageContext.servletContext.contextPath}/">
    </head>
    <body>
         <h2 style="padding: 10px; font-weight: bold"><s:message code="admin.user.updInfo.title"/></h2>
        <p class="text-success" >${message}</p>
        <form:form action="admin/user/updateinf.htm"  modelAttribute="user" method="post">
		<div class="form-group">
			<label>Username</label>
			<form:input  path="username" cssClass="form-control" />
		</div>
		
		<div class="form-group">
			<label>Password</label>
			<form:input path="password" cssClass="form-control" />
		</div>
                <div class="form-group">
			<label>Họ và Tên:</label>
			<form:input path="fullname" cssClass="form-control" />
		</div>
                <div class="form-group">
			<label>Vai trò:</label>
		</div>
                <div class="custom-control custom-radio custom-control-inline">
                    <form:radiobutton class="custom-control-input" id="customRadio1" path="role" value="true" />
                    <label class="custom-control-label" for="customRadio1">ADMIN</label>
                    </div>
                <div class="custom-control custom-radio custom-control-inline">
                    <form:radiobutton class="custom-control-input" id="customRadio2" path="role" value="false" />
                    <label class="custom-control-label" for="customRadio2">Nhân Viên</label>
                    </div>
                    <br> <br>
                    <center><button type="submit" class="btn btn-primary"><s:message code="admin.user.updInfo.btnUpdate"/></button></center>
	</form:form>
    </body>
</html>
