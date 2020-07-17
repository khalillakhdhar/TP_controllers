package com.example.spboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.spboot.model.Computer;
import com.example.spboot.model.Laptop;

@RestController
public class TestController {
	
	@GetMapping("")
	String welcome()
	{
		return "bienvenu à Spring boot voir la liste des <a href='list'>composants</a>";
	}
	@GetMapping("list")
	ModelAndView liste()
	{
		ModelAndView mv = new ModelAndView("home.html");
		return mv;
	}
	@GetMapping("computer")
	String pc()
	{
		Computer c=new Computer(1, "DELL", "i7", "Gamer", 2400);
		return c.toString();
	}
@GetMapping("laptop")
String  lap()
{
Laptop l=new Laptop(1, "asus", "i7", "gamer", 3000,120);
return l.toString();
}
}
