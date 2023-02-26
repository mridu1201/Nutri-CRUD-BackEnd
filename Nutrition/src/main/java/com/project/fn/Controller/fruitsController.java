package com.project.fn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.fn.Model.fruitsModel;
import com.project.fn.Service.fruitsService;

@RestController
public class fruitsController {

	@Autowired
	private fruitsService f;
	@GetMapping("/fruits")
	public List<fruitsModel> getcereal()
	{
		return f.getfruitsDetails();
	}
}
