<%-- 
    Document   : index
    Created on : Feb 27, 2020, 6:00:19 PM
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
    <div class="education-section section">
            <div class="container">
                <div class="row">
                    <div class="col-sm-4">
                        <div class="heading">
                                <h3><b><s:message code="user.account.title"/></b></h3>
                                <h6 class="font-lite-black"><b><s:message code="user.account.title.updAccount"/></b></h6>
                        </div>
                    </div><!-- col-sm-4 -->
                    <div class="col-sm-8">
                        <div class="col2">
            <div class="row">
                <div class="col-12">
                  <p class="text-success" >${message}</p>
        <form:form action="user/updateinf.htm"  modelAttribute="user" method="post">
		<div class="form-group">
			<label><s:message code="user.account.form.username"/></label>
                        <form:input path="username" cssClass="form-control" disabled="true"/>
                        <form:hidden path="username" cssClass="form-control" />
		</div>
		
		<div class="form-group">
			<label><s:message code="user.account.form.password"/></label>
			<form:input path="password" cssClass="form-control" type="password" />
		</div>
                <div class="form-group">
			<label><s:message code="user.account.form.fullname"/>:</label>
			<form:input path="fullname" cssClass="form-control"/>
		</div>
                <form:hidden cssClass="form-control" id="customRadio2" path="role"  />
                    <br> <br>
                    <center><button type="submit" class="btn btn-primary"><s:message code="user.account.btnUpdate"/></button></center>
	</form:form>
              </div>
          </div>
                    </div><!-- col-sm-8 -->
                </div><!-- row -->
            </div><!-- container -->

        </div><!-- about-section -->    
        
    </body>
</html>
