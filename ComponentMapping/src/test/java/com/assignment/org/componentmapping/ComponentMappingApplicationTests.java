package com.assignment.org.componentmapping;

import com.assignment.org.componentmapping.entity.Address;
import com.assignment.org.componentmapping.entity.EmbeddedEmployee;
import com.assignment.org.componentmapping.repository.EmbeddedEmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ComponentMappingApplicationTests {

	@Autowired
	EmbeddedEmployeeRepository employeeRepository;
	@Test
	public void testEmbedding() {
		Address address=new Address("Mathura","Mata wali Gali","Uttar Pradesh");
		EmbeddedEmployee emp=new EmbeddedEmployee(1,"Shimanshu",address);
		employeeRepository.save(emp);
	}

}
