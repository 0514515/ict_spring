package myreview;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import myreview.service.ReplyService;
import myreview.vo.ReplyVO;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ctx.xml");
		
		ReplyVO rvo = context.getBean("reply",ReplyVO.class);
		ReplyService replyService = context.getBean("replyService",ReplyService.class);
		
		replyService.insertReply(rvo);
	}
}