import java.util.Scanner;
public class ATM_card {

    public static void main(String[] arg) 
    {
        Scanner input= new Scanner(System.in);
        //========> Creating Ojects of user class
        
        User Arti=new User("Arti",22,"65387","Hyderabad");
        User kainat=new User("fatima",24,"653809","karachi");
        User naila=new User("lX",19,"65387","lahore");
        User john=new User("john",20,"65382","Hyderabad");
        User nick=new User("PK",15,"653007","islamabad");
        
        //                    ========> Creating Ojects of user class
        ATM Atm1 =new ATM(Arti,100000,1234,9990);
        ATM Atm2 =new ATM(kainat,200000,1634,33330);
        ATM Atm3 =new ATM(naila,120000,1254,66678);
        ATM Atm4 =new ATM(john,170000,2234,9000008);
        ATM Atm5 =new ATM(nick,100009,1284,999999);
        
        
        
        System.out.println("Enter number between 1 and 5");
        int userinput = input.nextInt();
        
        switch(userinput){
            case 1:
            details(Atm1);
            break;
            case 2:
details(Atm2);
break;
    case 3:
    details(Atm3);
    break;
    case 4:
    details(Atm4);
    break;
    case 5:
    details(Atm5);
    break;
    default:
    System.out.println("Invalid input \n enter between 1 and 5 ");
}}
public  static void details(ATM atm){
    System.out.println("User Name: "+atm.getUser().getUserName());
    System.out.println("User Address: "+atm.getUser().getAddress());
    System.out.println("User Age: "+atm.getUser().getAge());
    System.out.println("User Account number: "+atm.getAccountNumber());
    System.out.println("Amount: "+atm.getAmount());



}        // myAtm.SetUserName("Arti");
        // myAtm.SetAmount(100000);
    }
    

