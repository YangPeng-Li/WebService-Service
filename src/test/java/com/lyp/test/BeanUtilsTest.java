package com.lyp.test;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtils;

import com.lyp.beans.Beans;
import com.lyp.beans.Beans.BODY;
import com.lyp.beans.Beans.DATASTORS;
import com.lyp.beans.Beans.DS;
import com.lyp.beans.Beans.PARAMETES;
import com.lyp.utils.ValidateContext;


public class BeanUtilsTest {

	@SuppressWarnings("null")
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		
		ValidateContext con = null;
		
		String id = "6600221";
		String name1 = "¿Ú¿Ú";
		String job = "Coder";
		String Tell = "13122211181";
		String Address = "–”ª®¥Â";
		String  Emain = "lili@163.com";
		Beans  beanDemo = new  Beans ();
		Object configValue = null;
		
		try {
			PropertyUtils.setSimpleProperty(configValue, "BODY.DATASTORS.DS.PARAMETES.name", name1);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final Beans b1 = null;
		BODY body = new Beans.BODY();
		DATASTORS datastors = body.getDATASTORS();
		DS ds = datastors.getDS();
		PARAMETES parametes = ds.getPARAMETES();
		
		body.setDATASTORS(datastors);
		ds.setPARAMETES(parametes);
		parametes.setName(name1);
		Object o = null;
		
		System.out.println(PropertyUtils.getProperty(o, "BODY.DATASTORS.DS.PARAMETES.name").toString());
	}
	
	
}
