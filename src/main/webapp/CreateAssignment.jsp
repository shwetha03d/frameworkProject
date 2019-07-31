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
                <h3 class="title-w3 mb-5 text-center text-wh font-weight-bold">Create Assignment</h3>
                <h3> <label class="col-form-label">${pin}</label></h3>
                <form action="CreateAssignment.ams" method="post">
                    
                    <div class="form-group">
                            <label class="col-form-label">Course*</label>
                        <select class="form-control" name="course">
                            <option>---Select---</option>
                            <option>Core Java</option>
                            <option>Hibernate</option>
                            <option>Spring</option>
                            <option>JEE</option>
                            <option>My-SQL</option>
                             <option>WebTechnology</option>
                             <option>Angular</option>

                        </select>

                    </div>

                     
                    <div class="form-group">
                            <label class="col-form-label">Topic*</label>
                        <select class="form-control" name="topic">
                            <option value="">---Select---</option>
                            <optgroup label="core Java">
                            
                            <option value="oops">OOPS</option>
                            <option value="threads">Thread</option>
                            <option value="strings">Strings</option>
                            <option value="collection">Collection</option>
                             <option value="fileHandling">FileHandling</option>
                              <option value="arrays">Arrays</option>
                               
							</optgroup>
                            <optgroup label="Hibernate">
                            
                            <option value="Component">Component</option>
                            <option value="ORM problems">ORM problems</option>
                            <option value="JPA">JPA</option>
                            <option value="SDP">Singleton Design Pattern</option>
                            <option value="HibernateCache">HibernateCache</option>
                            <option value="Connection Pooling">Connection Pooling</option>
                            
                            </optgroup>
                            <optgroup label="Spring">
                            
                            <option value="spring Architecture">Spring Architecture</option>
                            <option value="container">Spring Container</option>
                            <option value="bean life cycle">Spring bean life cycle</option>
                            <option value="scopes">Scopes of spring bean</option>
                            <option value="configurations">Spring java configuration</option>
                            <option value="Ioc">IOC</option>
                            <option value="mvc">MVC Architecture</option>
                           
                            </optgroup>
                            
                             <optgroup label="JEE">
                            
                            <option value="jdbc">JDBC connection</option>
                            <option value="CRUD">CRUD operations</option>
                            <option value="bean life cycle">Spring bean life cycle</option>
                            <option value="servlet">Servlet Architecture</option>
                            <option value="lifecycle">Servlet LifeCycle</option>
                            <option value="scopes">Scopes of servlet</option>
                            <option value="jsplifecycle">JSP Life Cycle</option>
  								
  								</optgroup>
  								
  								  
                            <optgroup label="WebTechnology">
                            
                            <option value="html">HTML tags</option>
                            <option value="Css">Types of CSS</option>
                            <option value="Bootstrap">Using Bootstrap Templates</option>
                            
                            </optgroup>
  								
  								  
                            <optgroup label="My-SQL">
                            
                            <option value="dbms">DBMS</option>
                            <option value="Joins">Joins</option>
                            <option value="primary key">Primary Key</option>
                            <option value="ddl">DDL</option>
                            <option value="dml">DML</option>
                            <option value="normalization">Normalization</option>
                            <option value="triggers">Triggers</option>
                           
                            </optgroup>
  						
						</select>
                    </div>
                    <div class="form-group">
                            <label class="col-form-label">Description</label>
                            <input type="text" class="form-control" placeholder="" name="description" required="">
                        </div>
                     
                        <div class="form-group">
                                <label class="col-form-label">Deadline</label>
                                <input type="date" class="form-control" placeholder="" name="deadline" required="">
                            </div>
                         

                    <div class="form-group">
                            <label class="col-form-label">Upload Type</label>
                        <select class="form-control" name="uploadType">
                            <option>GIT</option>
                            <option>ZIP</option>
                            <option>File</option>
                         </select>

                    </div>
                    <button type="submit" class="btn button-style-w3">Create</button>
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