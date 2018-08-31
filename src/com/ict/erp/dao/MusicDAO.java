package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.MusicInfo;

public interface MusicDAO extends CommonDAO {
	public List<MusicInfo> selectMusicInfoList(MusicInfo music) throws SQLException ;
	public MusicInfo getMusicInfo(int mcNum) throws SQLException;
	public int insertMusicInfo (MusicInfo music) throws SQLException;
	public int updateMusicInfo (MusicInfo music) throws SQLException;
	public int deleteMusicInfo (MusicInfo music) throws SQLException;

}
