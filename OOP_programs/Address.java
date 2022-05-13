public class Address {
    private String city_name;
    private String city_state;
public Address(){}
// public Address(String city_name,String city_state){
//     this.city_name=city_name;
//     this.city_state=city_state;
// }






    /**
     * @return String return the city_name
     */
    public String getCity_name() {
        return city_name;
    }

    /**
     * @param city_name the city_name to set
     */
    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    /**
     * @return String return the city_state
     */
    public String getCity_state() {
        return city_state;
    }

    /**
     * @param city_state the city_state to set
     */
    public void setCity_state(String city_state) {
        this.city_state = city_state;
    }
    

}
