package infoClasses;

import java.sql.Date;

public class Books {

    private String title;
    private int copyRightYear;
    private String publishCountry;
    private int qnty;
    private int cost;
    private Date publishDate;
    public Books(){}
    public Books(String newTitle, int newCopyRightYear,
            String newPublishCountry, int newQnty, int newCost, Date newPublishDate) {
        this.title = newTitle;
        this.copyRightYear = newCopyRightYear;
        this.publishCountry = newPublishCountry;
        this.qnty = newQnty;
        this.cost = newCost;
        this.publishDate = newPublishDate;
    }
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setCopyRightYear(int newCopyRightYear) {
        this.copyRightYear = newCopyRightYear;
    }

    public int getCopyRightYear() {
        return copyRightYear;
    }

    public void setPublishCountry(String newPublishCountry) {
        this.publishCountry = newPublishCountry;
    }

    public String getPublishCountry() {
        return publishCountry;
    }

    public void setQnty(int newQnty) {
        this.qnty = newQnty;
    }

    public int getQnty() {
        return qnty;
    }

    public void setCost(int newCost) {
        this.cost = newCost;
    }

    public int getCost() {
        return cost;
    }

    public void setDate(Date newPublishDate) {
        this.publishDate = newPublishDate;
    }

    public Date getDate() {
        return publishDate;
    }
}
