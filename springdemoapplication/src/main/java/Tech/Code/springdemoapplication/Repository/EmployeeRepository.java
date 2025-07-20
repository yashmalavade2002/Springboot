package Tech.Code.springdemoapplication.Repository;


import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
    public String getEmployee(Integer id) {
        // DB Operations
        return "emp";
    }
}
