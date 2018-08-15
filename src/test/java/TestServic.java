import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.po.NewStudent;
import com.offcn.service.stuService;

public class TestServic {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml","spring-service.xml");

		stuService service = context.getBean(stuService.class);
		List<NewStudent> list = service.getAll();
		for (NewStudent stu : list) {
			System.out.println("姓名:"+stu.getName()+" 成绩:"+stu.getScore()+" 电话:"+stu.getPhone());
		}
	}

}
