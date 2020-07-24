<%-- 
    Document   : index
    Created on : Feb 22, 2020, 2:56:52 AM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <base href="${pageContext.servletContext.contextPath}/">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ABC Group</title>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.9/angular.min.js"></script>
    </head>
    <body>
        <h2 style="padding: 10px; font-weight: bold"><s:message code="admin.user.showUser.title"/></h2>
        <p class="text-success" >${message}</p>
<!--database0-->
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header pb-0">
                  <div class="form-row">
                  <div class="form-group col-7">
                  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modal-lg">
                  <s:message code="admin.user.showUser.btnNew"/>
                </button>
                      </div>
                  <div class="form-group col-3">
                      <form action="admin/record/search.htm" >
                    <div class="form-group col-12">
                    <select id="scripts" class="form-control">
                        <option value="All" label="All" />
                        <option value="ADMIN">ADMIN</option>
                        <option value="Nhân Viên">Nhân Viên</option>
                    </select>
                  </div>    
                  </form>
                  </div>
                  <div class="form-group col-2">
                <div class="card-tools">
                  <div class="input-group input-group-sm" style="width: 150px;">
                    <input type="text" name="table_search" class="form-control float-right" placeholder="Search" id="myInput" >
                    <div class="input-group-append">
                      <button type="submit" class="btn btn-default"><i class="fas fa-search"></i></button>
                    </div>
                  </div>
                </div>
                </div>
                      </div>
              </div>
              <div class="card-body table-responsive p-0" style="height: 300px;">
                  <table class="table table-head-fixed text-nowrap">
                  <thead>
                    <tr style="text-align: center">
                      <th><s:message code="admin.user.showUser.table.username"/></th>
                      <th><s:message code="admin.user.showUser.table.password"/></th>
                      <th><s:message code="admin.user.showUser.table.fullname"/></th>
                      <th><s:message code="admin.user.showUser.table.role"/></th>
                      <th></th>
                    </tr>
                  </thead>
                  <tbody id="myTable">
                    <c:forEach var="u" items="${users}">
                        <tr style="text-align: center">
                      <td>${u.username}</td>
                      <td>${u.password}</td>
                      <td>${u.fullname}</td>
                      <td>
                          <span class="badge badge-success">${u.role?"ADMIN":"Nhân Viên"}</span>
                      </td>
                      <td>
                          <a href="admin/user/upd/${u.username}.htm" class="fas fa-edit" />
                          <a href="admin/user/delete/${u.username}.htm" class="fas fa-trash-alt" style="padding-left: 10px;" />
                      </td>
                    </tr>
                    </c:forEach>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
<!-- Modal -->
      <div class="modal fade" id="modal-lg">
        <div class="modal-dialog modal-lg">
          <div class="modal-content">
            <div class="modal-header">
              <h4 class="modal-title">Thêm mới user</h4>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
                <!----- -->
                    <form action="admin/user/insert.htm" method="post">
                    <div class="form-group">
                    <label>Username:</label>
                    <input type="text" class="form-control" placeholder="Nhập username" name="username" required>
                    </div>
                    <div class="form-group">
                      <label>Password:</label>
                      <input type="password" class="form-control" placeholder="Nhập password" name="password" required>
                    </div>
                    <div class="form-group">
                    <label>Họ và Tên:</label>
                    <input type="text" class="form-control" placeholder="Nhập họ và tên" name="fullname" required>
                    </div>
                    <div class="form-group">
                    <label >Vai trò: </label>
                    </div>
                    <div class="custom-control custom-radio custom-control-inline">
                    <input type="radio" class="custom-control-input" id="customRadio1" name="role" value="true">
                    <label class="custom-control-label" for="customRadio1">ADMIN</label>
                    </div>
                    <div class="custom-control custom-radio custom-control-inline">
                    <input type="radio" class="custom-control-input" id="customRadio2" name="role" value="false">
                    <label class="custom-control-label" for="customRadio2">Nhân Viên</label>
                    </div>
                    <hr>
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary" style="margin-left: 600px;" >Lưu</button>
                    </form>

                <!-- ----->
            </div>
          </div>
          <!-- /.modal-content -->
        </div>
        <!-- /.modal-dialog -->
      </div>

    <script>
    $(document).ready(function(){
      $("#myInput").on("keyup", function() {
        var value = $(this).val().toLowerCase();
        $("#myTable tr").filter(function() {
          $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
        });
      });
    });
    </script>
<script>
(function() {
    // get references to select list and display text box
    var input;
    var sel = document.getElementById('scripts');
    document.getElementById('scripts').onchange = function () {
   input = sel.options[sel.selectedIndex].text;
   $("#myTable tr").filter(function() {
      $(this).toggle($(this).text().indexOf(input) > -1)
    });
    }
}());
</script> 
    </body>
    
</html>
