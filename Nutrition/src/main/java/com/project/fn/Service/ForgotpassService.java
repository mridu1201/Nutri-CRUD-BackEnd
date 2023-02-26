package com.project.fn.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.fn.Model.ForgotpassModel;
import com.project.fn.Repo.forgotRepo;

@Service
public class ForgotpassService implements ForgotpassINT 
{
	@Autowired
	public forgotRepo fr;
	
	@Override
	public List<ForgotpassModel> getForgotpassDetails() {
		return fr.findAll();
	}

	@Override
	public void updatepass(ForgotpassModel fpm) {
		fr.save(fpm);
	}
	
}
