package pl.piomin.services.department.repository;

import org.springframework.data.repository.CrudRepository;
import pl.piomin.services.department.model.Department;

import java.util.List;

public interface DepartmentRepository extends CrudRepository<Department, String> {

	List<Department> findByOrganizationId(Long organizationId);
	
}
