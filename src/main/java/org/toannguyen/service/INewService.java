package org.toannguyen.service;

import java.util.List;

import org.toannguyen.model.NewModel;

public interface INewService {
	
//	List<NewModel> findByCategoryId(Long categoryId);
//	NewModel save(NewModel newModel);
//	NewModel update(NewModel updateNew);
//	void delete(long[] ids);
//	
//	int getTotalItem();
//	NewModel findOne(long id);

	List<NewModel> findAll();
}
