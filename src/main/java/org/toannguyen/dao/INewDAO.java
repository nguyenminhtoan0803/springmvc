package org.toannguyen.dao;

import java.util.List;

import org.toannguyen.model.NewModel;

public interface INewDAO extends GenericDAO<NewModel> {
//	NewModel findOne(Long id);
//	List<NewModel> findByCategoryId(Long categoryId);
//	Long save(NewModel newModel);
//	void update(NewModel updateNew);
//	void delete(long id);
//	int getTotalItem();
	List<NewModel> findAll();
}
