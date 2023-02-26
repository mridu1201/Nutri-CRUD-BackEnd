package com.project.fn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.fn.Model.ForgotpassModel;
import com.project.fn.Service.ForgotpassService;

@RestController
public class ForgotpassController 
{
	@Autowired
	private ForgotpassService f;
	@GetMapping("/forgot")
	public List<ForgotpassModel> getforgot()
	{
		return f.getForgotpassDetails();
	}
	@PutMapping("/uppass")
	public String updatepass(@RequestBody ForgotpassModel fpm, @RequestParam int id)
	{
		fpm.setId(id);
		f.updatepass(fpm);
		return "password updated!";
	}
}
