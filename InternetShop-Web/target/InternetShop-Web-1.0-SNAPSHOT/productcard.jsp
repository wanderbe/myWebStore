<%-- 
    Document   : products
    Created on : 01.10.2016, 23:31:44
    Author     : wanderbe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" />
	<title>FishingShop ${product.name}</title>
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
	<!--[if lte IE 6]><link rel="stylesheet" href="css/ie6.css" type="text/css" media="all" /><![endif]-->
	
	<meta name="keywwords" content="FishingShop" />
	<meta name="description" content="FishingShop" />
	
	<!-- JS -->
	<script src="js/jquery-1.4.1.min.js" type="text/javascript"></script>	
	<script src="js/jquery.jcarousel.pack.js" type="text/javascript"></script>	
	<script src="js/jquery-func.js" type="text/javascript"></script>	
	<!-- End JS -->
	
    </head>
    <body>
        	
<!-- Shell -->	
<div class="shell">
	
	<!-- Header -->	
	<div id="header">
		<h1 id="logo"><a href="products">Fishin Shop</a></h1>	
		
		<!-- Cart-->
		<div id="cart">
			<a href="#" class="cart-link">Your Shopping Cart</a>
			<div class="cl">&nbsp;</div>
			<span>Articles: <strong>4</strong></span>
			&nbsp;&nbsp;
			<span>Cost: <strong>$250.99</strong></span>
		</div>
		<!-- End Cart -->
		
		<!-- Navigation -->
		<div id="navigation">
			<ul>
			    <li><a href="products" class="active">Main page</a></li>
			    <li><a href="support">Support</a></li>
			    <li><a href="#">My Account</a></li>
			    <li><a href="#">The Store</a></li>
			    <li><a href="#">Contact</a></li>
			</ul>
		</div>
		<!-- End Navigation -->
	</div>
	<!-- End Header -->
	
	<!-- Main -->
	<div id="main">
		<div class="cl">&nbsp;</div>
		
		<!-- Content -->
		<div id="content">
			
			<!-- Content Slider -->
			<div id="slider" class="box">
				<div id="slider-holder">
					<ul>
					    <li><a href="#"><img src="css/images/images_for_slides/${product.image}.jpg" alt="" /></a></li>
					</ul>
				</div>
		
			</div>
			<!-- End Content Slider -->
			
			<!-- Products -->
			<div class="products">
				<div class="cl">&nbsp;</div>
				
				    	  
				    	  <div position="relative">
                                                <table>
                                                  <tr>
                                                      <td>
                                                        <h3>${product.name}</h3>  
                                                      </td>
                                                      <td>
                                                          <div position="absolute" right="0px">
                                                            <form action="productcurd?idproduct=${product.idProduct}">
                                                              <input type="submit" value="BAY"></input>
                                                            </form>
                                                          </div>
                                                      </td>
                                                  </tr>
                                                </table>
				    		
				    		<div class="product-desc">
								<h4>${product.productGroup.nameProductGroup}</h4>
				    			<p>${product.discriptionProduct}</p>
				    			<strong class="price">${product.idPrice} uah</strong>
                                                        
				    		</div>
				    	  </div>
			         

				<div class="cl">&nbsp;</div>
			</div>
			<!-- End Products -->
			
		</div>
		<!-- End Content -->
		
		<!-- Sidebar -->
		<div id="sidebar">
			
			<!-- Search -->
			<div class="box search">
				<h2>Search by <span></span></h2>
				<div class="box-content">
					<form action="" method="post">
						
						<label>Keyword</label>
						<input type="text" class="field" />
						
						<label>Category</label>
						<select class="field">
							<option value="">-- Select Category --</option>
                                                            <c:forEach var="cat" items="${groupOfProducts}">
                                                              <option value="${cat.idProductGroup}">
					                        ${cat.nameProductGroup}
                                                              </option>
                                                            </c:forEach>
						</select>
						
						<div class="inline-field">
							<label>Price</label>
							<select class="field small-field">
								<option value="">$10</option>
							</select>
							<label>to:</label>
							<select class="field small-field">
								<option value="">$50</option>
							</select>
						</div>
						
						<input type="submit" class="search-submit" value="Search" />
						
						<p>
							<a href="#" class="bul">Advanced search</a><br />
							<a href="#" class="bul">Contact Customer Support</a>
						</p>
	
					</form>
				</div>
			</div>
			<!-- End Search -->
			
			<!-- Categories -->
			<div class="box categories">
				<h2>Categories <span></span></h2>
				<div class="box-content">
					<ul>
                                            <c:forEach var="cat" items="${groupOfProducts}">
					         <li><a href="productsbygroup?idgroup=${cat.idProductGroup}">${cat.nameProductGroup}</a></li>
                                            </c:forEach>
					    
