package com.lixin.user.action;

import com.lixin.user.database.DB;

public class UserAction {

	// ����û���¼
	public String checkUserLogin(String name, String pwd) {
		System.out.println("UserAction  is  checkUserLogin  start... ");

		System.out.println(name + "," + pwd);
		
		//����db�����
		DB db  = new DB();
		boolean  flag=db.checkLogin(name, pwd);
		if(flag)
		{
			return "�ɹ�";
		}
		
		return "�û���¼ʧ��";
	}
	
	//����û����Ƿ�Ψһ
	public String  checkUserName(String name)
	{
		System.out.println("UserAction  is  checkUserName  start... ");
		System.out.println("------------>"+name);
		DB  db = new DB();
		
		boolean flag=db.checkName(name);
		if(flag)
		{
			return "fail";
		}
		else
		{
			return "success";
		}
		
		
	}

}