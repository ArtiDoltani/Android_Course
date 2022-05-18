package inhertance_programs;
public class Animal {
    String name;
    public void eat(){
        System.out.println("Animal can eat");
    }    }
class dog extends Animal{
    public void display(){

        System.out.println("=====>This is Dog Class<========= ");
        name="jack";
        System.out.println("I am "+ name);  }


    public void bark(){
        System.out.println("Dog can bark");
    }
    public void eat(){
        super.eat();

        System.out.println("Dog can eat food");
    }}

class Cat extends Animal{

    public void display(){
        name="buzzy";
        System.out.println("=====>This is Cat Class<========= ");
        System.out.println("I am "+ name);  }
    public void eat(){
        super.eat();

        System.out.println("Cat can eat food");
    }
    public void meow(){
        System.out.println("meow");
    }

}

 class TestDog{
    public static void main(String[] args) {
        dog jack=new dog();
        Cat buzzy=new Cat();
        jack.display();
        jack.eat();
        jack.bark();
        buzzy.meow();
        buzzy.display();
        buzzy.eat();
}

}

