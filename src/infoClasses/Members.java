package infoClasses;

public class Members extends MainPersonInfo {

    private int numBookBorrowed;
    private int numBookBought;
    private int fine;
    public Members(){
        super();
    }
    public Members(String newFName, String newMName, String newLName,
            String newEmail, String newPhone, String newAddress) {
        super(newFName, newMName, newLName, newEmail, newPhone, newAddress);
    }

    public Members(String newFName, String newMName, String newLName,
            String newEmail, String newPhone, String newAddress,
            int newNumBookBorrowed, int newNumBookBought,int newFine) {
        super(newFName, newMName, newLName, newEmail, newPhone, newAddress);
        this.numBookBorrowed = newNumBookBorrowed;
        this.numBookBought = newNumBookBought;
        this.fine = newFine;
    }

    public void setBookBorrowed(int newNumBookBorrowed) {
        this.numBookBorrowed = newNumBookBorrowed;
    }

    public int getBookBorrowed() {
        return numBookBorrowed;
    }

    public void setBookBought(int newNumBookBought) {
        this.numBookBought = newNumBookBought;
    }

    public int getBookBought() {
        return numBookBought;
    }
    
     public void setFine(int newFine) {
        this.fine = newFine;
    }

    public int getFine() {
        return fine;
    }
}
