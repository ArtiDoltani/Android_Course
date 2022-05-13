public class User {
   private String userName;
   private   int age;
   private  String cnic;
   private  String address;
  public User(){}
  public User(String userName,  int age, String cnic,String address){

    this.userName=userName;
    this.address=address;
    this.age=age;
    this.cnic=cnic;  }

    public String getUserName(){
        return this.userName;
    }
    public void SetUserName(String userName) {
        this.userName=userName;
    }
    public String getAddress(){
        return  this.address;
    
    }
    public void setAddress(String address){
         this.address=address;
    
    }
    
    public void SetCnic(String cnic ){
     
        this.cnic=cnic;
    
    }
    public String getCnic( ){
     
      return cnic;
    
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
       this.age= age;
    }

}
