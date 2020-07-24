<%-- 
    Document   : update-info
    Created on : Mar 6, 2020, 3:55:34 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.servletContext.contextPath}/">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div class="education-section section">
        <div class="container">
                <div class="row">
                    <div class="col-sm-4">
                        <div class="heading">
                                <h3><b><s:message code="user.updInfo.title"/></b></h3>
                                <h6 class="font-lite-black"><b><s:message code="user.updInfo.title.updInfo"/></b></h6>
                        </div>
                    </div><!-- col-sm-4 -->
                    <div class="col-sm-8">
                        <p class="text-success" >${message}</p>
        <p class="text-success" >${messageimg}</p>
        <div class="insert-row1">
        <div class="insert-row1 col2">
            <img src="images/${avt}" name="test" style="width: 200px; height: 120px; margin-left: 35px;"  /> <br>  <br>
            <form:form action="user/updateimg.htm"  modelAttribute="staff" method="post" enctype="multipart/form-data">
            <form:hidden  path="id" cssClass="form-control"/>
            <form:input type="file" id="txtimg" path="photo" onchange="getnameimg();" /> <br>
             <br>
            <button type="submit" class="btn btn-primary" style="margin-left: 70px;"><s:message code="user.updInfo.btnUpdateImg"/></button>
        </form:form>
        </div>
        <div class="insert-row1 col1">
        <form:form action="user/updateinfostaff.htm"  modelAttribute="staff" method="post">
                <div class="form-group" style="margin-left: 150px;">
                <div class="col-8">
			<label><s:message code="user.updInfo.form.id"/></label>
			<form:input path="id" cssClass="form-control" disabled="true"/>
                        <form:hidden path="id" cssClass="form-control"/>
		</div>
		
		<div class="col-8">
			<label><s:message code="user.updInfo.form.fullname"/></label>
			<form:input path="name" cssClass="form-control"/>
		</div>
                <div class="col-8">
			<label><s:message code="user.updInfo.form.gender"/>:</label> <br>
                <div class="custom-control custom-radio custom-control-inline">
                    <form:radiobutton class="custom-control-input" id="customRadio1" path="gender" value="true" />
                    <label class="custom-control-label" for="customRadio1"><s:message code="user.updInfo.form.gender.male"/></label>
                    </div>
                <div class="custom-control custom-radio custom-control-inline">
                    <form:radiobutton class="custom-control-input" id="customRadio2" path="gender" value="false" />
                    <label class="custom-control-label" for="customRadio2"><s:message code="user.updInfo.form.gender.female"/></label>
                    </div>
                </div>
                </div>
                </div>
                    <div class="clear"></div>
                    <div class="form-row">
                <div class="col-4" style="margin-right: 170px;">
                    <label><s:message code="user.updInfo.form.birthday"/>:</label>
			<form:input type="date" path="birthday" cssClass="form-control"/>
		</div>
                <div class="col-4">
			<label><s:message code="user.updInfo.form.email"/>:</label>
			<form:input path="email" cssClass="form-control"/>
		</div>
                </div>
                <div class="form-row">
                <div class="col-4" style="margin-right: 170px;">
			<label><s:message code="user.updInfo.form.phone"/>:</label>
			<form:input path="phone" cssClass="form-control"/>
		</div>
                <div class="col-4">
			<label><s:message code="user.updInfo.form.salary"/>:</label>
			<form:input path="salary" cssClass="form-control" disabled="true"/>
                        <form:hidden path="salary" cssClass="form-control"/>
		</div>
                </div>
                <div class="form-row">
                <div class="col-4" style="margin-right: 170px;">
			<label><s:message code="user.updInfo.form.note"/>:</label>
			<form:input path="notes" cssClass="form-control"/>
		</div>
                <div class="col-4">
			<label><s:message code="user.updInfo.form.depart"/>:</label>
			<form:select path="depart.id" cssClass="form-control"
				items="${departs}" itemValue="id" itemLabel="name"/>
		</div>
                        <form:hidden path="photo" cssClass="form-control"/>
                </div>
                </div>
                <br> <br>
                <button type="submit" style="margin: 20px; margin-left: 400px; " class="btn btn-primary" ><s:message code="user.updInfo.btnUpdate"/></button>
	</form:form>
                </div><!-- row -->
            </div><!-- container -->

        </div><!-- about-section -->
        </div>
 <style>
    .insert-row1{
    width: 100%;
    float:left;
    
}
.insert-row1 .col1{
    width: 65%;
    float:left;
    margin-left: 110px;
}
.insert-row1 .col2{
    width: 15%;
    float:left;

    
}
.clear{
    clear: both;
}

</style>
<script>

function getnameimg(){
var s = document.getElementById("txtimg").value;
s = s.slice(12)
document.images['test'].src ='images/'+s;
}
</script>
    </body>
</html>
