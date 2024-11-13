package board.vo;

import lombok.Data;

@Data
public class EmpVO {
	private Long empno;
	private String ename;
	private String job;
	private Integer mgr;
	private String hiredate;
	private Integer sal;
	private Integer comm;
	private Integer deptno;
}
