package com.project.fn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.fn.Model.fatModel;
import com.project.fn.Service.fatService;

@RestController
public class fatController {
	@Autowired
	private fatService fs;
	@GetMapping("/fat")
	public List<fatModel> getcereal()
	{
		return fs.getfatDetails();
	}
}
