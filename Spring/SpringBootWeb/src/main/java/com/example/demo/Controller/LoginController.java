package com.example.demo.Controller;

import com.example.demo.Model.Inventory;
import com.example.demo.Service.EmployeeService;
import com.example.demo.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class LoginController {

	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private InventoryService inventoryService;

	// Default username and password
	private static final String DEFAULT_USERNAME = "admin";
	private static final String DEFAULT_PASSWORD = "password";
	@GetMapping("/login")
	public String getLogin()
	{
		return "login.html";
	}

	@PostMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes,Model model) {
		if (DEFAULT_USERNAME.equals(username) && DEFAULT_PASSWORD.equals(password)) {
			// Successful login
			List<Inventory> inventoryList = inventoryService.findAllInventory();
			model.addAttribute("inventoryList",inventoryList);
			return "redirect:/inventory";
		} else {
			// Failed login
			redirectAttributes.addFlashAttribute("error", "Invalid username or password");
			return "redirect:/login"; // Redirect back to the login page with an error message
		}
	}

	@GetMapping("/inventory")
	public String getInventory()
	{
		return "inventory.html";
	}



}
