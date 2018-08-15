import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.dao.stuDao;
import com.offcn.po.NewStudent;

public class TestDao {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");

		stuDao dao = context.getBean(stuDao.class);
		
		List<NewStudent> list = dao.getAll();
		for (NewStudent stu : list) {
			System.out.println("姓名:"+stu.getName()+" 成绩:"+stu.getScore()+" 电话:"+stu.getPhone());
		}
	}

}
