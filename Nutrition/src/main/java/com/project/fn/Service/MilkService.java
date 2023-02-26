package com.project.fn.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.fn.Model.MilkModel;

@Service
public class MilkService implements MilkINT 
{
	private static List<MilkModel> mp=new ArrayList<>();
	static
	{
		MilkModel mn=new MilkModel();
		mn.setName("Milk");
		mn.setCalories(130);
		mn.setNutri("Calcium, Vitamin B2, B12,A,D");
		mn.setDefi("Maintains bone density,promotes muscle growth");
		mp.add(mn);
		MilkModel mn1=new MilkModel();
		mn1.setName("Cheese");
		mn1.setCalories(130);
		mn1.setNutri("Proteins, Fats, Calcium");
		mn1.setDefi("Maintains good bone health");
		mp.add(mn1);
		MilkModel mn2=new MilkModel();
		mn2.setName("Yogurt");
		mn2.setCalories(130);
		mn2.setNutri("Carbohydrates");
		mn2.setDefi("Gives energy");
		mp.add(mn2);
		MilkModel mn3=new MilkModel();
		mn3.setName("Fish");
		mn3.setCalories(130);
		mn3.setNutri("Carbohydrates");
		mn3.setDefi("Gives energy");
		mp.add(mn3);
		MilkModel mn4=new MilkModel();
		mn4.setName("Chicken");
		mn4.setCalories(130);
		mn4.setNutri("Carbohydrates");
		mn4.setDefi("Gives energy");
		mp.add(mn4);
	}
	@Override
	public List<MilkModel> getMilkDetails() {
		// TODO Auto-generated method stub
		return mp;
	}
}
