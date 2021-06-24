<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<title>Posts</title>
        <!-- TODO : spostare su file resources/static/style.css -->
		<style type="text/css">
		
			body {
				margin:0;
				padding:0;
				font-family: Sans-Serif;
				line-height: 1.5em;
			}
			
			#header {
				background: #ccc;
				height: 100px;
			}
			
			#header h1 {
				margin: 0;
				padding-top: 0.8em;
                text-align: center;
			}
			
			main {
				padding-bottom: 10010px;
				margin-bottom: -10000px;
				float: left;
				width: 100%;
			}
			
			#footer {
				clear: left;
				width: 100%;
				background: #ccc;
				text-align: center;
				padding: 4px 0;
			}
	
			#wrapper {
				overflow: hidden;
			}
						
			#content h1, h3 {
                text-align: center;
            }
			
			.innertube {
				margin: 15px;
				margin-top: 0;
                padding-top: 0;
			}

            .innertube h3 {
                padding-top: 0.8em;
            }

            .innertube h1 {
                padding-top: 0.4em;
                margin-top: 0.4em;
            }
		
			p {
				color: #555;
			}
		
		</style>
	</head>
	
	<body>		

		<header id="header">
			<div class="innertube">
				<h1>Post Visualizer</h1>
			</div>
		</header>
		
		<div id="wrapper">
			<main>
				<div id="content">
					<div class="innertube">
						<h3>Post Showcase test</h3>
						<!-- cards contenenti i post qui! -->
                        <c:forEach items="${posts}" var="item">
                            <div class="card text-center bg-light" style="width: 18rem;">
                                <div class="card-header">${item.author}</div>
                                <div class="card-body">
                                    <p class="card-text">${item.text}</p>
                                    <br />
                                    <span class="datetime">${item.date}</span>
                                    <span> - </span>
                                    <span class="datetime">${item.time}</span>
                                </div>
                            </div>
                        </c:forEach>
					</div>
				</div>
			</main>
		
		</div>
		
		<footer id="footer">
			<div class="innertube">
				<p>&copy; 2021 Gabriel Bizzo</p>
			</div>
		</footer>
	
	</body>
</html>
