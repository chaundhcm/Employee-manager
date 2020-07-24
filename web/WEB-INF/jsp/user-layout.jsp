<%-- 
    Document   : user-layout
    Created on : Feb 27, 2020, 5:31:33 PM
    Author     : PC
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="entity.Select"%>
<%@page import="controller.RecordController"%>
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
        <script src="js/jquery-1.10.2.min.js"></script>
        <!-- Font -->
	
	<link href="https://fonts.googleapis.com/css?family=Poppins:400,500,600,700%7CAllura" rel="stylesheet">
	
	<!-- Stylesheets -->
	
	<link href="common-css/bootstrap.css" rel="stylesheet">
	
	<link href="common-css/ionicons.css" rel="stylesheet">
	
	<link href="common-css/fluidbox.min.css" rel="stylesheet">
	
	<link href="01-cv-portfolio/css/styles.css" rel="stylesheet">
	
	<link href="01-cv-portfolio/css/responsive.css" rel="stylesheet">
        <script src="js/jquery-1.10.2.min.js"></script>
        
    </head>
    <body>
    <header>
        <c:forEach var="u" items="${staffs}">
        <div class="container">
            <div class="heading-wrapper">
                <div class="row">
                    <div class="col-sm-6 col-md-6 col-lg-4">
                        <div class="info">
                            <i class="icon ion-ios-telephone-outline"></i>
                            <div class="right-area">
                                <h5><s:message code="layout.user.phone"/></h5>
                                <h6>${u.phone}</h6>
                            </div><!-- right-area -->
                        </div><!-- info -->
                    </div><!-- col-sm-4 -->
                    <div class="col-sm-6 col-md-6 col-lg-4">
                        <div class="info">
                            <i class="icon ion-ios-chatboxes-outline"></i>
                            <div class="right-area">
                                <h5><s:message code="layout.user.contact"/></h5>
                                <h6>${u.email}</h6>
                            </div><!-- right-area -->
                        </div><!-- info -->
                    </div><!-- col-sm-4 -->
                    <div class="col-sm-6 col-md-6 col-lg-4" >
                        <div class="info" style="float: right;">
                            <div class="right-area">
                                <h5>Welcome</h5>
                                <h5>${nameuser}</h5>
                            </div><!-- right-area -->
                        </div><!-- info -->
                    </div><!-- col-sm-4 -->
                </div><!-- row -->
            </div><!-- heading-wrapper -->
            <a class="downlad-btn" href="user/logout.htm"><s:message code="layout.user.logout"/></a>
        </div><!-- container -->
    </header>
    <div class="intro-section">
        <div class="container">
            <div class="row">
                <div class="col-md-1 col-lg-2"></div>
                <div class="col-md-10 col-lg-8">
                    <div class="intro">
                        <div class="profile-img"><img src="images/${u.photo}" alt=""></div>
                        <h2><b>${u.name}</b></h2>
                        <h4 class="font-yellow">${u.depart.name}</h4>
                        <ul class="information margin-tb-30">
                            <li><b><s:message code="layout.user.birthday"/> : </b>${u.birthday}</li>
                            <li><b><s:message code="layout.user.gender"/> : </b>${u.gender?"Nam":"Nữ"}</li>
                            <li><b><s:message code="layout.user.salary"/> : </b>${u.salary}</li>
                            <li><b><s:message code="layout.user.note"/> : </b>${u.notes}</li>
                        </ul>
                        <ul class="social-icons">
                            <li><a href="#"><i class="ion-social-pinterest"></i></a></li>
                            <li><a href="#"><i class="ion-social-linkedin"></i></a></li>
                            <li><a href="#"><i class="ion-social-instagram"></i></a></li>
                            <li><a href="#"><i class="ion-social-facebook"></i></a></li>
                            <li><a href="#"><i class="ion-social-twitter"></i></a></li>
                        </ul>
                    </div><!-- intro -->
                </div><!-- col-sm-8 -->
            </div><!-- row -->
        </div><!-- container -->
    </div><!-- intro-section -->
    </c:forEach>
    <div class="portfolio-section section" style="margin-top: -50px; margin-bottom: 10px;">
        <div class="container">
            <div class="row">
                <div class="col-sm-12 " style="padding-left: 410px;">
                    <div class="portfolioFilter clearfix margin-b-80">
						<a href="user/updatestaff.htm" ><b><s:message code="layout.user.info"/></b></a>
						<a href="user/record.htm" ><b><s:message code="layout.user.assess"/></b></a>
						<a href="user/bxh.htm" ><b><s:message code="layout.user.rankings"/></b></a>
						<a href="user/update.htm" ><b><s:message code="layout.user.account"/></b></a>
					</div><!-- portfolioFilter -->
                </div><!-- col-sm-12 --> 
            </div><!-- row -->
        </div><!-- container -->
    </div>
    <div class="tab-content" id="pills-tabContent">
           	<div >
      <jsp:include page="${param.view}"/>
    </div>          
    </div>
    
    <div class="counter-section" id="counter">
        <div class="container">
            <c:forEach var="q" items="${countTT}">
            <div class="row">
                <div class="col-sm-6 col-md-6 col-lg-3" style="margin-left:120px;">
                    <div class="counter margin-b-30" >
                        <h1 class="title"><b><span class="counter-value"  >${q[0]}</span></b></h1>
                        <h5 class="desc"><b><s:message code="layout.user.achievements"/></b></h5>
                    </div><!-- counter -->
                </div><!-- col-md-3-->
                <div class="col-sm-6 col-md-6 col-lg-3">
                    <div class="counter margin-b-30">
                        <h1 class="title"><b><span class="counter-value" >${q[1]}</span></b></h1>
                        <h5 class="desc"><b><s:message code="layout.user.discipline"/></b></h5>
                    </div><!-- counter -->
                </div><!-- col-md-3-->
                <div class="col-sm-6 col-md-6 col-lg-3">
                    <div class="counter margin-b-30">
                        <h1 class="title"><b><span class="counter-value" >${q[2]}</span></b></h1>
                        <h5 class="desc"><b><s:message code="layout.user.total"/></b></h5>
                    </div><!-- margin-b-30 -->
                </div><!-- col-md-3-->
            </div><!-- row-->
            </c:forEach>
        </div><!-- container-->
</div><!-- counter-section-->

    <footer>
        <div class="row">
            <div class="col-12">
            <p class="copyright">
                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="ion-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">ABC Group</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
        <a href="#" data-lang="vi" style="color: white; margin-right: 5px; float: right;">Tiếng Việt </a>
        <a href="#" data-lang="en" style="color: white; margin-right: 5px; float: right;">English |</a>
      
        </div>
        </div>
    </footer>
	<!-- SCIPTS -->
	
	<script src="common-js/jquery-3.2.1.min.js"></script>
	
	<script src="common-js/tether.min.js"></script>
	
	<script src="common-js/bootstrap.js"></script>
	
	<script src="common-js/isotope.pkgd.min.js"></script>
	
	<script src="common-js/jquery.waypoints.min.js"></script>
	
	<script src="common-js/progressbar.min.js"></script>
	
	<script src="common-js/jquery.fluidbox.min.js"></script>
	
	<script src="common-js/scripts.js"></script>
        <script>
    $(function(){
            $("a[data-lang]").click(function(){
                    var lang = $(this).attr("data-lang");
                    $.get("user/index.htm?language="+ lang, function(){
                            location.reload();
                    });
                    return false;
            });
    });
    </script>

    </body>
    
</html>
