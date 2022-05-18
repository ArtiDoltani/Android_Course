public class ATM {

//private String UserName;
private User  user;
private double Amount ;
private int pin;
private int accountNumber;

public ATM(){}

public ATM( User user, double Amount,int pin,int accountNumber){
this.Amount=Amount;

//this.UserName=UserName;

//Modify
this.user=user; //here we are using user class 
this.pin=pin;
this.accountNumber=accountNumber;
}
public int getAccountNumber(){
    return accountNumber;
}
public void SetUser(User user) {
   this.user=user;
}
public User getUser(){
   // return  this.UserName;
   return user ;

}

public void SetAmount(double Amount){
 
    this.Amount=Amount;

}
public double getAmount() {
    return this.Amount;
}
public int getpin(){
    return this.pin; 
}}




    

