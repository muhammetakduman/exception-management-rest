package com.muhammetakduman.exception_management;

import com.muhammetakduman.starter.ExceptionManagementStarter;
import com.muhammetakduman.starter.dto.DtoEmployee;
import com.muhammetakduman.starter.service.IEmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {ExceptionManagementStarter.class})
class ExceptionManagementApplicationTests {
	@Autowired
	private IEmployeeService iEmployeeService;

	@Test
	public void TestFindEmployeeById(){
		 DtoEmployee dtoEmployee = iEmployeeService.findEmployeeById(2L);
		 if (dtoEmployee != null){
			 System.out.println("İsim" + dtoEmployee.getName());
		 }
	}
}
