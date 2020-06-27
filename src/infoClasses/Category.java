package infoClasses;
public class Category {
    private String name;
    public Category(){
    
    }
    public Category(String newName){
        this.name = newName;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return name;
    }
}
