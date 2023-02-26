package com.project.fn.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.fn.Model.legumesNpulsesModel;

@Service
public class legumesNpulsesService implements legumesNpulsesINT 
{
	private static List<legumesNpulsesModel> lp=new ArrayList<>();
	static
	{
		legumesNpulsesModel ln=new legumesNpulsesModel();
		ln.setName("Green Gram");
		ln.setCalories(130);
		ln.setNutri("Carbohydrates");
		ln.setDefi("Gives energy");
		lp.add(ln);
		legumesNpulsesModel ln1=new legumesNpulsesModel();
		ln1.setName("Red Gram");
		ln1.setCalories(130);
		ln1.setNutri("Carbohydrates");
		ln1.setDefi("Gives energy");
		lp.add(ln1);
		legumesNpulsesModel ln2=new legumesNpulsesModel();
		ln2.setName("Black Gram");
		ln2.setCalories(130);
		ln2.setNutri("Carbohydrates");
		ln2.setDefi("Gives energy");
		lp.add(ln2);
		legumesNpulsesModel ln3=new legumesNpulsesModel();
		ln3.setName("Channa");
		ln3.setCalories(130);
		ln3.setNutri("Carbohydrates");
		ln3.setDefi("Gives energy");
		lp.add(ln3);
		legumesNpulsesModel ln4=new legumesNpulsesModel();
		ln4.setName("Green peas");
		ln4.setCalories(130);
		ln4.setNutri("Carbohydrates");
		ln4.setDefi("Gives energy");
		lp.add(ln4);
	}
	@Override
	public List<legumesNpulsesModel> getlegumesDetails() {
		
		return lp;
	}
}
