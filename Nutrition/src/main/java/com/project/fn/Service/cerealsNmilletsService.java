package com.project.fn.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.fn.Model.cerealsNmilletsModel;

@Service
public class cerealsNmilletsService implements cerealsNmilletsINT 
{
	private static List<cerealsNmilletsModel> cm=new ArrayList<>();
	static
	{
		cerealsNmilletsModel cn=new cerealsNmilletsModel();
		cn.setName("Rice");
		cn.setCalories(130);
		cn.setNutri("Carbohydrates");
		cn.setDefi("Gives energy");
		cm.add(cn);
		cerealsNmilletsModel cn1=new cerealsNmilletsModel();
		cn1.setName("Rice");
		cn1.setCalories(364);
		cn1.setNutri("protiens, vitamin B, fibre");
		cn1.setDefi("Against Iron deficiency");
		cm.add(cn1);
		cerealsNmilletsModel cn2=new cerealsNmilletsModel();
		cn2.setName("Ragi");
		cn2.setCalories(328);
		cn2.setNutri("Calcium");
		cn2.setDefi("Against Bone deterioration");
		cm.add(cn2);
		cerealsNmilletsModel cn3=new cerealsNmilletsModel();
		cn3.setName("Jowar");
		cn3.setCalories(349);
		cn3.setNutri("Protein, Iron");
		cn3.setDefi("Weight Loss, Heart Health,Bone health");
		cm.add(cn3);
		cerealsNmilletsModel cn4=new cerealsNmilletsModel();
		cn4.setName("Pearl millet");
		cn4.setCalories(378);
		cn4.setNutri("protein, fibre , fat, Carbohydrates, energy");
		cn4.setDefi("Against iron defiency");
		cm.add(cn4);
	}
	@Override
	public List<cerealsNmilletsModel> getcerealDetails() {
		// TODO Auto-generated method stub
		return cm;
	}
}
