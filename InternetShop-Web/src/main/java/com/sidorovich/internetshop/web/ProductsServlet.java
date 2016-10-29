/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sidorovich.internetshop.web;

import com.sidorovich.internetshop.domain.dao.GroupOfProductDaoImpl;
import com.sidorovich.internetshop.domain.entity.GroupOfProduct;
import com.sidorovich.internetshop.domain.entity.Products;
import com.sidorovich.internetshop.service.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ProductsServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            Integer amount = 0;
            
            if(request.getCookies()!=null){
            Cookie basket = null;
            Map<Integer, Integer> mapBasket = null;
            Cookie[] cookies = request.getCookies();
            for(Cookie c: cookies){
                if(("basket").equals(c.getName()))
                        basket = c;
            }
            if(basket!=null && basket.getValue().length()!=0){
            mapBasket = new CookieParserImpl().parseToMap(basket);
            
            Set<Integer> keySet = mapBasket.keySet();
            for(Integer i:keySet)
                amount=amount+mapBasket.get(i);
            
            }
            }
            
            request.setAttribute("amount", amount);
            
            ProductsService productService = new ProductsServiceImpl();
            List<Products> pL = productService.getProductsList();
            request.setAttribute("products", pL);
            
            GroupOfProductService groupOfProductService = new GroupOfProductServiceImpl();
            List<GroupOfProduct> groupOfProducts = groupOfProductService.getGroupOfProductList();
            request.setAttribute("groupOfProducts", groupOfProducts);
            
            
            request.getRequestDispatcher("products.jsp").forward(request, response);
        } catch (SQLException ex) {
            response.sendError(404, "List of products not founded");
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        CookieParser cookieParser = new CookieParserImpl();
        
        try {
 
            Cookie basket = null;
            Map<Integer, Integer> mapBasket = new HashMap<Integer, Integer>();
            Cookie[] cookies = request.getCookies();
            for(Cookie c: cookies){
                if(("basket").equals(c.getName()))
                        basket = c;
            }
            
            if(basket==null){
                basket=new Cookie("basket", "");
                mapBasket.put(Integer.parseInt(request.getParameter("idproduct")), 1);
                basket.setValue(cookieParser.mapToStringForCookie(mapBasket));
            }else{
            mapBasket = cookieParser.parseToMap(basket); // todo:
            
            if(mapBasket.containsKey(Integer.parseInt(request.getParameter("idproduct")))){
                int sum = mapBasket.get(Integer.parseInt(request.getParameter("idproduct")))+1;
                mapBasket.put(Integer.parseInt(request.getParameter("idproduct")), sum);
            }
            else{
                mapBasket.put(Integer.parseInt(request.getParameter("idproduct")), 1);
            }
            
            basket.setValue(cookieParser.mapToStringForCookie(mapBasket));
            }
            response.addCookie(basket);
            
            ProductsService productService = new ProductsServiceImpl();
            List<Products> pL = productService.getProductsList();
            request.setAttribute("products", pL);
            
            GroupOfProductService groupOfProductService = new GroupOfProductServiceImpl();
            List<GroupOfProduct> groupOfProducts = groupOfProductService.getGroupOfProductList();
            request.setAttribute("groupOfProducts", groupOfProducts);
            
            request.getRequestDispatcher("products.jsp").forward(request, response);
            
            //response.sendRedirect("products");
        } catch (SQLException ex) {
            response.sendError(404, "List of products not founded");
        }
        }
    
    


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
