public class TestCar {

   public static void main(String[] args) {
        
        car mehran =new car("Red",5,"Md16");
      car vigo=new car("White",7,"Vigo");
  //    System.out.println("Mehran Color : "+ mehran.color);
    //   mehran.drive("Vigo")
     
    printObject(mehran);
    printObject(vigo);
   }
    
    public static void printObject(car Car){

      System.out.println("Color : "+ Car.color);
      System.out.println("Model : "+ Car.Model);
      System.out.println("No Of Seats : "+ Car.NoOfSeats);
    }
    }