package com.dilip.firstWebpage.login.LoginController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dilip.firstWebpage.services.AuthenticationService;

@Controller
public class LoginController {
	
	 private AuthenticationService authenticationservice
	 = new AuthenticationService();

	public LoginController(AuthenticationService authenticationservice) {
		super();
		this.authenticationservice = authenticationservice;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String mylogin() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String mywelcome(@RequestParam String name, @RequestParam String password, ModelMap model) {

		model.put("name", name);
//		model.put("password", password);
		// Authenications//
		if(authenticationservice.Authenticate(name, password)) {
			return "welcome";
		}
		model.put("errorMsg", "InValid Credentails, Plz Try Again!!!");
		return "login";
	}

	

	
	
	
	
	
	@RequestMapping("login1")
	// http://localhost:8090/login?name=saim
	public String mylogin1(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		System.out.println("Request Param " + name);// its not a good practice for production code//
		return "login";
		// now for handling parameter in url we use model///

	}

}
