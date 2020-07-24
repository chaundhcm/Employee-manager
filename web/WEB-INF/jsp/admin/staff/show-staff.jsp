<%-- 
    Document   : index
    Created on : Feb 22, 2020, 2:56:46 AM
    Author     : PC
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="entity.Select"%>
<%@page import="controller.RecordController"%>
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
    </head>
    <body>
        <h2 style="padding: 10px; font-weight: bold"><s:message code="admin.staff.showStaff.title"/></h2>
        <p class="text-success" >${message}</p>
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header pb-0">
                  <div class="form-row">
                  <div class="form-group col-7">
                  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modal-lg">
                  <s:message code="admin.staff.showStaff.btnNew"/>
                </button>
                      </div>
                  <div class="form-group col-3">
                      <form action="admin/record/search.htm" >
                    <div class="form-group col-12">
                    <select  id="scripts" name="depart_id" class="form-control">
                        <option value="All" label="All" selected="${depart_id}" />
                        <%
                            RecordController dao = new RecordController();
                            ArrayList<Select> ds = dao.fillAllDepart();
                            for(int i =0; i<ds.size();i++){
                                out.print("<option value="+ds.get(i).getId()+">"+ds.get(i).getName()+"</option>");
                            }
                        %>
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
                  <table class="table table-head-fixed text-nowrap" >
                  <thead>
                    <tr style="text-align: center">
                      <th><s:message code="admin.staff.showStaff.table.id"/></th>
                      <th><s:message code="admin.staff.showStaff.table.fullname"/></th>
                      <th><s:message code="admin.staff.showStaff.table.gender"/></th>
                      <th><s:message code="admin.staff.showStaff.table.birthday"/></th>
                      <th><s:message code="admin.staff.showStaff.table.photo"/></th>
                      <th><s:message code="admin.staff.showStaff.table.email"/></th>
                      <th><s:message code="admin.staff.showStaff.table.depart"/></th>
                      <th></th>
                    </tr>
                  </thead>
                  <tbody id="myTable">
                    <c:forEach var="u" items="${staffs}">
                        <tr style="text-align: center">
                      <td>${u.id}</td>
                      <td>${u.name}</td>
                      <td>${u.gender?"Nam":"Nữ"}</td>
                      <td>${u.birthday}</td>
                      <td><img src="images/${u.photo}" style="width: 50px; height: 50px;"/></td>
                      <td>${u.email}</td>
                      <td><span class="badge badge-success">${u.depart.name}</span></td>
                      <td>
                          <a href="admin/staff/upd/${u.id}.htm" class="fas fa-edit" />
                          <a href="admin/staff/delete/${u.id}.htm" class="fas fa-trash-alt" style="padding-left: 10px;" />
                          <a href="admin/staff/assess/${u.id}.htm" class="fas fa-award" style="padding-left: 10px;" />
                      </td>
                    </tr>
                    </c:forEach>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
        </div>
        <div class="clear" style="margin-bottom: 90px;"></div>
<!-- Modal -->
      <div class="modal fade" id="modal-lg">
        <div class="modal-dialog modal-lg">
          <div class="modal-content">
            <div class="modal-header">
              <h4 class="modal-title">Thêm mới Staff</h4>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
                <!----- -->
                <form:form action="admin/staff/insert.htm"  modelAttribute="staff" method="post" onsubmit="return validateform()">
               <div class="insert-row1">
               <div class="insert-row1 col1">
                <div class="col-8">
			<label>ID</label>
                        <form:input path="id" cssClass="form-control" style="width=1000px;" />
		</div>
		<div class="col-8">
			<label>Tên</label>
                        <form:input path="name" cssClass="form-control" style="width=1000px;" />
                </div>
                <div class="col-8">
			<label>Giới tính:</label> <br>
                <div class="custom-control custom-radio custom-control-inline">
                    <form:radiobutton class="custom-control-input" id="customRadio1" path="gender" value="true" />
                    <label class="custom-control-label" for="customRadio1">Nam</label>
                    </div>
                <div class="custom-control custom-radio custom-control-inline">
                    <form:radiobutton class="custom-control-input" id="customRadio2" path="gender" value="false" />
                    <label class="custom-control-label" for="customRadio2">Nữ</label>
                    </div>
                </div>
                </div>
                <div class="insert-row1 col2">
                <div class="form-control-file">
                    <label>Ảnh:</label>
                    <img src="images/adduser.jpg" name="test" style="width: 200px; height: 120px;"  /> <br><br>
                    <form:input type="file" id="txtimg" path="photo"  onchange="getnameimg();" />
		</div>
                </div>
                </div>
                <div class="clear"/>
                <div class="insert-row2">
                <div class="form-row">
                <div class="col-5" style="margin-right: 100px;">
			<label>Ngày sinh:</label>
			<form:input type="date" path="birthday" cssClass="form-control"/>
		</div>
                <div class="col-5">
			<label>Email:</label>
			<form:input path="email" cssClass="form-control"/>
		</div>
                </div>
                <div class="form-row">
                <div class="col-5" style="margin-right: 100px;">
			<label>SĐT:</label>
			<form:input path="phone" cssClass="form-control"/>
		</div>
                <div class="col-5">
			<label>Lương:</label>
			<form:input path="salary" cssClass="form-control"/>
		</div>
                </div>
                <div class="form-row">
                <div class="col-5" style="margin-right: 100px;">
			<label>Ghi chú:</label>
			<form:input path="notes" cssClass="form-control"/>
		</div>
                <div class="col-5">
			<label>Phòng ban:</label>
			<form:select path="depart.id" cssClass="form-control"
				items="${departs}" itemValue="id" itemLabel="name"/>
		</div>
                </div>
                </div>
                <hr>
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary" style="margin-left: 600px;" >Lưu</button>
<!--                    <button type="submit" class="btn btn-primary" style="margin-left: 500px;" >Lưu</button>-->
	</form:form>    

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
<script>
function getnameimg(){
var s = document.getElementById("txtimg").value;
s = s.slice(12)
document.images['test'].src ='images/'+s;
}
</script>
    <style>
    .insert-row1{
    width: 100%;
    float:left;
    margin-bottom: 10px;
    
}
.insert-row1 .col1{
    width: 65%;
    float:left;
}
.insert-row1 .col2{
    width: 25%;
    float:left;
}
.clear{
    clear: both;
}
    .insert-row2{
    width: 100%;
    margin-left: 11px;
}
</style>
    </body>

</html>
