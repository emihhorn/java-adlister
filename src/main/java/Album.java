import java.io.Serializable;

public class Album {
    private int id;
    private String author_first_name;
    private String author_last_name;
    private String content;

    public Album(int id, String author_first_name, String author_last_name, String content) {
        this.id = id;
        this.author_first_name = author_first_name;
        this.author_last_name = author_last_name;
        this.content = content;
    }
    public int getId() {
        return id;
    }

    public String getAuthor_first_name() {
        return author_first_name;
    }

    public String getAuthor_last_name() {
        return author_last_name;
    }

    public String getContent() {
        return content;
    }

//    public String setId(int id) {
//        this.id = id;
//    }

    public void setAuthor_first_name(String author_first_name) {
        this.author_first_name = author_first_name;
    }

    public void setAuthor_last_name(String author_last_name) {
        this.author_last_name = author_last_name;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
