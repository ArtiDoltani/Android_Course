public class Department {
    private String dep_name;
    private String manager_name;
    private String dept_id;
// public Department(){}
// public Department( String dep_name,String manager_name,String dept_id){
//     this.dep_name = dep_name;
//     this.manager_name = manager_name;
//     this.dept_id = dept_id;

// }






    /**
     * @return String return the dep_name
     */
    public String getDep_name() {
        return dep_name;
    }

    /**
     * @param dep_name the dep_name to set
     */
    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    /**
     * @return String return the manager_name
     */
    public String getManager_name() {
        return manager_name;
    }

    /**
     * @param manager_name the manager_name to set
     */
    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    /**
     * @return String return the dept_id
     */
    public String getDept_id() {
        return dept_id;
    }

    /**
     * @param dept_id the dept_id to set
     */
    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

}
