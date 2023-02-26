package com.project.fn.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.fn.Model.legumesNpulsesModel;
import com.project.fn.Service.legumesNpulsesService;

@RestController
public class legumesNpulsesController {
	@Autowired
	private legumesNpulsesService lns;
	@GetMapping("/legumes")
	public List<legumesNpulsesModel> getlegumes()
	{
		return lns.getlegumesDetails();
	}
}
