package com.traning.springboot.repository;

//public interface EmployeeRepository {
//}
//package com.training.springboot.repository;

        import com.traning.springboot.model.Employee;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}