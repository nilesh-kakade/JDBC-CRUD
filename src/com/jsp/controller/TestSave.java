package com.jsp.controller;

import com.jsp.dao.Teacherdao;
import com.jsp.dto.Teacher;

public class TestSave {
	public static void main(String[] args) {
		Teacher tc=new Teacher();
		tc.setId(13);
		tc.setName("Thakur");
		tc.setEmail("thakur@gmail.com");
		tc.setCno(9137775491l);
		Teacher tc1=new Teacher();
		tc1.setId(14);
		tc1.setName("pratham");
		tc1.setEmail("thakur@gmail.com");
		tc1.setCno(9133308343l);
		Teacher tc2=new Teacher();
		tc2.setId(15);
		tc2.setName("noddy");
		tc2.setEmail("noddy@gmail.com");
		tc2.setCno(9234567894l);
		
		
		
		Teacherdao td=new Teacherdao();
		Teacher t=td.updateTeacher(tc1);
		System.out.println(t.getId() + "has saved");
		
	}
}
