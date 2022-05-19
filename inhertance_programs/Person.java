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

  final  String status1="freshman";
  final  String status2="junior";
  final  String status="Senior";
  @Override
public String toString() {
    
    return "This is Student class";
}


}
class Employee extends Person{
    String office ;
    String salary;
    String dateHired ;

    @Override
public String toString() {
    
    return "This is Employee class";
}

}
class Staff extends Employee{
    String title;
    @Override
public String toString() {
    
    return "This is Staff class";
}


}
class Faculty extends Employee{
    int hour;
    String rank;
    @Override
public String toString() {
    
    return "This is Faculty class";
}
    
}
class TestPerson {

    public static void main(String[] args) {

        Person person=new Person();
        Faculty faculty=new Faculty();
        Staff staff=new Staff();
        Employee employee=new Employee();
        Student student=new Student();
        System.out.println(person.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
        System.out.println(employee.toString());
        System.out.println(student.toString());
    }

    

}