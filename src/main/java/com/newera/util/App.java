/*package com.newera.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.newera.model.Owner;
import com.newera.model.ServiceRequest;
import com.newera.service.NewEraService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = 
    	  new ClassPathXmlApplicationContext("/config/spring.xml");
	
    	//StockBo stockBo = (StockBo)appContext.getBean("stockBo");
    	
    	NewEraService services=(NewEraService) appContext.getBean("newEraService");
    	List<Owner> ownerList=new ArrayList<Owner>();
		Owner owner=new Owner();
		owner.setOwnerId(0);
		owner.setOwnerName("Admin");
		Owner owner1=new Owner();
		owner1.setOwnerName("Admin Admin");
		Owner owner2=new Owner();
		owner2.setOwnerName("Admin__");
		ownerList.add(owner);
		ownerList.add(owner1);
		ownerList.add(owner2);
		ServiceRequest service=new ServiceRequest();
		service.setServiceId(0);
		service.setType("installation");
		service.setStatus("Open");
		service.setPriority("high");
		service.setCreatedDate(new Date());
		service.setClouserdate(new Date());
		service.setOwner(ownerList);
		owner.setServiceRequest(service);
		services.createService(service);
		Owner owner=new Owner();
		owner.setOwnerId(0);
		owner.setOwnerName("Admins");
		services.createOwner(owner);
    	System.out.println("Done");
    }
}*/