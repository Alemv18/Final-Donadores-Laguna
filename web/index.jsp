<%-- 
    Document   : index
    Created on : 26/11/2017, 09:26:48 PM
    Author     : juans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Donadores Laguna</title>
    <!-- Add company logo -->
    <link rel="shortcut icon" type="image/x-icon" href="./img/donadores.png"/>
    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic" rel="stylesheet" type="text/css">
    <link href='https://fonts.googleapis.com/css?family=Cabin:700' rel='stylesheet' type='text/css'>
    <!-- Custom styles-->
    <link rel="stylesheet" href="css/style.css">
    <link href="css/style.min.css" rel="stylesheet">
    <!-- Plugin CSS -->
    <link rel="stylesheet" href="device-mockups/device-mockups.min.css">
    <!-- <link rel="stylesheet" href="css/style.css">  --><!-- Resource style -->
    <script src="js/modernizr.js"></script> <!-- Modernizr -->
    
  </head>
  <body id="page-top">
    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
      <div class="container">
        <a class="navbar-brand js-scroll-trigger" href="#page-top"><img class="donadores-logo" src="./img/donadores.png" alt="donadores-logo"></a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        Menu
        <i class="fa fa-bars"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#about">Acerca de</a>
            </li>
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#download">Experiencias</a>
            </li>
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#contact">Requerimientos</a>
            </li>
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#contact">Contacto</a>
            </li>
            <li class="nav-item">
              <button id="login-btn" class="register-btn" >Iniciar Sesión</button>
            </li>
          </ul>
        </div>
      </div>
    </nav>
    
    <!--Login form -->
    <div id="login-overlay" class="overlay">
      <div id="login-form">
          
            <div class="close"></div>
            <div class="input-wr">
              <input id="usuarioU" type="text" name="user" placeholder="Correo Electrónico / Usuario" required>
              <div class="error-message">E-mail Inválido</div>
            </div>
            <div class="input-wr">
              <input id="passwordU" type="password" name="password" placeholder="Contraseña" required>
              <div class="error-message">Password Inválido</div>
            </div>
            <button type=""  id="userSubmit" class="btn-submit">Ingresar</button>
      </div>
    </div>
    <!-- Intro Header -->
    <header class="masthead">
      <div class="intro-body">
        <div class="container">
          <div class="row">
            <!--  <img class="life-line-img" src="./img/life-line.png" alt="life-line"> -->
            <div class="col-lg-8 mx-auto">
              <section class="cd-intro">
                <h1 class="cd-headline clip is-full-width">
                <span class="chain-headline">Somos una cadena de </span><br>
                <span class="cd-words-wrapper">
                  <b class="is-visible">amor</b>
                  <b>valores</b>
                  <b>ayuda</b>
                </span>
                </h1>
              </section>
              <div class="main-buttons">
                <div class="row">
                  <div class="col-md-6">
                    <a href="donor-register.html"><button id="donate-blood" class="donate-blood">Donar Sangre</button></a>
                  </div>
                  <div class="col-md-6">
                    <a href="receptor-register.html"><button class="search-blood">Buscar Donador</button></a>
                  </div>
                </div>
              </div>
              <a href="#about" class="btn btn-circle js-scroll-trigger">
                <i class="fa fa-angle-double-down animated"></i>
              </a>
            </div>
          </div>
        </div>
      </div>
    </header>
    <!-- About Section -->
    <section id="about">
      <div class="about-cnt">
        <div class="row">
          <div class="col-md-12 text-center">
            <img class="life-line" src="./img/life-line.png" alt="life-line">
            <p class="aboutus-txt">Somos una organización en la región lagunera que busca crear un enlace entre donador y donante.
            Nuestra misión es ayudar a salvar vidas y concientizar a la sociedad sobre la importancia de la donación de sangre.</p>
          </div>
        </div>
      </div>
    </section>
    <!-- Benefits Section -->
    <section id="benefits" class=" content-section benefits-section">
      <div class="row">
        <div class="col-md-12">
          <h3 class="general-title">Beneficios de Donar Sangre</h3>
        </div>
      </div>
      <div class="benefits-list">
        <div class="row">
          <div class="col-md-3 text-center">
            <div id="circle">
              <div class="heart">
                <i class="fa fa-heart-o icon" aria-hidden="true"></i>
              </div>
            </div>
            <label class="benefits-title-txt">Salvar vidas</label>
            <p class="benefits-txt">La sensación de que con nuestra contribución se están salvando vidas</p>
          </div>
          <div class="col-md-3 text-center">
            <div id="circle">
              <div class="heart">
                <i class="fa fa-male icon" aria-hidden="true"></i>
              </div>
            </div>
            <label class="benefits-title-txt">Prevención de cáncer</label>
            <p class="benefits-txt">Disminuir el riesgo de cáncer. Los niveles de hierro se mantienen a niveles bajos
            </div>
            <div class="col-md-3 text-center">
              <div id="circle">
                <div class="heart">
                  <i class="fa fa-arrow-circle-down icon" aria-hidden="true"></i>
                </div>
              </div>
              <label class="benefits-title-txt">Quema de calorías</label>
              <p class="benefits-txt"> Pérdida de peso. Esto ayuda a aquellas personas que tienen sobrepreso y adquieren un mayor riesgo de enfermedades cardiovasculares y otros desórdenes de la alimentación.</p>
            </div>
            <div class="col-md-3 text-center">
              <div id="circle">
                <div class="heart">
                  <i class="fa fa-heart-o icon" aria-hidden="true"></i>
                </div>
              </div>
              <label class="benefits-title-txt">Chequeo médico gratuito</label>
              <p class="benefits-txt"> Se realiza una serie de procedimientos médicos para determinar si el donador es candidato
              a donar. Si el donador realiza transfusiones con frecuencia, se puede conocer su estado de salud de manera frecuente, evitando enfermedades o anormalidades que se desconozcan.</p>
            </div>
          </div>
        </section>
        <!-- Parallax section -->
        <section id="free-section" class="parallax-window" data-parallax="scroll" data-image-src="./img/parallax.jpeg">
          <div class="container about-container">
            <div class="row">
              <div class="col-lg-12 text-center about-txt">
                <label class="free-txt">“Nos ganamos la vida con lo que recibimos, pero hacemos la vida con lo que damos...”. <br><strong> John Maxwell.</strong></label>
              </div>
            </div>
          </div>
        </section>
        <!-- How it works Section -->
        <section id="how-it-section" class="content-section text-center">
          <div class="container text-center">
            <div class="row">
              <div class="col-md-12 text-center">
                <h3 class="general-title">Proceso para realizar tu donación</h3>
                <div class="device">
                  <img class="device-mockup" src="./img/iphone-app.png" alt="iphone">
                </div>
              </div>
            </div>
          </div>
        </section>
      <!-- Blood transfusion requirements -->
      <section class="content-section text-center" id="portfolio">
        <div class="row">
          <div class="col-md-12">
            <h3 class="general-title requirements">Requerimientos para donar</h3>
          </div>
        </div>
        <div class="container-fluid  p-0">
          <div class="row no-gutters popup-gallery">
            <div class="col-lg-4 col-sm-6 list">
              <a class="portfolio-box" href="./img/portfolio/fullsize/1.jpg">
                <img class="img-fluid" src="./img/portfolio/thumbnails/1.jpg" alt="">
                <div class="portfolio-box-caption">
                  <div class="portfolio-box-caption-content">
                    <div class="project-name">
                      Tener 18 años o más...
                    </div>
                    <div class="project-button">
                      <button class="project-btn">Ver más...</button>
                    </div>
                  </div>
                </div>
              </a>
            </div>
            <div class="col-lg-4 col-sm-6">
              <a class="portfolio-box" href="./img/portfolio/fullsize/2.jpeg">
                <img class="img-fluid" src="./img/portfolio/thumbnails/2.jpeg" alt="">
                <div class="portfolio-box-caption">
                  <div class="portfolio-box-caption-content">
                    <div class="project-name">
                      Peso minímo de 49.5 kg...
                    </div>
                    <div class="project-button">
                      <button class="project-btn">Ver más...</button>
                    </div>
                  </div>
                </div>
              </a>
            </div>
            <div class="col-lg-4 col-sm-6">
              <a class="portfolio-box" href="./img/portfolio/fullsize/health.jpeg">
                <img class="img-fluid" src="./img/portfolio/thumbnails/health.jpeg" alt="">
                <div class="portfolio-box-caption">
                  <div class="portfolio-box-caption-content">
                    <div class="project-name">
                      Contar con una buena alimentación...
                    </div>
                    <div class="project-button">
                      <button class="project-btn">Ver más...</button>
                    </div>
                  </div>
                </div>
              </a>
            </div>
            <div class="col-lg-4 col-sm-6">
              <a class="portfolio-box" href="./img/portfolio/fullsize/time.jpg">
                <img class="img-fluid" src="./img/portfolio/thumbnails/time.jpg" alt="">
                <div class="portfolio-box-caption">
                  <div class="portfolio-box-caption-content">
                    <div class="project-name">
                      Esperar por lo menos 56 días entre donaciones <br>de sangre completa...
                    </div>
                    <div class="project-button">
                      <button class="project-btn">Ver más...</button>
                    </div>
                  </div>
                </div>
              </a>
            </div>
            <div class="col-lg-4 col-sm-6">
              <a class="portfolio-box" href="./img/portfolio/fullsize/tattoo.jpg">
                <img class="img-fluid" src="./img/portfolio/thumbnails/tattoo.jpg" alt="">
                <div class="portfolio-box-caption">
                  <div class="portfolio-box-caption-content">
                    <div class="project-name">
                      Esperar 12 meses después de adquirir un tatuaje...
                    </div>
                    <div class="project-button">
                      <button class="project-btn">Ver más...</button>
                    </div>
                  </div>
                </div>
              </a>
            </div>
            <div class="col-lg-4 col-sm-6">
              <a class="portfolio-box" href="./img/portfolio/fullsize/blood.jpeg">
                <img class="img-fluid" src="./img/portfolio/thumbnails/blood.jpeg" alt="">
                <div class="portfolio-box-caption">
                  <div class="portfolio-box-caption-content">
                    <div class="project-name">
                      Factores de presión baja o alta...
                    </div>
                    <div class="project-button">
                      <button class="project-btn">Ver más...</button>
                    </div>
                  </div>
                </div>
              </a>
            </div>
          </div>
        </div>
      </section>
      
      <!-- Testimonials Section -->
      <!-- <section id="testimonials" class="content-section text-center">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <img src="./img/blood-drop.png" alt="blood">
              <h3 class="general-title test">Testimoniales</h3>
              <div class="cd-testimonials-wrapper cd-container">
                <ul class="cd-testimonials">
                  <li>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                    <div class="cd-author">
                      <img src="img/avatar-1.jpg" alt="Author image">
                      <ul class="cd-author-info">
                        <li>MyName</li>
                        <li>CEO, AmberCreative</li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Necessitatibus ea, perferendis error repudiandae numquam dolor fuga temporibus. Unde omnis, consequuntur.</p>
                    <div class="cd-author">
                      <img src="img/avatar-2.jpg" alt="Author image">
                      <ul class="cd-author-info">
                        <li>MyName</li>
                        <li>Designer, CodyHouse</li>
                      </ul>
                    </div>
                  </li>
                  <li>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quam totam nulla est, illo molestiae maxime officiis, quae ad, ipsum vitae deserunt molestias eius alias.</p>
                    <div class="cd-author">
                      <img src="img/avatar-3.jpg" alt="Author image">
                      <ul class="cd-author-info">
                        <li>MyName</li>
                        <li>CEO, CompanyName</li>
                      </ul>
                    </div>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </section>
      -->
      <!-- Testimonials Section -->
      <section id="testimonials" class="content-section text-center">
        <div class="container">
          <div class="row">
            <div class="col-md-12">
              <img src="./img/blood-drop.png" alt="blood">
              <h3 class="general-title test">Testimoniales</h3>
              <div class="list-test"> Aqui van testimoniales</div>
            </div>
          </div>
        </div>
      </section>
      
      <!-- Contact Section -->
      <section id="contact">
        <div class="container">
          <div class="row">
            <div class="col-md-12 text-center">
              <h3 class="general-title test">Conoce más sobre el proceso de donación</h3>
              <button id="contact-btn" >Haz click aquí</button>
            </div>
          </div>
        </div>
      </section>
      
      <!-- Map Section -->
      <!--  <div id="map"></div> -->
      <!-- Footer -->
      <footer>
        <div class="row">
          <div class="col-md-12">
            <!-- <h3 class="footer-title text-center">Conoce sobre</h3> -->
          </div>
        </div>
        <div class="container text-center">
          <div class="row">
            <div class="col-md-4 footer-div">
              <ul class="footer-txt">
                <li>Beneficios de donar</li>
                <li>Comunidad de Donadores</li>
                <li>Patrocinadores</li>
                <li>FAQs</li>
              </ul>
            </div>
            <div class="col-md-4 footer-div">
              <ul class="footer-txt know">
                <li>Aspectos sobre la sangre</li>
                <li>Tipos de Sangre</li>
                <li>Componentes de la Sangre</li>
                <li>Donación de sangre en la ciudad  </li>
              </ul>
            </div>
            <div class="col-md-4 text-center msg">
              <h3 class="footer-send-msg">Envíanos un mensaje</h3>
              <ul class="footer-txt footer-icons">
                  <li><i class="fa fa-facebook" aria-hidden="true"></i></li>
                  <li><i class="fa fa-twitter" aria-hidden="true"></i></li>
                  <li><i class="fa fa-instagram" aria-hidden="true"></i></li>
              </ul>
            </div>
          </div>
        </div>
      </footer>
      <section class="copyright text-center">
        <p class="copyright-txt">&copy; 2017 Supernova Apps<p>
        </section>
      
      <!-- Modal -->
        <div class="modal fade" id="myModal" role="dialog">
          <div class="modal-dialog">

            <!-- Modal content-->
            <div class="modal-content">
              <div class="modal-header">
                <!--<button type="button" class="close" data-dismiss="modal">&times;</button>-->
                <h4 class="modal-title">Registro Exitoso</h4>
              </div>
              <div class="modal-body">
                        <p>Ya estás registrado como donador en Donadores Laguna. En cuanto lo necesitemos te contactaremos para agendar una donación. </p>
                        <p>Gracias por confiar en nosotros</p>                        
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
              </div>
            </div>

          </div>
        </div>
        
        <!-- Bootstrap core JavaScript -->
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <!-- Plugin JavaScript -->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
        <!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCRngKslUGJTlibkQ3FkfTxj3Xss1UlZDA&sensor=false"></script>
        <!-- Custom scripts-->
        <c:if test="${isReg.toString() == 'true'}">
        <script>
            $(document).ready(function(){
                $("#myModal").modal();
            });
        </script>
        </c:if>
        <script>
            $(document).ready(function(){
                
               $("#userSubmit").click(function(e){
                   var data = {
                       user: $("#usuarioU").val(),
                       password: $("#passwordU").val()
                   };
                   console.log(data);
                   $.post("login",
                    data,
                           function(response, status){
                               console.log(response);
                              if (response.hasOwnProperty("url")){
                                  window.location.href = response.url;
                              }
                              else{
                                  $(".modal-title").html("Acceso Denegado");
                                  $(".modal-body").html(response.message);
                                  $("#myModal").modal();
                              }
                           });
               }); 
            });
        </script>
        <script src="js/index.js"></script>
        <script src="js/index.min.js"></script>
        <script src="js/log-in.js"></script>
        <!-- Parallax section -->
        <script src="parallax/parallax.js"></script>
        <script src="js/main.js"></script> <!-- Resource jQuery -->
      </body>
    </html>
