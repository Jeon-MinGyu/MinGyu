package kr.ac.cu.tv.model.sql;

import javax.xml.ws.ResponseWrapper;

import kr.ac.cu.user.model.vo.UserVO;

@ResponseWrapper("userD")
public class UserDaoImpl implements UserDao{
	
	public UserVO loginRow(UserVO user) {
		UserVO result = session.selectOne("test.user.login",user);
	return null;
	}
}
