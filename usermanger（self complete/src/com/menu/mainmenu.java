package com.menu;

import com.mainmenuitem.exit;
import com.mainmenuitem.login;
import com.mainmenuitem.reg;
import com.usermanger.Item;
import com.usermanger.Menu;
import com.utils.consoleutil;

public class mainmenu implements Menu {

	@Override
	public void showinfo() {
		// TODO Auto-generated method stub
		System.out.println("��ӭʹ��neusoft�û�����ϵͳ");
		System.out.println("----------------------");
		System.out.println("�û���¼---------------1");
		System.out.println("�û�ע��---------------2");
		System.out.println("�˳�����---------------3");
	}

	@Override
	public Item pickItem() {
		// �ṩѡ�new����
		Item item=null;
	int option =consoleutil.getnum(1, 3);	
		switch(option){
		case 1:
			item = new login();
			break;
		case 2:
			item =new reg();
			break;
		case 3:
			item = new exit();
			break;
		}
		return item;
	}

}
