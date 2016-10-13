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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ProductsByGroupServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ProductsService productService = new ProductsServiceImpl();
            List<Products> pL = productService.getProductsByGroupIdList(Integer.parseInt(
                    request.getParameter("idgroup")));
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
        response.sendError(404, "Not correct metod");
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
