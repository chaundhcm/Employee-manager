<%-- 
    Document   : staff
    Created on : Mar 18, 2020, 11:31:48 PM
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
    </head>
    <body>
        <h2 style="padding: 10px; font-weight: bold"><s:message code="admin.general.staff.title"/></h2>
        <p class="text-success" >${message}</p>
        <div class="row">
          <div class="col-12">
            <div class="card">
              <div class="card-header pb-0">
                  <div class="form-row">
                  <div class="form-group col-2">
                  
                      </div>
                  <div class="form-group col-8">
                      <form action="admin/general/searchstaff.htm" >
                    <div class="row">
                    <div class="form-row col-3.5">
                        <input type="date" class="form-control" name="startdate" value="${startdate}" />
                    </div>
                    <div class="form-row col-3.5">
                        <input type="date" class="form-control" name="enddate" value="${enddate}" />
                    </div>
                    <div class="form-group col-3">
                    <select id="scripts" name="depart_id" class="form-control">
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
                    <div class="form-row col-2">
                    <button type="submit" class="btn btn-primary" style="height: 40px;"><i class="fas fa-filter"></i></button>
                    </div>
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
                      <th><s:message code="admin.general.staff.table.staffid"/></th>
                      <th><s:message code="admin.general.staff.table.fullname"/></th>
                      <th><s:message code="admin.general.staff.table.photo"/></th>
                      <th><s:message code="admin.general.staff.table.depart"/></th>
                      <th><s:message code="admin.general.staff.table.achievements"/></th>
                      <th><s:message code="admin.general.staff.table.discipline"/></th>
                      <th><s:message code="admin.general.staff.table.total"/></th>
                    </tr>
                  </thead>
                  <tbody id="myTable">
                    <c:forEach var="u" items="${liststaff}">
                      <tr style="text-align: center">
                      <td>${u[0]}</td>
                      <td>${u[1]}</td>
                      <td><img src="images/${u[2]}" style="width: 50px; height: 50px;"/></td>
                      <td><span class="badge badge-success">${u[3]}</span></td>
                      <td>${u[4]}</td>
                      <td>${u[5]}</td>
                      <th style=" font-weight: bold;">${u[6]}</th>
                    </tr>
                    </c:forEach>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
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
