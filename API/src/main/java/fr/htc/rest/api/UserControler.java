package fr.htc.rest.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.htc.rest.model.User;

@Path("/user")
public class UserControler {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUser() {
		
		List<User> result = new ArrayList<User>();
		
		result.add(new User(100, "Masten", 2018));
		result.add(new User(101, "Soraya", 1930));
		result.add(new User(102, "Rachid", 1945));
		result.add(new User(103, "Djamel", 2000));
		result.add(new User(104, "Axel", 2014));
		return result;
		
	}
	

}
