package com.blaze.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.blaze.model.Employee;



public interface IEmpleadoService {

	

	Page<Employee> listarPageable(Pageable pageable);
}
