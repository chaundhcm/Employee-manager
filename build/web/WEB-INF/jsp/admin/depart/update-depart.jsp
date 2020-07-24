<%-- 
    Document   : update-depart
    Created on : Mar 6, 2020, 3:58:31 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ABC Group</title>
        <base href="${pageContext.servletContext.contextPath}/">
    </head>
    <body>
        <h2 style="padding: 10px; font-weight: bold"><s:message code="admin.depart.updDepart.title"/></h2>
        <p class="text-success" >${message}</p>
        <form:form action="admin/depart/update.htm"  modelAttribute="depart" method="post">
		<div class="form-group">
			<label>Id</label>
			<form:input path="id" cssClass="form-control"/>
		</div>
		
		<div class="form-group">
			<label>Tên phòng:</label>
			<form:input path="name" cssClass="form-control"/>
		</div>
                <br> 
			<center><button type="submit" class="btn btn-primary" ><s:message code="admin.depart.updDepart.btnUpdate"/></button></center>
	</form:form>
    </body>
</html>
