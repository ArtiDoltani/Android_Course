public class MobileTest {

  public static void main(String[] arg){
    Mobile Samsung= new Mobile("Black",30000,"Samsung","Rectangle","8GB");

    Mobile iphone= new Mobile("Grey",90000,"ipphone","Rectangle","16GB");
printObject(Samsung);
System.out.println("====================== ");
printObject(iphone); 
}
 public static void printObject(Mobile mobile){
   System.out.println("Model : "+ mobile.Model);
   System.out.println("Color : "+ mobile.color);
    System.out.println("Price Of Mobie : "+ mobile.price);
    System.out.println("Shape of Mobile : "+ mobile.shape);
    System.out.println("Storage_capacity : "+ mobile.Storage_capacity);
 }
}
