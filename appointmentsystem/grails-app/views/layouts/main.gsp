<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>

    <asset:stylesheet src="application.css"/>
    <g:layoutHead/>
</head>
<g:img uri="https://hardysigns.co.uk/wp-content/uploads/2019/06/NHS-Hardy-Signs-Clients.png" width="60" height="60"/>
<body>
<g:datePicker name="myDate" value="${new Date()}"/>
<nav class="navbar navbar-expand-lg navbar-dark navbar-static-top" role="navigation">
    <div class="container-fluid">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" aria-expanded="false" style="height: 0.8px;" id="navbarContent">
            <ul class="nav navbar-nav ml-auto">
                <g:pageProperty name="page.nav"/>
            </ul>
  <div class="row">

 </div>       
        </div>
    </div>
</nav>
<g:layoutBody/> 

 <g:loginToggle />
 
Version <g:meta name="info.app.version"/>
Built with Grails <g:meta name="info.app.grailsVersion"/>









<div class="footer" role="contentinfo">
    <div class="container-fluid">
        <div class="row">
            <div class="col">
            
            
                    
            
            </div>
        </div>
    </div>
</div>

<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
