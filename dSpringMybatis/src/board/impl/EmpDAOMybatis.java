package board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.vo.EmpVO;

@Repository("empDAO")
public class EmpDAOMybatis {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<EmpVO> selectEmp(){
		
		return mybatis.selectList("com.ict.EmpMapper.selectEmp");
	}
}
