package com.project.fn.Service;

import java.util.List;

import com.project.fn.Model.ForgotpassModel;

public interface ForgotpassINT 
{
	public List<ForgotpassModel> getForgotpassDetails();
	public void updatepass(ForgotpassModel fpm);
}
