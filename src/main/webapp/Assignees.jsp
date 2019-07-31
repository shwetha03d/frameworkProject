<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html lang="zxx">

<head>
    <title>Assignment Management</title>
    <!-- Meta tag Keywords -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8" />
    <meta name="keywords" content="My Institution Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script>
        addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
    <!-- //Meta tag Keywords -->

    <!-- Custom-Files -->
    <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
    <!-- Bootstrap-CSS -->
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <!-- Style-CSS -->
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <!-- Font-Awesome-Icons-CSS -->
    <!-- //Custom-Files -->

    <!-- Web-Fonts -->
    <link href="//fonts.googleapis.com/css?family=Lora:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext,vietnamese"
        rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700,800&amp;subset=latin-ext" rel="stylesheet">
    <!-- //Web-Fonts -->
</head>

<body>
        <header>
                <div class="container">
                    <div class="header py-4 px-sm-4 px-3">
                        <!-- logo -->
                        <div id="logo">
                            <h1><a href="LandingPage.jsp">X-workz</a></h1>
                        </div>
                        <!-- //logo -->
                        <!-- nav -->
                        <div class="nav_w3ls ml-lg-5">
                            <nav>
                                <label for="drop" class="toggle">Menu</label>
                                <input type="checkbox" id="drop" />
                                <ul class="menu">
                                    <li><a href="Home.jsp">Home</a></li>
                                    <li><a href="ChangeSettings.jsp">ChangeSettings</a></li>
                                    <li><a href="CreateAssignment.jsp">Create Assignment</a></li>
                                    <li><a href="Assignees.jsp">Assignees</a></li>
                                    <li><a href="SearchAssignment.jsp">Search</a></li>
                                    <li><a href="SignIn.jsp">LogOut</a></li>
                                   
                                </ul>
                            </nav>
                        </div>
                        <!-- //nav -->
                    </div>
                </div>
            </header>

    <!-- inner banner -->
    <div class="inner-banner-w3ls py-5" id="home">
        <div class="container py-xl-5 py-lg-3">
            <!-- register  -->
            <div class="modal-body mt-md-2 mt-5">
                <h3 class="title-w3 mb-5 text-center text-wh font-weight-bold">Assignee to Assignment</h3>
                <h3> <label class="col-form-label">${success}</label></h3>
                <form action="Assignees.ams"  method="post">
                  

                    <div class="form-group">
                            <label class="col-form-label">Pin</label>
                            <input type="number" class="form-control" placeholder="Enter Assigment pin" name="pin" required="">
                        </div>
                     
                    <div class="form-group">
                                    <label class="col-form-label">Email</label>
                                    <textarea rows="5" cols="10" class="form-control" placeholder="Enter emails here" name="email" required="">
                                </textarea>
                                    </div>

                            <button  type="submit" class="btn button-style">Assign</button>
                    </div>
                   
                </form>
            </div>
            <!-- //register -->
        </div>
    </div>
    <!-- //inner banner -->

    <!-- copyright -->
    <div class="copyright-w3ls py-4">
        <div class="container">
            <div class="row">
                <!-- copyright -->
                <p class="col-lg-8 copy-right-grids text-wh text-lg-left text-center mt-lg-2">© 2019 My Institution. All
                    Rights Reserved 
                  
                </p>
                <!-- //copyright -->
                
            </div>
        </div>
    </div>
    <!-- //copyright -->
    <!-- move top icon -->
    <a href="#home" class="move-top text-center">
        <span class="fa fa-angle-double-up" aria-hidden="true"></span>
    </a>
    <!-- //move top icon -->

</body>

</html>