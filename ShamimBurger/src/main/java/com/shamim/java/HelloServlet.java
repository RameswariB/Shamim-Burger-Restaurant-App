package com.shamim.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		HamburguerFactory hf = new HamburguerFactory();
		BasicHamburguer myHamburguer1 = ((IBasicHamburguerBuilder)hf.CreateHamburguer(HamburguerType.Basic, "White roll", "Sausage", 3.56)).build();
        BasicHamburguer myHamburguer2 = ((IBasicHamburguerBuilder)hf.CreateHamburguer(HamburguerType.Basic, "White roll", "Sausage", 3.56))
            .setAdd1(new Addition("Tomato", 0.27))
            .setAdd2(new Addition("Lettuce", 0.75))
            .setAdd3(new Addition("Cheese", 1.13))
            .build();
//        HealthyHamburguer myHamburguer3 = ((IHealthyHamburguerBuilder)hf.CreateHamburguer(HamburguerType.Healthy, null, "Bacon", 5.67))
//            .setAdd1(new Addition("Egg", 5.43))
//            .setAdd2(new Addition("Lentils", 3.41))
//            .build();
        DeluxeHamburguer myHamburguer4 = ((IDeluxeHamburguerBuilder)hf.CreateHamburguer(HamburguerType.Delux, "White roll", "Sausage & Bacon", 14.54)).build();

        
		//String yourName = request.getParameter("yourName");
		PrintWriter writer = response.getWriter();
		writer.println("<body style=\"background-image:url('background.jpg');background-repeat: no-repeat;background-attachment: fixed;background-size: 100% 100%;color:white;\">");
		writer.println("<br/><br/>");
		writer.println("<h3>Hello " + myHamburguer1.toString() + "</h1>");
		writer.println("<h3>Hello " + myHamburguer2.toString() + "</h1>");
		//writer.println("<h1>Hello " + myHamburguer3.toString() + "</h1>");
		writer.println("<h3>Hello " + myHamburguer4.toString() + "</h1>");
		writer.println("</body>");
		writer.close();
	}

}
