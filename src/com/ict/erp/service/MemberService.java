//4. package service interface 생성(service는 data와 관련없으므로 DAO 상속 안해줘도 됨)
//++ throws SQLException 붙으면 impl에도 붙여줘야함

package com.ict.erp.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ict.erp.vo.MemberInfo;

public interface MemberService {
	public List<MemberInfo> selectMiList(MemberInfo mi) throws SQLException;
	public MemberInfo selectMi(MemberInfo mi) throws SQLException;
	public Map<String,Object> insertMi(MemberInfo mi) throws SQLException; //impl에서 Map형식으로 data를 가져올것이므로 int에서 Map으로 변경
	public Map<String,Object> updateMi(MemberInfo mi) throws SQLException;
	public Map<String,Object> deleteMi(MemberInfo mi) throws SQLException;
}
