package com.project.fn.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.fn.Model.fatModel;

@Service
public class fatService implements fatINT 
{
	private static List<fatModel> fo=new ArrayList<>();
	static
	{
		fatModel fm=new fatModel();
		fm.setName("Butter");
		fm.setCalories(717);
		fm.setNutri("Vitamin A,D,E,B12,K2,Calcium");
		fm.setDefi("A good antioxidant,good for bone growth and development");
		fo.add(fm);
		fatModel fm1=new fatModel();
		fm1.setName("Sugar");
		fm1.setCalories(387);
		fm1.setNutri("Carbohydrates");
		fm1.setDefi("Gives instant energy");
		fo.add(fm1);
		fatModel fm2=new fatModel();
		fm2.setName("Ghee");
		fm2.setCalories(900);
		fm2.setNutri("fat, Vitamin A,E,K");
		fm2.setDefi("imporoves digestion\nreduces inflammation\nstrengthening the bones");
		fo.add(fm2);
		fatModel fm3=new fatModel();
		fm3.setName("Sesame oil");
		fm3.setCalories(884);
		fm3.setNutri("Vitamin E, phytosterols, balanced omega fatty acids");
		fm3.setDefi("Helps in fighting free radicals\nreduces risk of developing chronic diseases");
		fo.add(fm3);
		fatModel fm4=new fatModel();
		fm4.setName("Olive oil");
		fm4.setCalories(884);
		fm4.setNutri("Fat, Vitamin E,K");
		fm4.setDefi("anit-ocidants\nreduces the chances for heart for heart diseases");
		fo.add(fm4);
	}
	@Override
	public List<fatModel> getfatDetails() {
		// TODO Auto-generated method stub
		return fo;
	}
}
