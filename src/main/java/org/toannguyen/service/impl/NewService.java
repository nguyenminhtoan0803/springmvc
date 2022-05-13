package org.toannguyen.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.toannguyen.dao.INewDAO;
import org.toannguyen.model.NewModel;
import org.toannguyen.service.INewService;

@Service
public class NewService implements INewService {
	
	@Autowired
	private INewDAO newDao;

//	@Autowired
//	private ICategoryDAO categoryDAO;
//
//	@Override
//	public List<NewModel> findByCategoryId(Long categoryId) {
//		return newDao.findByCategoryId(categoryId);
//	}
//
//	@Override
//	public NewModel save(NewModel newModel) {
//		newModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
//		CategoryModel category = categoryDAO.findOneByCode(newModel.getCategoryCode());
//		newModel.setCategoryId(category.getId());
//		Long newId = newDao.save(newModel);
//		return newDao.findOne(newId);
//	}
//
//	@Override
//	public NewModel update(NewModel updateNew) {
//		NewModel oldNew = newDao.findOne(updateNew.getId());
//		updateNew.setCreatedDate(oldNew.getCreatedDate());
//		updateNew.setCreatedBy(oldNew.getCreatedBy());
//		updateNew.setModifiedDate(new Timestamp(System.currentTimeMillis()));
//		CategoryModel category = categoryDAO.findOneByCode(updateNew.getCategoryCode());
//		updateNew.setCategoryId(category.getId());
//		newDao.update(updateNew);
//		return newDao.findOne(updateNew.getId());
//	}
//
//	@Override
//	public void delete(long[] ids) {
//		for (long id: ids) {
//			//1.delete comment (khoa ngoai new_id)
//			//2.delete news
//			newDao.delete(id);
//		}
//	}
//	@Override
//	public int getTotalItem() {
//		return newDao.getTotalItem();
//	}
//
//    @Override
//    public NewModel findOne(long id) {
//		NewModel newModel = newDao.findOne(id);
//		CategoryModel categoryModel = categoryDAO.findOne(newModel.getCategoryId());
//		newModel.setCategoryCode(categoryModel.getCode());
//        return newModel;
//    }

	@Override
	public List<NewModel> findAll() {
		return newDao.findAll();
	}
}
