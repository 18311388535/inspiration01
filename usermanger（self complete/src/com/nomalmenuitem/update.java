package com.nomalmenuitem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mainmenuitem.login;
import com.menu.normalmenu;
import com.usermanger.Item;
import com.usermanger.Menu;
import com.utils.DButil;
import com.utils.consoleutil;

public class update implements Item{

	@Override
	public Menu execute() {
		boolean f=true;
		while(f==true){
		System.out.println("������Ҫ�޸ĵ�����");
		String newusername=consoleutil.getString();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=DButil.getinstance().getconnection();
			ps=con.prepareStatement("select *from userinfo where username=? and id!=?");
			ps.setString(1, newusername);
			ps.setInt(2, login.loginuser.getId());
		    rs=ps.executeQuery();
		    if(rs.next()){
		    	System.out.println("�����ѱ�ռ�ã�����������");	
		    }else{
		    	System.out.println("������Ҫ�޸ĵ�����");
				String newpassword=consoleutil.getString();
				System.out.println("������Ҫ�޸ĵ�����");
				String newemail=consoleutil.getemail();
				ps=con.prepareStatement("update userinfo set username=?,password=?,email=? where id=?");
				ps.setString(1, newemail);
				ps.setString(2, newpassword);
				ps.setString(3, newemail);
				ps.setInt(4, login.loginuser.getId());
				ps.executeQuery();
				con.commit();
				login.loginuser.setUsername(newusername);
				login.loginuser.setPassword(newpassword);
				login.loginuser.setEmail(newemail);
				f=false;
		    }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DButil.getinstance().close(con);
			DButil.getinstance().close(ps);
			DButil.getinstance().close(rs);
			
		}
		}
		
		return new normalmenu();
	}

}
