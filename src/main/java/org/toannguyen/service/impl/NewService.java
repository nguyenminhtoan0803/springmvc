package org.toannguyen.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
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

		ModelMapper modelMapper = new ModelMapper();

		List<NewEntity> entities = new ArrayList<>();

		entities = newRepository.findAll();

		List<NewDTO> newDTOs = new ArrayList<>();

		for (NewEntity items : entities) {
			NewDTO newDTO = modelMapper.map(items, NewDTO.class);
			newDTOs.add(newDTO);
		}

		return newDTOs;
	}

}
