<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link rel="stylesheet" href="/resources/css/style.css">
		<title>Posts</title>
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
						<h3>Post Showcase:</h3>
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
                    <h5>Click <a href="/index">HERE</a> to visit the homepage!</h5>
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
