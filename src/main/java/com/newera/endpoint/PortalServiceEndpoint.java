package com.newera.endpoint;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.google.gson.Gson;
import com.newera.model.ContactForm;
import com.newera.model.Incentive;
import com.newera.model.Login;
import com.newera.model.Registration;
import com.newera.model.ResetPassword;
import com.newera.model.RewardPoint;
import com.newera.service.NewEraService;
import com.oracle.xmlns.adf.svc.types.DataObjectResult;

@Path("/service")
@Component
public class PortalServiceEndpoint extends SpringBeanAutowiringSupport {

	@Autowired
	NewEraService newEraService;

	@Path("/register")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response register(Registration registration) {
		Gson gson = new Gson();
		DataObjectResult response = null;
		String sucess = "You have raised the service";
		String failure = "Some Proble in raising the request";
		if (null != registration) {

			response = newEraService.createContact(registration);
		}
		if (response != null) {
			return Response.status(Response.Status.OK)
					.entity(gson.toJson(sucess)).build();
		} else {
			return Response.status(Response.Status.BAD_REQUEST)
					.entity(gson.toJson(failure)).build();
		}
	}

	@Path("/contact")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response contact(ContactForm contact) {
		Gson gson = new Gson();
		String response = "Email sent";
		if (null != contact) {

			newEraService.createContacts(contact);
		}

		return Response.status(200).entity(gson.toJson(response)).build();
	}

	@POST
	@Path("/verifyLogin")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Response verifyLogin(Login login) {
		Gson gson = new Gson();
		Registration loginResponse = null;
		String errorMsg = "Invalid Username Or Password";
		if (null != login) {
			loginResponse = newEraService.verifyLogin(login);
		}
		/*if (loginResponse != null) {*/
			return Response.status(200).entity(gson.toJson(loginResponse))
					.build();
		/*} else {
			return Response.status(400).entity(gson.toJson(errorMsg)).build();
		}*/

	}

	@PUT
	@Path("/resetPassword")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Response resetPassword(Login login) {
		Gson gson = new Gson();
		String response = null;
		String invalidResponse = "No Contact Found for the email "
				+ login.getEmail();
		if (null != login) {
			response = newEraService.resetPassword(login);
		}
		/*if (response != null) {*/
			return Response.status(200).entity(gson.toJson(response)).build();
		/*} else {
			return Response.status(400).entity(gson.toJson(invalidResponse))
					.build();
		}*/

	}

	@PUT
	@Path("/changePassword")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public Response changePassword(ResetPassword resetPassword,
			@QueryParam("email") String email) {
		String response = null;
		Gson gson = new Gson();
		if (null != resetPassword && null != email) {
			resetPassword.setEmail(email);
			response = newEraService.changePassword(resetPassword);
		}
		return Response.status(200).entity(gson.toJson(response)).build();
	}

	@GET
	@Path("/getProfile")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getActiveEmployee(@QueryParam("email") String email) {
		Registration profileResponse = newEraService.getUserProfile(email);
		Gson gson = new Gson();
		return Response.status(200).entity(gson.toJson(profileResponse))
				.build();
	}

	@PUT
	@Path("/genrateReport")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces(MediaType.APPLICATION_JSON)
	public void genrateReport(RewardPoint points) {
		if (null != points) {
			newEraService.report(points);
		}
	}
}
