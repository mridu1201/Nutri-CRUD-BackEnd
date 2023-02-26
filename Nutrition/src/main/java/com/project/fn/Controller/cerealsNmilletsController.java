package com.project.fn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.fn.Model.cerealsNmilletsModel;
import com.project.fn.Service.cerealsNmilletsService;

@RestController
public class cerealsNmilletsController {
	@Autowired
	private cerealsNmilletsService c;
	@GetMapping("/cereals")
	public List<cerealsNmilletsModel> getcereal()
	{
		return c.getcerealDetails();
	}
}
	