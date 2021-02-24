<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<div class="panel panel-primary">
		<div class="panel-heading">Home Page</div>
		<div class="panel-body">
			<h1>
				Welcome ${name}!! <a type="button" class="btn btn-success"
					href="/list-todos">Click here</a> to manage your todo's.
			</h1>
		</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>