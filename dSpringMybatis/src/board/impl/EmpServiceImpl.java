package board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.EmpService;
import board.vo.EmpVO;

@Service("empService")
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpDAOMybatis mybatis;
	
	@Override
	public List<EmpVO> selectEmp() {
		List<EmpVO> list = mybatis.selectEmp();
		return list;
	}
}