<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<link rel="stylesheet" href="/resources/css/style.css">
		<title>Homepage</title>	
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
						<h3 class="pb-4">Welcome to the Post Visualizer Web Application</h3>
						<h5 class="pb-4" >Visit the <a href="/posts">Post Showcase</a>...</h5>
						<h5 class="pb-5">... or create a new post filling the form below:</h5>
						<form class="insertPostForm" method="POST" action="/posts">
							<div class="boxing-form">
								<div class="form-group">
									<label for="author">Author Name</label>
									<input type="text" class="form-control" name="author" id="author" placeholder="Author">
								</div>
								<div class="form-group">
									<label for="text">Post's Text</label>
									<textarea class="form-control" aria-describedby="textHelp" id="text" name="text" rows="4"></textarea>
									<small id="textHelp" class="form-text text-muted">Max. 400 characters</small>
								</div>
								<div class="form-group">
									<button type="submit" class="btn btn-primary mb-2">Submit</button>
								</div>
							</div>
						</form>
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