package com.example.Employee;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployeeController {

    Map<Integer , Employee> db = new HashMap<>();

    // Post API (add the data)
    @PostMapping("/add_emp")
    public String addEmployee(@RequestBody Employee employee){

        int empId = employee.getEm_Id();
        db.put(empId , employee);

        return "Employee Added Successful";
    }

    //get the employee
    @GetMapping("/get_emp")
    public Employee getEmployee(@RequestParam("q") int em_Id){
        return db.get(em_Id);

    }

    @DeleteMapping("/delete_emp/{emId}")
    public String deleteEmp(@PathVariable("emId") int emId) {
        if(!db.containsKey(emId))
            return "Invalid User Id";

        db.remove(emId);
        return "Employee Remove Successful";

    }

    @PutMapping("/update_emp")
    public String updateEmp(@RequestParam("emId") int emId ,@RequestParam("salary") int salary) {

        if(!db.containsKey(emId))
            return "Invalid Id";

        db.get(emId).setSalary(salary);
        return "upadte Successful";

    }

}
