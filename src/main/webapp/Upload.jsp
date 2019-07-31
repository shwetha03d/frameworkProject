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
    <!-- header -->
    <header>
        <div class="container">
            <div class="header py-2 px-sm-2 px-1">
                <!-- logo -->
                <div id="logo">
                    <h1><a href="Landing.jsp">My Institution</a></h1>
                </div>
                <!-- //logo -->
                <!-- nav -->
                <div class="nav_w3ls ml-lg-5">
                    <nav>
                        <label for="drop" class="toggle">Menu</label>
                        <input type="checkbox" id="drop" />
                        <ul class="menu">
                            <li><a href="SignIn.jsp">SignIn</a></li> 
                           <!--  <li><a href="LogOut.ams">SignOut</a></li>  -->
                            <li><a href="Upload.jsp">Upload</a></li> 
                           
                        </ul>
                    </nav>
                </div>
                <!-- //nav -->
            </div>
        </div>
    </header>
    <!-- //header -->

    <!-- inner banner -->
    <div class="inner-banner-w3ls py-5" id="home">
        <div class="container py-xl-5 py-lg-3">
            <!-- register  -->
            <div class="modal-body mt-md-2 mt-5">
            
                <h3 class="title-w3 mb-5 text-center text-wh font-weight-bold">Upload Assignment</h3>
                
                <h4 style="color: white;">${msg}</h4>
                <form action="UploadFile.ams" method="post"  enctype="multipart/form-data" >

                    <div class="form-group">
                        <label class="col-form-label">Email*</label>
                        <input type="email" class="form-control" placeholder="xxx@gmail.com" name="email"
                            required="">
                    </div>
					
					 <div class="form-group">
                        <label class="col-form-label">Pin*</label>
                        <input type="text" class="form-control" placeholder="pin" name="pin" required="">
                    </div>
					
					
                    <div class="form-group">
                        <label class="col-form-label">URL</label>
                        <input type="text" class="form-control" placeholder="URL" name="url" >
                    </div>
                    <p>----------------------------------OR-------------------------------------</p>
                    <div class="form-group">
                        <label class="col-form-label">FILE</label>
                        <input type="file" class="form-control"  name="file">
                    </div> 
               
                    
                    <button type="submit" class="btn button-style-w3">Upload</button>
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