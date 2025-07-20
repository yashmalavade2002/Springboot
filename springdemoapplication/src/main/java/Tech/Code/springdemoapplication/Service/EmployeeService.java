package Tech.Code.springdemoapplication.Service;

import Tech.Code.springdemoapplication.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public  String getEmployee(Integer id){

      final  String employee =  employeeRepository.getEmployee(id);
        return employee;
    }
}
