<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
		<link rel="stylesheet" href="/resources/css/style.css">
		<title>Homepage</title>
		
		<script type="text/javascript">
			/* =============================
			This script generates sample text for the body content. 
			You can remove this script and any reference to it. 
			 ============================= */
			var bodyText=["The smaller your reality, the more convinced you are that you know everything.", "If the facts don't fit the theory, change the facts.", "The past has no power over the present moment.", "This, too, will pass.", "</p><p>You will not be punished for your anger, you will be punished by your anger.", "Peace comes from within. Do not seek it without.", "<h3>Heading</h3><p>The most important moment of your life is now. The most important person in your life is the one you are with now, and the most important activity in your life is the one you are involved with now."]
			function generateText(sentenceCount){
				for (var i=0; i<sentenceCount; i++)
				document.write(bodyText[Math.floor(Math.random()*7)]+" ")
			}
		</script>	
	
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
						<h3>Post Showcase</h3>
						<p><script>generateText(10)</script></p>
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