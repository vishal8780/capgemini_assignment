package com.nil.SpringC4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static void autowired(String file) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext(file);
		if (file.equalsIgnoreCase("autowired.xml")) {
		            Country country = ac.getBean("myCountry", Country.class);
		System.out.println(country.toString());
		        } 
		else {
			Country2 country = ac.getBean("myCountry", Country2.class);
			System.out.println(country.toString());
	
		        }
		    }



    public static void main( String[] args )
    {
    	
    	int choice = Menu.displayMenu();

    	switch (choice) {
    	case 1:
    	System.out.println("'Autowired annotation' selected");
    	autowired("autowired.xml");
    	break;
    	case 2:
    	System.out.println("'Autowired with Qualifier annotation' selected");
    	autowired("autowired-qualifier.xml");
    	break;
    	default:
    	System.err.println("Invalid choice.");
    	        }
    	    }

    	
    }

