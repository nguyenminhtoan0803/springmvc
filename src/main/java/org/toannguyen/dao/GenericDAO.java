package org.toannguyen.dao;

import java.util.List;

import org.toannguyen.mapper.RowMapper;


public interface GenericDAO<T> {
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
	void update (String sql, Object... parameters);
	Long insert (String sql, Object... parameters);
	int count(String sql, Object... parameters);
}
