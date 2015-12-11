<html>
    <head>
           <title>Random App1</title>
           <g:javascript library="jquery" />
       </head>
        <body>
        	<ul id="menu">
            	<li>
                	<g:remoteLink action="ajaxRandom" update="quote">
                    Next Quote
                    </g:remoteLink>
                </li>
                <li>
              		<g:link action="index">
                  		Admin
              		</g:link>
				</li> 
			</ul> 
            <div id="app1">
            	<q>${app1.content}</q>
                <p>${app1.author}</p>
            </div>
        </body>
</html>