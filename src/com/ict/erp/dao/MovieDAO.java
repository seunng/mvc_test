package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.TiketMovie;

public interface MovieDAO extends CommonDAO {
	public List<TiketMovie> selectTiketMovie(TiketMovie tm) throws SQLException;
	public TiketMovie getTiketMovie(TiketMovie tm) throws SQLException;
	public int insertTiketMovie (TiketMovie tm) throws SQLException;
	public int updateTiketMovie (TiketMovie tm) throws SQLException;
	public int deleteTiketMovie (TiketMovie tm) throws SQLException;

}
