//2. package dao - interface DAO 생성(database는 DAO와 관련이 있으므로 extends CommonDAO)
//++ throws SQLException 붙이면 Impl에도 붙여줘야함

package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ict.erp.vo.DepartInfo;
import com.ict.erp.vo.MemberInfo;

public interface MemberDAO extends CommonDAO {
	public List<MemberInfo> selectMiList(MemberInfo mi) throws SQLException; //List에 data를 담기위해
	public MemberInfo getMemberInfo(int miNum) throws SQLException; //view : List에 있는 정보를 하나?만 출력?
	public int insertMi(MemberInfo mi) throws SQLException; //추가
	public int updateMi(MemberInfo mi) throws SQLException; //수정
	public int deleteMi(MemberInfo mi) throws SQLException; //삭제


}
