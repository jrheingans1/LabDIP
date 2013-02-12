package dip.lab1.student.solution1;

public class HRService {
    
   private Employee employee;
    
 
public HRService(Employee a){
    employee = a;
}
public HRService(){
    
}
public void setEmployee(Employee a){
    if (a == null) {
        throw new NullPointerException();
    }
    
    employee = a;
}

public double getAnnualCompensationForEmployee() {
        return employee.getAnnualWages();
}

public double getAnnualCompensationForEmployee(Employee a) {
        return a.getAnnualWages();
    }

   }
