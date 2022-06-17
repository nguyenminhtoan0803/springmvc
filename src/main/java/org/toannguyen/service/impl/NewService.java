package org.toannguyen.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.toannguyen.dto.NewDTO;
import org.toannguyen.entity.NewEntity;
import org.toannguyen.repository.NewRepository;
import org.toannguyen.service.INewService;

@Service
public class NewService implements INewService {
	
	@Autowired
	private NewRepository newRepository;
	
	@Override
	public List<NewDTO> findAll() {
		List<NewDTO> models = new ArrayList<>();
		List<NewEntity> entities = newRepository.findAll();
		for (NewEntity item: entities) {
			NewDTO newDTO = new NewDTO();
			newDTO.setTitle(item.getTitle());
			newDTO.setShortDescription(item.getShortDescription());
			models.add(newDTO);
		}
		return models;
	}

//	@Override
//	public int getTotalItem() {
//		return (int) newRepository.count();
//	}
}
