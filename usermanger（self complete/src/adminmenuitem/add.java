package adminmenuitem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.menu.adminmenu;
import com.usermanger.Item;
import com.usermanger.Menu;
import com.utils.DButil;
import com.utils.consoleutil;

public class add implements Item {

	@Override
	public Menu execute() {
		System.out.println("�������û���");
		String username=consoleutil.getString();
		System.out.println("����������");
		String password=consoleutil.getString();
		System.out.println("����������");
		String email=consoleutil.getemail();
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=DButil.getinstance().getconnection();
			ps=con.prepareStatement("select *from userinfo where username=?");
			ps.setString(1, username);
			rs=ps.executeQuery();
			if(rs.next()){
				System.out.println("�û����Ѵ���");
			}else{
				ps=con.prepareStatement("insert into userinfo value username=?,password=?,email=?");
				System.out.println("��ӳɹ�");
			}
		return new adminmenu();
	}catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		DButil.getinstance().close(con);
		DButil.getinstance().close(ps);
		DButil.getinstance().close(rs);
	}
		return new adminmenu();
  }
}
