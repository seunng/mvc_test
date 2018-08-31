package com.ict.erp.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.MusicDAO;
import com.ict.erp.dao.impl.MusicDAOImpl;
import com.ict.erp.service.MusicService;
import com.ict.erp.vo.MusicInfo;

public class MusicServiceImpl implements MusicService {
	private MusicDAO mdao = new MusicDAOImpl();

	@Override
	public List<MusicInfo> selectMusicInfoList(MusicInfo music) throws SQLException {
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.selectMusicInfoList(music);
		} catch (SQLException e) {
			throw e;
		} finally {
			DBCon.close();
		}
	}

	@Override
	public MusicInfo getMusicInfo(int mcNum) throws SQLException {
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.getMusicInfo(mcNum);
		} catch (SQLException e) {
			throw e;
		} finally {
			DBCon.close();
		}
	}

	@Override
	public int insertMusicInfo(MusicInfo music) throws SQLException{
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.insertMusicInfo(music);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.getCon();
		}
	}

	@Override
	public int updateMusicInfo(MusicInfo music) throws SQLException{
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.updateMusicInfo(music);			
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
	}

	@Override
	public int deleteMusicInfo(MusicInfo music) throws SQLException{
		mdao.setConnection(DBCon.getCon());
		try {
			return mdao.deleteMusicInfo(music);
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
	}

}
