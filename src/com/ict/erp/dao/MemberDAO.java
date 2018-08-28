//2. package dao - interface DAO 생성(database는 DAO와 관련이 있으므로 extends CommonDAO)

package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ict.erp.vo.DepartInfo;
import com.ict.erp.vo.MemberInfo;

public interface MemberDAO extends CommonDAO {
	public List<MemberInfo> selectMiList(MemberInfo mi) throws SQLException;
	public MemberInfo getMemberInfo(int miNum) throws SQLException;
	public int insertMi(MemberInfo mi) throws SQLException;
	public int updateMi(MemberInfo mi) throws SQLException;
	public int deleteMi(MemberInfo mi) throws SQLException;


}
