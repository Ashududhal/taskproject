<%@page import="com.pojo.Customer"%>
<%@page import="com.pojo.Stock"%>
<%@page import="java.util.List"%>
<%@page import="com.model.BlManager"%>
<%@ include file="PharmacyHeader.jsp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">
	<div class="row">
		<ol class="breadcrumb">
			<li><a href="#"><svg class="glyph stroked home">
						<use xlink:href="#stroked-home"></use></svg></a></li>
			<li class="active">Home</li>
		</ol>
	</div>
	<!--/.row-->

	<div class="row" style="padding-top: 20px;">
		<div class="col-lg-12">
			<!-- <h1 class="page-header">Widgets</h1> -->
		</div>
	</div>
	<!--/.row-->

	<%
		BlManager bm = new BlManager();
		List<Customer> list = bm.searchcustomer();
		session.setAttribute("list", list);
		List<Stock> list1 = bm.searchstock();
		session.setAttribute("list1", list1);
	%>

	<div class="row">
		<div class="col-md-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<b>Add To Cart...</b>
				</div>

				<div style="color: #00b300; text-align: center; font-size: 15px;">Admin</div>


				<div class="panel-body">
					<form class="form-horizontal" action="AddToCartController"
						method="post">
						<fieldset>


							<div class="form-group">
								<label class="col-md-3 control-label" for="name">Customer
									Name </label>
								<div class="col-md-4">
									<select name="cname" class="form-control">
										<c:forEach items="${sessionScope.list}" var="l">
											<option>${l.cname}</option>
										</c:forEach>
									</select>
								</div>
							</div>

							<br> <br>


							<div class="form-group">
								<label class="col-md-3 control-label" for="name">Select
									Medicine </label>
								<div class="col-md-4">
									<select name="mname" class="form-control">
										<c:forEach items="${sessionScope.list1}" var="l">
											<option>${l.mname}</option>
										</c:forEach>
									</select>
								</div>
							</div>

							<br> <br>
							<div class="form-group">
								<label class="col-md-3 control-label" for="name">Enter
									Price </label>
								<div class="col-md-2">
									<input id="name" name="price" type="number"
										class="form-control">
								</div>
							</div>
							<br> <br>


							<div class="form-group">
								<label class="col-md-3 control-label" for="name">Enter
									Quantity </label>
								<div class="col-md-2">
									<input id="name" name="quantity" type="number"
										class="form-control">
								</div>
							</div>

							<br> <br>

							<!-- Form actions -->
							<div class="col-sm-04"></div>
							<div class="col-sm-04">
								<div class="form-group">
									<div class="col-md-6 widget-right">
										<input type="submit" value="Add To Cart"
											class="btn btn-default btn-md pull-right">
									</div>
								</div>
							</div>

						</fieldset>
					</form>
				</div>
			</div>
		</div>



	</div>
	<!--/.row-->
</div>
<!--/.main-->