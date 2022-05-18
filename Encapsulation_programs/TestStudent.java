public class TestStudent {
    public static void main(String[] arg){
        String name ="Arti";
        // private String rollno;
        int age=22;
        String dept="CS";
        String rollno="18CS60";
        // First Method 
        Student Arti=new Student(name,rollno,age,dept);
        System.out.println(" Name "+Arti.getName());
        System.out.println(" Department "+Arti.getDept());
        System.out.println(" Age "+Arti.getAge());
        System.out.println(" Roll No "+Arti.getRollno());

        //  Second method Aynanmous function =====>new Student(name,rollno,age,dept)
        
        // System.out.println(" Name "+new Student(name,rollno,age,dept).getName());
        // System.out.println(" Department "+new Student(name,rollno,age,dept).getDept());
        // System.out.println(" Age "+new Student(name,rollno,age,dept).getAge());
        // System.out.println(" Roll No "+new Student(name,rollno,age,dept).getRollno());
    }
    
}
