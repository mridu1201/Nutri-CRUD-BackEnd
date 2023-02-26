package com.project.fn.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.fn.Model.fruitsModel;

@Service
public class fruitsService implements fruitsINT
{
	private static List<fruitsModel> fv=new ArrayList<>();
	static
	{
		fruitsModel fg=new fruitsModel();
		fg.setName("Pomogranate");
		fg.setCalories(130);
		fg.setNutri("Carbohydrates");
		fg.setDefi("Gives energy");
		fv.add(fg);
		fruitsModel fg1=new fruitsModel();
		fg1.setName("Grapes");
		fg1.setCalories(130);
		fg1.setNutri("Carbohydrates");
		fg1.setDefi("Gives energy");
		fv.add(fg1);
		fruitsModel fg2=new fruitsModel();
		fg2.setName("Orange");
		fg2.setCalories(130);
		fg2.setNutri("Carbohydrates");
		fg2.setDefi("Gives energy");
		fv.add(fg2);
		fruitsModel fg3=new fruitsModel();
		fg3.setName("Amaranth");
		fg3.setCalories(130);
		fg3.setNutri("Carbohydrates");
		fg3.setDefi("Gives energy");
		fv.add(fg3);
		fruitsModel fg4=new fruitsModel();
		fg4.setName("Okra");
		fg4.setCalories(130);
		fg4.setNutri("Carbohydrates");
		fg4.setDefi("Gives energy");
		fv.add(fg4);
	}
	@Override
	public List<fruitsModel> getfruitsDetails() {
		// TODO Auto-generated method stub
		return fv;
	}
}
