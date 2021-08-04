package quotes;

public class Quotes {
    //Declare variables
    private String author;
    private String text;

    //Constructor
    public Quotes(String author, String text){
        this.author = author;
        this.text = text;
    }
    public Quotes(){}

    //Getter:
    public String getAuther() {
        return author;
    }
    public String getText() {
        return text;
    }

    //Setter:
    public void setAuther(String auther) {
        this.author = auther;
    }

    public void setText(String text) {
        this.text = text;
    }

    //toString

    @Override
    public String toString() {
        return "Quotes{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
