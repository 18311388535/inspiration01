package com.practice1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer o3=new customer();
		judge o4=new judge();
		random o5=new random();
		System.out.println("��ӭ����˫ɫ��");
		System.out.println("�븶�һע��Ԫ");
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		money money =new money();
		money.pay(p);
		int flag=1;
		if(money.extra>=0){
			System.out.println("����ɹ����ܶ�"+money.m+"���"+money.extra);
		}else{
			System.out.println("����");
			flag=0;
		}
		if(flag==1){
			o4.prize();
		}
		
		
		
	}
}
