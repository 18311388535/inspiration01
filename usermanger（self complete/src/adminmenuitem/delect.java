package adminmenuitem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.menu.adminmenu;
import com.usermanger.Item;
import com.usermanger.Menu;
import com.utils.DButil;
import com.utils.consoleutil;

public class delect implements Item {

	@Override
	public Menu execute() {
		int id=-1;	
		System.out.println("������Ҫɾ���û���ID��");
		try {
			id=consoleutil.getid();
		} catch (Exception e) {
			System.out.println("ID�����Ϲ淶");
			return new adminmenu();
		}
		 
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			con=DButil.getinstance().getconnection();
			ps=con.prepareStatement("delete *from userinfo where id=?");
			ps.setInt(1, id);
			rs=ps.executeQuery();
			if(rs.next()){
				System.out.println("ɾ���ɹ�");
			}else{
				System.out.println("ID�����ڣ�����������");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DButil.getinstance().close(con);
			DButil.getinstance().close(ps);
			DButil.getinstance().close(rs);
		}
		
		
		return new adminmenu();
	}

}
