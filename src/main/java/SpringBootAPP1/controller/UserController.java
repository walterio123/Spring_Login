package SpringBootAPP1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import SpringBootAPP1.aplication.service.UserService;
import SpringBootAPP1.entity.User;
import SpringBootAPP1.repository.RoleRepository;
import SpringBootAPP1.repository.UserRepository;


@Controller
public class UserController {
	@Autowired 
	RoleRepository roleRepository;
	@Autowired
	UserService userService;
	
	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}
	@GetMapping("/userform")
	public String getUserForm(Model model) {
		model.addAttribute("userForm", new User());
		model.addAttribute("roles",roleRepository.findAll());
		model.addAttribute("userList", userService.getAllUsers());
		model.addAttribute("listTab","active");
		
		return "user-form/user-view";
	}
}
