package com.ict.erp.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ict.erp.dao.MovieDAO;
import com.ict.erp.vo.TiketMovie;

public class MovieDAOImpl extends CommonDAOImpl implements MovieDAO {

	@Override
	public List<TiketMovie> selectTiketMovie(TiketMovie tm) throws SQLException{
		String sql = "select * from ticket_movie";
		List<TiketMovie> movieList = new ArrayList<TiketMovie>();
		try {			
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				TiketMovie tme= new TiketMovie(rs.getLong("tmNum"),rs.getString("tmName"),rs.getLong("tmPrice"),rs.getLong("tmStartDat"),rs.getLong("tmEndDat"), rs.getString("tmCredat"), rs.getString("tmDesc"),rs.getLong("tmcnt"), rs.getString("tmImg"));		
				movieList.add(tme);
			}
			return movieList;
	}catch (SQLException e) {
		throw e;
	}finally {
		close();
	}
	}

	@Override
	public TiketMovie getTiketMovie(TiketMovie tm) throws SQLException{
		String sql = "select * from ticket_movie where tmNum=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setLong(1, tm.getTmNum());
			rs = ps.executeQuery();
			if(rs.next()) {
				TiketMovie tme= new TiketMovie(rs.getLong("tmNum"),rs.getString("tmName"),rs.getLong("tmPrice"),rs.getLong("tmStartDat"),rs.getLong("tmEndDat"), rs.getString("tmCredat"), rs.getString("tmDesc"),rs.getLong("tmcnt"), rs.getString("tmImg"));		
				return tme;
			}
		}catch(SQLException e) {
			throw e;
		}finally {
			close();
		};
		return null;
	}

	@Override
	public int insertTiketMovie(TiketMovie tm) throws SQLException{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTiketMovie(TiketMovie tm) throws SQLException{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteTiketMovie(TiketMovie tm) throws SQLException{
		// TODO Auto-generated method stub
		return 0;
	}

}
