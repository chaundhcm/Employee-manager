<%-- 
    Document   : update-record
    Created on : Mar 6, 2020, 3:58:19 PM
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
        <h2 style="padding: 10px; font-weight: bold"><s:message code="admin.record.updRecord.title"/></h2>
        <p class="text-success" >${message}</p>
        <form:form action="admin/record/update.htm"  modelAttribute="record" method="post">
		<div class="form-group">
			<label>ID:</label>
			<form:input path="id" cssClass="form-control"/>
		</div>
		<div class="form-group">
                    <label>Kiểu đánh giá:</label> <br>
                <div class="custom-control custom-radio custom-control-inline">
                    <form:radiobutton class="custom-control-input" id="customRadio1" path="type" value="true" />
                    <label class="custom-control-label" for="customRadio1">Thành Tích</label>
                    </div>
                <div class="custom-control custom-radio custom-control-inline">
                    <form:radiobutton class="custom-control-input" id="customRadio2" path="type" value="false" />
                    <label class="custom-control-label" for="customRadio2">Kỷ Luật</label>
                    </div>
                </div>
                <div class="form-group">
			<label>Reason:</label>
			<form:input path="reason" cssClass="form-control"/>
		</div>
                <div class="form-group">
			<label>Date:</label>
			<form:input type="date" path="date" cssClass="form-control"/>
		</div>
                <div class="form-group">
			<label>StaffID:</label>
			<form:input path="staff.id" cssClass="form-control"/>
		</div>
			<center><button type="submit" class="btn btn-primary" ><s:message code="admin.record.updRecord.btnUpdate"/></button></center>
	</form:form>
    </body>
</html>
