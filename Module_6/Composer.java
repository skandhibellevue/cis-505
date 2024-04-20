/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by Swetha Kandhi 2024
*/

public class Composer {

    private int id = 0;
    private String name = "";
    private String genre = "";

    public Composer() {
        this.id = 0;
        this.name = "";
        this.genre = "";
    }

    public Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    // end Accessor methods

    // toString method
    public String toString() {
        return "Id: " + getId() + "\nName: " + getName() + "\nGenre: " + getGenre();
    } // end toString
}
