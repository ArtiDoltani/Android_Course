import java.util.Scanner;

public class TestEmployee {
    
 public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    System.out.println("Enter Name");
 String userinput_1 = input.next();
    System.out.println("Enter Gender");
       String userinput_2 = input.next();
        // System.out.println("Enter Depart");
        // String userinput_3 = input.next();
        System.out.println("Enter Salary");
        int userinput_4 = input.nextInt();
        System.out.println("Enter city");
       String userinput_5 = input.next(); 



    
     Address add=new Address();
     Department dept=new Department();
     Employee employee=new Employee();

    employee.setName(userinput_1);
     employee.setAddress(add);
    employee.setGender(userinput_2);
    // employee.setGender("Female");
    // employee.setDepartment(dept);
      employee.setSalary(userinput_4);
    // employee.setSalary(800000);
    // dept.setDept_id("CS3");
       add.setCity_name(userinput_5);
    // add.setCity_name("Hyderabad");
    // add.setCity_state("abs");
    // employee.setJob_id("1");

detail(employee);




}


public static void detail(Employee emp){
    System.out.println("Name: " + emp.getName());
    System.out.println("Address: " + emp.getAddress().getCity_name());
    System.out.println("Gender: " + emp.getGender());
    // System.out.println("Department Id: " + emp.getDepartment().getDept_id());
    System.out.println("Salary: " + emp.getSalary());
    // System.out.println("Job ID: " + emp.getJob_id());




}



}
