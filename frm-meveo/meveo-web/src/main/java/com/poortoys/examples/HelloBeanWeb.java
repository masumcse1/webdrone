package com.poortoys.examples;

import javax.ejb.EJB;
import javax.enterprise.inject.Model;


@Model
public class HelloBeanWeb {
	
	@EJB
	private HelloBean helloBean;

    public String getMessage() {
    	
    	System.out.println("-------------->>"+helloBean.getMessage());
        return helloBean.getMessage();
        
    }
    
}
