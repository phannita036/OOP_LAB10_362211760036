import java.util.List;


public interface EmployeeDAO {

    //CRUD Operation
    public List<Employee> getAllEmp();
    public void  addEmp (Employee emp);
    public Employee findById (String id);
    public  void updateEmp(Employee employee);
    public void deleteEmp(String id);

}