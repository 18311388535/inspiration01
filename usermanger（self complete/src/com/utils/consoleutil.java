package com.utils;

import java.util.Scanner;
//�ڿ���̨��ȡ����ѡ��
public class consoleutil {
 public static int getnum(int low,int high){
	while(true){
		Scanner sc=new Scanner(System.in);
		//System.out.println("��ѡ��");
		try {
			int num =sc.nextInt();
			if (num<low||num >high){
				System.out.println("����ѡ�Χ��������ѡ��");
				
			}else{
				return num;
			}
		} catch (Exception e) {
			System.out.println("�Ƿ��ַ���������ѡ��");
		}	
	} 	 
 }
 
 public static int getid(){
			Scanner sc=new Scanner(System.in);
			int id =sc.nextInt();
			return id;
				
		 	 
	 }
 //�ڿ���̨�õ��Ϸ��ַ���---�û��������룻
 	public static String getString(){
 		while(true){
 			Scanner sc =new Scanner(System.in);
 			String str=sc.nextLine();
 			if(str!=null&&str.trim()!=null){
 				return str;
 			}else{
 				System.out.println("�Ƿ��ַ�������������");
 			}
 			
 		}
 	}
 	
 	public static String getemail(){
 		while(true){
 			Scanner sc =new Scanner(System.in);
 			String email =sc.nextLine();
 			//1.������@����ֻ��һ��
 			//2.@������.ǰ��
 			//3.@���ܿ�ͷ���β
 			if(email.indexOf("@")==-1||email.indexOf(".")==-1){
 				System.out.println("@--.");
 			}else if(email.indexOf("@")!=email.lastIndexOf("@")||email.indexOf(".")!=email.lastIndexOf(".")){
 				System.out.println("duo@-.");
 			}else if(email.indexOf("@")>=email.indexOf(".")){
 				System.out.println("weizhi");
 			}else if(email.startsWith("@")||email.endsWith(".")){
 				System.out.println("touwei");
 			}else{
 				return email;
 			}
 		}
 	}
 	
}
