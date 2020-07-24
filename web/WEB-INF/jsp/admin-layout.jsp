<%-- 
    Document   : admin-layout
    Created on : Feb 27, 2020, 5:31:21 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.servletContext.contextPath}/">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ABC Group</title>
        <!-- Font Awesome Icons -->
        <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
        <!-- IonIcons -->
        <link rel="stylesheet" href="http://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="dist/css/adminlte.min.css">
        <!-- Google Font: Source Sans Pro -->
        <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
        <script src="js/jquery-1.10.2.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    </head>
    <body class="hold-transition sidebar-mini">
        <div class="wrapper">
<!-- Navbar -->
    <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#"><i class="fas fa-bars"></i></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="admin/user/top10.htm" class="nav-link"><s:message code="layout.admin.nav.home"/></a>
      </li>
      <li class="nav-item d-none d-sm-inline-block">
        <a href="admin/user/top10.htm" class="nav-link"><s:message code="layout.admin.nav.contact"/></a>
      </li>
    </ul>

    <!-- SEARCH FORM -->
    <form class="form-inline ml-3">
      <div class="input-group input-group-sm">
        <input class="form-control form-control-navbar" type="search" placeholder="Search" aria-label="Search">
        <div class="input-group-append">
          <button class="btn btn-navbar" type="submit">
            <i class="fas fa-search"></i>
          </button>
        </div>
      </div>
    </form>

    <!-- Right navbar links -->
    <ul class="navbar-nav ml-auto">
      <!-- Notifications Dropdown Menu -->
      <a href="#" data-lang="en" style="color: black; margin-right: 5px; margin-top: 7px;">English |</a>
      <a href="#" data-lang="vi" style="color: black; margin-right: 5px; margin-top: 7px;">Tiếng Việt </a>
      <li style="margin-top: 7px;"><a href="admin/user/logout.htm"> <s:message code="layout.admin.nav.logout"/> </a></li>
      <li class="nav-item">
        <a class="nav-link" data-widget="control-sidebar" data-slide="true" href="#">
          <i class="fas fa-th-large"></i>
        </a>
      </li>
    </ul>
    </nav>
 <!-- /.navbar -->
     <!-- Main Sidebar Container -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4" >
    <!-- Brand Logo -->
    <a href="admin/user/top10.htm" class="brand-link">
      <img src="dist/images/abc.jpg" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
           style="opacity: .8">
      <span class="brand-text font-weight-light">ABC GROUP</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user panel (optional) -->
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
        <div class="info">
          <a href="admin/user/update-info.htm" class="d-block">Welcome: ${nameuser}</a>
        </div>
      </div>
        
      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          <li class="nav-item has-treeview menu-open">
            <a href="admin/user/top10.htm" class="nav-link active">
              <i class="fas fa-home"></i>
              <p>
                <s:message code="layout.admin.menu.home.title"/>
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
                <li class="nav-item">
                    <a href="admin/user/top10.htm" class="nav-link active">
                      <i class="far fa-circle nav-icon"></i>
                      <p><s:message code="layout.admin.menu.home.top10"/></p>
                    </a>
                  </li>
            </ul>
          </li>
          <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="far fa-user" style="padding-left: 5px;"></i>
              <p style="padding-left: 10px;">
                <s:message code="layout.admin.menu.account.title"/>
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="admin/user/update-info.htm" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p><s:message code="layout.admin.menu.account.updateInfo"/></p>
                </a>
              </li>
              <li class="nav-item">
                <a href="admin/user/index.htm" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p><s:message code="layout.admin.menu.account.accManager"/></p>
                </a>
              </li>
            </ul>
          </li>
          <li class="nav-item has-treeview">
            <a href="admin/staff/index.htm" class="nav-link">
                <i class="fas fa-users" style="padding-left: 5px;"></i>
              <p style="padding-left: 10px;">
                <s:message code="layout.admin.menu.staff.title"/>
              </p>
            </a>
          </li>
          <li class="nav-item has-treeview">
            <a href="admin/depart/index.htm" class="nav-link">
                <i class="fas fa-building" style="padding-left: 5px;"></i>
              <p style="padding-left: 10px;">
                <s:message code="layout.admin.menu.depart.title"/>
              </p>
            </a>
          </li>
          <li class="nav-item has-treeview">
            <a href="admin/record/index.htm" class="nav-link">
                <i class="fas fa-trophy" style="padding-left: 5px;"></i>
              <p style="padding-left: 10px;">
                <s:message code="layout.admin.menu.record.title"/>
              </p>
            </a>
          </li>
          <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-table"></i>
              <p>
                 <s:message code="layout.admin.menu.general.title"/>
                <i class="fas fa-angle-left right"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="admin/general/staff.htm" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p><s:message code="layout.admin.menu.general.perAchi"/></p>
                </a>
              </li>
              <li class="nav-item">
                <a href="admin/general/depart.htm" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p><s:message code="layout.admin.menu.general.depAchi"/></p>
                </a>
              </li>
            </ul>
          </li>
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
    </aside>

      <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper" >
    <!-- Main content -->
    <div class="content" style="margin-left: 20px; margin-right: 20px;">
      <jsp:include page="${param.view}"/>
    </div>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
      <!-- Main Footer -->
  <footer class="main-footer">
    
  </footer>
  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->    

<!-- jQuery -->
<script src="plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE -->
<script src="dist/js/adminlte.js"></script>

<!-- OPTIONAL SCRIPTS -->
<script src="plugins/chart.js/Chart.min.js"></script>
<script src="dist/js/demo.js"></script>
<script src="dist/js/pages/dashboard3.js"></script>
<script>
    $(function(){
            $("a[data-lang]").click(function(){
                    var lang = $(this).attr("data-lang");
                    $.get("admin/user/top10.htm?language="+ lang, function(){
                            location.reload();
                    });
                    return false;
            });
    });
    </script>
    </body>
</html>
