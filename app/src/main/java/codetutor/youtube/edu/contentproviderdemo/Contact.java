package codetutor.youtube.edu.contentproviderdemo;

/**
 * Created by zhang on 3/29/2017.
 */

public class Contact {
    private String name;
    private String ID;

    public Contact(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