<!--					    <li class="last"><a href="#">Category 13</a></li>-->
					</ul>
				</div>
			</div>
			<!-- End Categories -->
			
		</div>
		<!-- End Sidebar -->
		
		<div class="cl">&nbsp;</div>
	</div>
	<!-- End Main -->
	
	<!-- Side Full -->
	<div class="side-full">
		
		<!-- More Products -->
		<div class="more-products">
			<div class="more-products-holder">
				<ul>
				    <li><a href="#"><img src="css/images/small1.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small2.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small3.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small4.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small5.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small6.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small7.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small1.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small2.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small3.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small4.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small5.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small6.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small7.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small1.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small2.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small3.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small4.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small5.jpg" alt="" /></a></li>
				    <li><a href="#"><img src="css/images/small6.jpg" alt="" /></a></li>
				    <li class="last"><a href="#"><img src="css/images/small7.jpg" alt="" /></a></li>
				</ul>
			</div>
			<div class="more-nav">
				<a href="#" class="prev">previous</a>
				<a href="#" class="next">next</a>
			</div>
		</div>
		<!-- End More Products -->
		
		<!-- Text Cols -->
		<div class="cols">
			<div class="cl">&nbsp;</div>
			<div class="col">
				<h3 class="ico ico1">Donec imperdiet</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec imperdiet, metus ac cursus auctor, arcu felis ornare dui.</p>
				<p class="more"><a href="#" class="bul">Lorem ipsum</a></p>
			</div>
			<div class="col">
				<h3 class="ico ico2">Donec imperdiet</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec imperdiet, metus ac cursus auctor, arcu felis ornare dui.</p>
				<p class="more"><a href="#" class="bul">Lorem ipsum</a></p>
			</div>
			<div class="col">
				<h3 class="ico ico3">Donec imperdiet</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec imperdiet, metus ac cursus auctor, arcu felis ornare dui.</p>
				<p class="more"><a href="#" class="bul">Lorem ipsum</a></p>
			</div>
			<div class="col col-last">
				<h3 class="ico ico4">Donec imperdiet</h3>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec imperdiet, metus ac cursus auctor, arcu felis ornare dui.</p>
				<p class="more"><a href="#" class="bul">Lorem ipsum</a></p>
			</div>
			<div class="cl">&nbsp;</div>
		</div>
		<!-- End Text Cols -->
		
	</div>
	<!-- End Side Full -->
	
	<!-- Footer -->
	<div id="footer">
		<p class="left">
			<a href="#">Home</a>
			<span>|</span>
			<a href="#">Support</a>
			<span>|</span>
			<a href="#">My Account</a>
			<span>|</span>
			<a href="#">The Store</a>
			<span>|</span>
			<a href="#">Contact</a>
		</p>
		<p class="right">
			&copy; 2010 Shop Around.
			Design by <a href="http://bayguzin.ru/" target="_blank" title="">bayguzin.ru</a>
		</p>
	</div>
	<!-- End Footer -->
	
</div>	
<!-- End Shell -->
	
	
        
        
        
        
        <table>
          <c:forEach var="p" items="${products}">
              <tr>
                  <td>
                      ${p.name}
                  </td>
                  <td>
                      ${p.discriptionProduct}
                  </td>
                  <td>
                      <a href="#"><img src="css/images/images_for_slides/${p.image}.jpg" alt="" /></a>
                      ${p.image}
                  </td>
                  <td>
                      ${p.idPrice}
                  </td>
              </tr>
          </c:forEach>
        </table>

    </body>
</html>
