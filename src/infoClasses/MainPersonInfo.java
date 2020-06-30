
package infoClasses;
public class MainPersonInfo {
    private String fName;
    private String mName;
    private String lName;
    private String email;
    private String phone;
    private String address;
    public MainPersonInfo(){
    
    }
    public MainPersonInfo(String newFName, String newMName, String newLName){
        this.fName = newFName;
        this.mName = newMName;
        this.lName = newLName;
    }
    public MainPersonInfo(String newFName, String newMName, String newLName, String newEmail,
                   String newPhone, String newAddress){
        this.fName = newFName;
        this.mName = newMName;
        this.lName = newLName;
        this.email = newEmail;
        this.phone = newPhone;
        this.address = newAddress;
    }
    public void setFName(String newFName){
        this.fName = newFName;
    }
    public String getFName(){
        return fName;
    }
    
    public void setMName(String newMName){
        this.mName = newMName;
    }
    public String getMName(){
        return mName;
    }
    
    public void setLName(String newLName){
        this.lName = newLName;
    }
    public String getLName(){
        return lName;
    }
    
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    public String getEmail(){
        return email;
    }
    
    public void setPhone(String newPhone){
        this.phone = newPhone;
    }
    public String getPhone(){
        return phone;
    }
    
    public void setAddress(String newAddress){
        this.address = newAddress;
    }
    public String getAddress(){
        return address;
    }
}
