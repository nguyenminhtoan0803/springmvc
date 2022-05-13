package org.toannguyen.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.toannguyen.dao.ICategoryDAO;
import org.toannguyen.model.CategoryModel;
import org.toannguyen.service.ICategoryService;

public class CategoryService implements ICategoryService {

	@Inject
	private ICategoryDAO categoryDao;

	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}
}
