public class Student {

   private String name;
   private String rollno;
   private int age;
   private String dept;

public Student(){}
public Student(String name, String rollno,int age, String dept)
{


    this.age=age;
    this.name=name;
    this.dept=dept;
    this.rollno=rollno;

}
    public String getName(){
        return this.name;
    }
    public void SetName(String name) {
     
       this.name=name;
    }
    public  void setAge(int age) {
        this.age=age;
    }
    
    public int getAge(){
      
       return this.age;
    
    }
    public void SetDept(String dept){
     
        this.dept=dept;
    
    }
    public String getDept(){
     
        return dept;
    
    }  
    public void setRollno(String rollno){
     
        this.rollno=rollno;
    }  
    public String getRollno(){
     
        return rollno;
    
    }  


}
