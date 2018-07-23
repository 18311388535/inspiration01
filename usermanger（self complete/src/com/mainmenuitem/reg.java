package com.mainmenuitem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.menu.mainmenu;
import com.menu.normalmenu;
import com.usermanger.Item;
import com.usermanger.Menu;
import com.utils.DButil;
import com.utils.consoleutil;

public class reg implements Item {
	 
	@Override
	public Menu execute() {
		// TODO Auto-generated method stub
		System.out.println("ע�����");
		System.out.println("----------------");
		System.out.println("�������û���");
		String username=consoleutil.getString();
		System.out.println("����������");
		String email =consoleutil.getemail();
		System.out.println("�������û�Ȩ��");
		int power=consoleutil.getnum(1, 2);
		System.out.println("����������");
		String password =consoleutil.getString();
		
		//jdbc����û��Ƿ�Ϸ�
		Connection con = null;
		 PreparedStatement ps=null;
		 ResultSet rs=null;
		try {
			 con=DButil.getinstance().getconnection();
			 ps=con.prepareStatement("select *from userinfo where username=?");
			ps.setString(1, username);
			rs=ps.executeQuery();
			if(rs.next()){
				System.out.println("�û����ѱ�ע��");
			}else{
				con.setAutoCommit(false);
				ps = con.prepareStatement("insert into userinfo(username,password,email,power) values(?,?,?,?)");
				ps.setString(1,username);
				ps.setString(2,password);
				ps.setString(3,email);
				ps.setInt(4,power);
				ps.executeUpdate();
				con.commit();
				System.out.println("��ϲע��ɹ�");
				return new normalmenu();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(con!=null){
				DButil.getinstance().close(con);
			}
			if(ps!=null){
				DButil.getinstance().close(ps);
			}
			if(rs!=null){
				DButil.getinstance().close(rs);
			}
		} 
		
		return new mainmenu();
	}

}
