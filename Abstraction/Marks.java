package Abstraction;
public abstract class Marks {
    public abstract void getPercentage();
    
}

 class StudentA extends Marks{
     int sub1_marks;
     int sub2_marks;
     int sub3_marks;
  public StudentA(int sub1_marks,int sub2_marks,int sub3_marks){
      this.sub1_marks=sub1_marks;
      this.sub2_marks=sub2_marks;
      this.sub3_marks=sub3_marks;

  }
    public  void getPercentage()
{
    //Calculating percentage
double per=((sub1_marks+sub2_marks+sub3_marks)*100)/300;
System.out.println("Percentage of StudentA : "+ per+"%");
}
 }

 
 class StudentB extends Marks{
    int sub1_marks;
    int sub2_marks;
    int sub3_marks;
    int sub4_marks;
 public StudentB(int sub1_marks,int sub2_marks,int sub3_marks,int sub4_marks){
        this.sub1_marks=sub1_marks;
        this.sub2_marks=sub2_marks;
        this.sub3_marks=sub3_marks;
        this.sub4_marks=sub4_marks;

 }
   public  void getPercentage()
{
   //Calculating percentage
double p=((sub1_marks+sub2_marks+sub3_marks+sub4_marks)*100)/400;
System.out.println("Percentage of StudentB : "+ p+"%");
//return this.p;


}
}
class TestMarks{
    public static void main(String[] args) {
        StudentA std1=new StudentA(60, 80, 50);
        StudentB std2=new StudentB(70, 60, 40, 70);
        std1.getPercentage();
        std2.getPercentage();
             
    }
}
