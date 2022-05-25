package inhertance_programs;

public abstract class Parent {

    public abstract  void message() ;   }
    

class child1 extends Parent{

    public  void message(){
        System.out.println("This is 1st subclass");

    }}
class child2 extends Parent{

    public  void message(){
        System.out.println("This is 2nd subclass");
    }

}
class TestParent{

public static void main(String[] args) {
    child1 ch1=new child1();
    child2 ch2=new child2();
    ch1.message();
    ch2.message();

}}
