package com.start;

import com.menu.mainmenu;
import com.usermanger.Item;
import com.usermanger.Menu;

public class Strart {
	//�û�����ϵͳ
public static void main(String[] args) {
	//1.��ȡ���˵�ѡ��
	Menu menu =new mainmenu();
	
		while(menu!=null){
		//2.��ʾ����
		menu.showinfo();
		//3.�ṩѡ��
		Item item = menu.pickItem();
		//ִ�й���
		menu=item.execute();
		}
	
	System.out.println("ллʹ�ã��ټ�");			
	}
}		

