package com.lixin.user;

import com.lixin.user.codeImpls.UserChinaCode;
import com.lixin.user.codeImpls.UserNumAndCharCode;
import com.lixin.user.codeImpls.UserNumberCode;
import com.lixin.user.interfaces.UserUtils;

public class UserController {

	//ΪʲôҪ�����ӿڶ���?
	private UserUtils uc;

	public String getUserCode(String name) {

		if (name.equals("����")) {
			
			uc = new UserChinaCode();

		} else if (name.equals("����")) {
			uc = new UserNumberCode();
		}
		else  if(name.equals("��ĸ"))
		{
			
			uc = new UserNumAndCharCode();
			
		}
		

		return uc.createCode();
	}

}
