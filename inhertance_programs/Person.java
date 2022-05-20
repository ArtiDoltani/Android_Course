package inhertance_programs;

public class Person {

  private String name;
  private String address;
  private int Phone_num;
  private String email;
  
@Override
public String toString() {
    
    return "This is Person class";
}
/**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return int return the Phone_num
     */
    public int getPhone_num() {
        return Phone_num;
    }

    /**
     * @param Phone_num the Phone_num to set
     */
    public void setPhone_num(int Phone_num) {
        this.Phone_num = Phone_num;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
}


class Student extends Person{


    private final String status;
  public Student(String status){
    this.status=status;


  }
  public String getStatus() {
    return status;
}
  @Override
public String toString() {
    
    return "This is Student class";
}
    

}
class Employee extends Person{
    private Boolean office ;
    private  Double salary;
    private  String dateHired ;
    public Boolean isOffice() {
        return office;
    }

    /**
     * @param office the office to set
     */
    public void setOffice(Boolean office) {
        this.office = office;
    }

    /**
     * @return Double return the salary
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return String return the dateHired
     */
    public String getDateHired() {
        return dateHired;
    }

    /**
     * @param dateHired the dateHired to set
     */
    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }


    @Override
public String toString() {
    
    return "This is Employee class";
}

}
class Staff extends Employee{
   private String title;
   public String getTitle() {
    return title;
}

/**
 * @param title the title to set
 */
public void setTitle(String title) {
    this.title = title;
}
    @Override
public String toString() {
    
    return "This is Staff class";
}


}
class Faculty extends Employee{
    private  double hour;
    private double rank;
    
    


    /**
     * @return double return the hour
     */
    public double getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(double hour) {
        this.hour = hour;
    }

    /**
     * @return double return the rank
     */
    public double getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(double rank) {
        this.rank = rank;
    }
    @Override
public String toString() {

    return "This is Faculty class ";
}
    
}
class TestPerson {

    public static void main(String[] args) {
        
        Person person=new Person();
        Faculty faculty=new Faculty();
        Staff staff=new Staff();
        Employee employee=new Employee();
        Student student=new Student("junior");
        Student student2=new Student("Senior");
        person.setName("Person1");

        faculty.setEmail("abc@gmail.com");
        faculty.setSalary(20000);
        System.out.println(person.toString());
        System.out.println("Name: "+person.getName());
        System.out.println(faculty.toString());
        System.out.println("Email: "+faculty.getEmail());
        System.out.println("Salary: "+faculty.getSalary());
        System.out.println(staff.toString());
        System.out.println(employee.toString());
        System.out.println(student.toString());
        System.out.println("Status of student1: "+student.getStatus());
        System.out.println("Status of student2: "+student2.getStatus());
    }



    
 
}