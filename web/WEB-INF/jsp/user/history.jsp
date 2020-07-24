<%-- 
    Document   : history
    Created on : Mar 6, 2020, 3:56:29 PM
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
                                <h3><b><s:message code="user.history.title"/></b></h3>
                                <h6 class="font-lite-black"><b><s:message code="user.history.title.achi"/></b></h6>
                        </div>
                    </div><!-- col-sm-4 -->
                    <div class="col-sm-8">
                        <div class="education-wrapper">
                            <c:forEach var="u" items="${records}">
                                <div class="education margin-b-50">
                                        <h4><b>${u.type?"THÀNH TÍCH":"KỶ LUẬT"}</b></h4>
                                        <h5 class="font-yellow"><b>${u.reason}</b></h5>
                                        <h6 class="font-lite-black margin-t-10">${u.date}</h6>
                                </div><!-- education -->
                            </c:forEach>
                        </div><!-- education-wrapper -->
                    </div><!-- col-sm-8 -->
                </div><!-- row -->
            </div><!-- container -->

        </div><!-- about-section -->
    </body>
</html>
