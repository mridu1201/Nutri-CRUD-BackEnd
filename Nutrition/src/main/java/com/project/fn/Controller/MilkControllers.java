package com.project.fn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.fn.Model.MilkModel;
import com.project.fn.Service.MilkService;

@RestController
public class MilkControllers 
{
	@Autowired
	private MilkService m;
	@GetMapping("/milk")
	public List<MilkModel> getMilk()
	{
		return m.getMilkDetails();
	}
}
