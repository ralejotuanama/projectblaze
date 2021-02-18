package com.blaze.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.blaze.model.Employee;


@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

	@Autowired
	private IEmpleadoService repo;
	
	
	@Override
	public Page<Employee> listarPageable(Pageable pageable) {
		// TODO Auto-generated method stub
		return repo.listarPageable(pageable);
	}

}
