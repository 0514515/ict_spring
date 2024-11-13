package myreview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import myreview.model.ReplyDao;
import myreview.vo.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService{

	@Autowired
	private ReplyDao replyDaoImpl;
	
	@Override
	public void insertReply(ReplyVO vo) {
		replyDaoImpl.insertReply(vo);		
	}
	
}
