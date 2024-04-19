
<% 
  String error = (String) request.getAttribute("error");
%>
<!DOCTYPE html>
<html lang="en"> 
<head>
    <title>Authentification</title>
    
    <!-- Meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <meta name="description" content="Portal - Bootstrap 5 Admin Dashboard Template For Developers">
    <meta name="author" content="Xiaoying Riley at 3rd Wave Media">    
    <link rel="shortcut icon" href="favicon.ico"> 
    
    <!-- FontAwesome JS-->
    <script defer src="css/allmin.js"></script>
    
    <!-- App CSS -->  
    <link id="theme-style" rel="stylesheet" href="css/portal.css">

</head> 

<body class="app app-login p-0">    	
    <div class="row g-0 app-auth-wrapper">
	    <div class="col-12 col-md-7 col-lg-6 auth-main-col text-center p-5">
		    <div class="d-flex flex-column align-content-end">
			    <div class="app-auth-body mx-auto">	
				    <div class="app-auth-branding"><a class="app-logo" href="index.html"><img class="logo-icon me-2" src="images/logo.png" alt="logo" style="width:200px;"></a></div>
					<h2 class="auth-heading text-center mb-3">Log in as Admin</h2>
					<% if(error!=null){ %>
					<div class="alert alert-danger" role="alert"><%=error %></div>
					<%} %>
			        <div class="auth-form-container text-start">
						<form class="auth-form login-form" action="connect.com" method="get">         
							<div class="email mb-3">
								<label class="sr-only">username</label>
								<input  name="username" type="text" class="form-control signin-email" placeholder="username" required>
							</div><!--//form-group-->
							<div class="password mb-3">
								<label class="sr-only">Password</label>
								<input  name="password" type="password" class="form-control signin-password" placeholder="Password" required>
								<div class="extra mt-3 row justify-content-between">
									<div class="col-6">
										<div class="form-check">
											<input class="form-check-input" type="checkbox" value="" id="RememberPassword">
											<label class="form-check-label" for="RememberPassword">
											Remember me
											</label>
										</div>
									</div><!--//col-6-->
								</div><!--//extra-->
							</div><!--//form-group-->
							<div class="text-center">
								<button type="submit" class="btn app-btn-primary w-100 theme-btn mx-auto">Login</button>
							</div>
						</form>
						
						
					</div><!--//auth-form-container-->	

			    </div><!--//auth-body-->
		    
			    <footer class="app-auth-footer">
				   
			    </footer><!--//app-auth-footer-->	
		    </div><!--//flex-column-->   
	    </div><!--//auth-main-col-->
	    <div class="col-12 col-md-5 col-lg-6 h-100 auth-background-col">
	    
		    <div class="auth-background-holder">
		    <div class="auth-background-holder d-flex justify-content-center align-items-center">
        <img alt="" src="images/login-foto.jpg" style="width:600px; height:500px; right:20px;">
    </div>
		    </div>
		    <div class="auth-background-mask"></div>
		    <div class="auth-background-overlay p-3 p-lg-5">
			    <div class="d-flex flex-column align-content-end h-100">
				    <div class="h-100"></div>
				   
				</div>
		    </div><!--//auth-background-overlay-->
	    </div><!--//auth-background-col-->
    
    </div><!--//row-->


</body>
</html> 