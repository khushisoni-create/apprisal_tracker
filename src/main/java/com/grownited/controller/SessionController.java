package com.grownited.controller;

//import java.lang.foreign.Linker.Option;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.grownited.entity.DepartmentEntity;
import com.grownited.entity.UserEntity;
import com.grownited.repository.DepartmentRepository;
import com.grownited.repository.SignupRepository;
import com.grownited.service.MailService;
import com.grownited.service.OtpMailService;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestParam;

@Controller // used to create this file as controller
public class SessionController {

	@Autowired
	PasswordEncoder encoder; // used for password encoding (bcrypt encoding technique)

	@Autowired
	MailService serviceMail; // used to send welcome mail when signup

	@Autowired
	OtpMailService serviceOtpMail;

	@Autowired // this annotation is used to create object of interface (Signup Repository
				// Interface)
	SignupRepository repositorySignup; // used to save data from signup page to database - by making object of
										// interface(repository)

	@Autowired
	DepartmentRepository repodepartment;

//	@GetMapping(value = {"/", "signup"}) //url name, that in which url we can open particular jsp file
	@GetMapping("adduser")
	public String adduser(Model model) { // method name to open jsp file in browser

		
		/*this is used to fetch data from database and send that data to AddUser Jsp file inside form , so that 
		inside form of add user in department input there is dropdown of department that are available in database*/
		List<DepartmentEntity> allDepartmenta = repodepartment.findAll();  

		model.addAttribute("allDepartmenta", allDepartmenta);

		return "AddUser"; // jsp file name(case sensitive) to call jsp file
	}

//   @GetMapping("login")
	@GetMapping(value = { "/", "login" }) // url name, used in jsp in action attribute
	public String login() { // method name, you can create it on your own
		return "Login"; // name of jsp file which you want to call, with same spelling
	}

	@PostMapping("saveuser")
	public String Saveuser(UserEntity userEntity) { // this is used after click on submit button in signup
																	// page

		userEntity.setCreatedAt(new Date());;
		userEntity.setStatus("active");

		int randPassword = (int) (Math.random() * 1000000); // Generates a number between 0-999999
		String passwordMail = String.format("%06d", randPassword); // Ensures it's always 6 digits

		String encpasswordMail = encoder.encode(passwordMail);
		userEntity.setPassword(encpasswordMail);

//		userEntity.setConfirmPassword(encpasswordMail);
//	   String encCPassword = encoder.encode(userEntity.getConfirmPassword());
//	   userEntity.setConfirmPassword(encCPassword);

		userEntity.setRole("USER");
		repositorySignup.save(userEntity); // here inside () bracket name of argument is written
		serviceMail.sendWelcomeEmail(userEntity.getEmail(), userEntity.getFirstName(), passwordMail);

		return "Login";
	}

	@PostMapping("authenticate") // this method is used to read data from login page to read,
									// validate/authenticate
	public String authenticate(String email, String password, Model model, HttpSession session) {
		System.out.println(email);
		System.out.println(password);

		Optional<UserEntity> op = repositorySignup.findByEmail(email);
		// select * from users where email = :email and password = :password

		if (op.isPresent()) {// true

			UserEntity dbUser = op.get();

			boolean ans = encoder.matches(password, dbUser.getPassword());

			if (ans == true) {

				session.setAttribute("user", dbUser); // session -> user set

				if (dbUser.getPosition().equals("HR")) {
					return "redirect:/hrhome";
				} else if (dbUser.getPosition().equals("USER")) {
					return "EmployeeHome";
				} else {
					model.addAttribute("error", "Please contact Admin with Error Code #090909");
					return "Login";
				}

			}
		}
		model.addAttribute("error", "Invalid Credentials");
		return "Login";
	}

	@PostMapping("resetpassword")
	public String resetPassword(UserEntity entityUser) {
//	   System.out.println();	   
		int randOtp = (int) (Math.random() * 10000); // Generates a number between 0-999999
		String otpMail = String.format("%04d", randOtp); // Ensures it's always 6 digits
		serviceOtpMail.sendOtpMail(entityUser.getEmail(), otpMail);
		return "ForgotPassword";
	}

	@GetMapping("forgotpassword") // this url is used in jsp file in form action, same spelling to call this
									// method
	public String ForgotPassword() {

		return "ForgotPassword";
	}

//   @GetMapping("listusers") //url name
//   public String listUsers(Model model) {
//	   
//	   List<UserEntity> userList = repositorySignup.findAll(); //select * from users;
//	   
//	   model.addAttribute("userList", userList);
//	   					 //data name, data value        --> data name is used in jsp to call that data from controller
//	   
//	   
//	   return "ListUsers";
//   }

}
