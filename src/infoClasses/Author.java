
package infoClasses;

public class Author extends MainPersonInfo{
    public Author(){
        super();
    }
    public Author(String newFName, String newMName,String newLName){
        super(newFName,newMName,newLName);
    }
    public Author(String newFName, String newMName, String newLName, 
                  String newEmail, String newPhone, String newAddress) {
        super(newFName, newMName, newLName, newEmail, newPhone, newAddress);
    }
}
