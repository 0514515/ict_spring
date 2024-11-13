import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import board.EmpService;
import board.vo.EmpVO;

public class MainEmp {

	public static void main(String[] args) {

		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		EmpService service = container.getBean("empService",EmpService.class);
		
		List<EmpVO> list = service.selectEmp();
		for(EmpVO vo : list) {
			System.out.println("=>> " + vo.toString());
		}
	}
}
