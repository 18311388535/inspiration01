package com.menu;

import com.mainmenuitem.exit;
import com.usermanger.Item;
import com.usermanger.Menu;
import com.utils.consoleutil;

import adminserchmenuitem.all;
import adminserchmenuitem.byid;
import adminserchmenuitem.name;

public class adminserchmenu implements Menu {

	@Override
	public void showinfo() {
		System.out.println("��ѡ���ѯ��ʽ");
		System.out.println("��ѯȫ���û�----------1");
		System.out.println("ͨ��ID��ѯ�û�--------2");
		System.out.println("ͨ��������ѯ�û�-------3");
		System.out.println("�˳�----------------4");
	}

	@Override
	public Item pickItem() {
		Item item=null;
		int option=consoleutil.getnum(1, 4);
		switch (option) {
		case 1:
			item=new all();
			break;
		case 2:
			item=new byid();
			break;
		case 3:
			item=new name();
			break;
		case 4:
			item=new adminserchmenuitem.exit();
			break;
		}
		return item;
	}

}
