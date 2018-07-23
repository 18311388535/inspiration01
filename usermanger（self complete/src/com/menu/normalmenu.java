package com.menu;

import com.mainmenuitem.login;
import com.nomalmenuitem.exit;
import com.nomalmenuitem.serch;
import com.nomalmenuitem.update;
import com.usermanger.Item;
import com.usermanger.Menu;
import com.utils.consoleutil;

public class normalmenu implements Menu {

	@Override
	public void showinfo() {
		String loginname=login.loginuser.getUsername();
		System.out.println("-------------");
		System.out.println("��ӭ��½������");
		System.out.println(loginname+"����                    ����Ȩ����:��ͨ�û�");
		System.out.println("��ѯ�Լ�����Ϣ-------1");
		System.out.println("�޸��Լ�����Ϣ-------2");
		System.out.println("�˳���¼------------3");
		
	}

	@Override
	public Item pickItem() {
		Item item=null;
		int option=consoleutil.getnum(1, 3);
		switch (option) {
		case 1:
			item=new serch();
			break;
		case 2:
			item=new update();
			break;
		case 3:
			item=new exit();
			break;
		}
		return item;
	}

}
