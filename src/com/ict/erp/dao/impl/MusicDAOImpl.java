package com.ict.erp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ict.erp.dao.MusicDAO;
import com.ict.erp.vo.MusicInfo;

public class MusicDAOImpl extends CommonDAOImpl implements MusicDAO {

	@Override
	public List<MusicInfo> selectMusicInfoList(MusicInfo music) throws SQLException {
		String sql = "select * from Music_chart";
		List<MusicInfo> musicList = new ArrayList<MusicInfo>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				MusicInfo minfo = new MusicInfo(rs.getInt("mcNum"), rs.getString("mcName"), rs.getString("mcSinger"),
						rs.getString("mcVendor"), rs.getInt("mcLike"), rs.getInt("mcDisLike"), rs.getString("mcCredat"),
						rs.getString("mcDesc"));
				musicList.add(minfo);
			}
			return musicList;
		} catch (SQLException e) {
			throw e;
		} finally {
			close();
		}
	}

	@Override
	public MusicInfo getMusicInfo(int mcNum) throws SQLException {
		String sql = "select * from Music_chart where mcNum=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, mcNum);
			rs = ps.executeQuery();
			MusicInfo minfo = null;
			while (rs.next()) {
				minfo = new MusicInfo(rs.getInt("mcNum"), rs.getString("mcName"), rs.getString("mcSinger"),
						rs.getString("mcVendor"), rs.getInt("mcLike"), rs.getInt("mcDisLike"), rs.getString("mcCredat"),
						rs.getString("mcDesc"));
			}
			return minfo;
		} catch (SQLException e) {
			throw e;
		} finally {
			close();
		}
	}

	@Override
	public int insertMusicInfo(MusicInfo music) throws SQLException {
		String sql = "insert into Music_chart(mcNum, mcName, mcSinger, mcVendor, mcLike, mcDisLike, mcCredat, mcDesc)";
		sql += "values(seq_mcNum.nextval,?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, music.getMcName());
			ps.setString(2, music.getMcSinger());
			ps.setString(3, music.getMcVendor());
			ps.setInt(4, music.getMcLike());
			ps.setInt(5, music.getMcDislike());
			ps.setString(6, music.getMcCredat());
			ps.setString(7, music.getMcDesc());
			return ps.executeUpdate();
		} catch (SQLException e) {
			throw e;
		} finally {
			close();
		}
	}

	@Override
	public int updateMusicInfo(MusicInfo music) throws SQLException {
		String sql = "update Music_chart";
		sql += " set mcName=?,";
		sql += " mcSinger=?";
		sql += " mcVendor=?";
		sql += " mcLike=?";
		sql += " mcDislike=?";
		sql += " mcCredat=?";
		sql += " mcDesc=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, music.getMcName());
			ps.setString(2, music.getMcSinger());
			ps.setString(3, music.getMcVendor());
			ps.setInt(4, music.getMcLike());
			ps.setInt(5, music.getMcDislike());
			ps.setString(6, music.getMcCredat());
			ps.setString(7, music.getMcDesc());
			return ps.executeUpdate();
		} catch (SQLException e) {
			throw e;
		} finally {
			close();
		}
	}

	@Override
	public int deleteMusicInfo(MusicInfo music) throws SQLException {
		String sql = "delete from Music_chart where mcNum=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, music.getMcNum());
			return ps.executeUpdate();
		} catch (SQLException e) {
			throw e;
		} finally {
			close();
		}
	}

}
