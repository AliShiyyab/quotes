package quotes;

public class Quotes {
    //Declare variables
    private String author;
    private String text;
    private String content;
    private String authorSlug;

    //Constructor
    public Quotes(String author, String text){
        this.author = author;
        this.text = text;
    }
    public Quotes(){}

    public Quotes(String author, String content, String authorSlug){
        this.author=author;
        this.content=content;
        this.authorSlug=authorSlug;
    }

    @Override
    public String toString() {
        if (text==null)
            return "Quotes{" +
                    "author='" + author + '\'' +
                    ", text='" + content + '\'';
        else
            return "Quotes{" +
                    "author='" + author + '\'' +
                    ", text='" + text + '\'';
    }

    //Getter:
    public String getAuthor() {
        return author;
    }
    public String getText() {
        return text;
    }

    //Setter:
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthorSlug() {
        return authorSlug;
    }

    public void setAuthorSlug(String authorSlug) {
        this.authorSlug = authorSlug;
    }
}