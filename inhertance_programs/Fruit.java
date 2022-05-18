package inhertance_programs;
public class Fruit {
    String color;
    String name;
public void taste(){

    System.out.println("=====>This is Fruit Class<========= ");
    System.out.println("Taste  a fruit");


}}
    class Apple extends Fruit
    {
            public void dispColor(){
                color="Red";name="Apple";

                System.out.println("=====>This is Apple Class<========= ");
                System.out.println("Fruit is "+ name);
                System.out.println("Apple color is "+ color);


            }
            public void taste(){

               super.taste();
                System.out.println("Taste  of Apple is sweet ");
            
            
            }

    }




class TestFruit{

    public static void main(String[] args) {
        Apple apple=new Apple();
        apple.dispColor();
        apple.taste();
    }
}