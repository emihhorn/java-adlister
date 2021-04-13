public class BeanTest {

        //    TODO: create beans for the quotes and authors tables (Quote and Author).
//     Instead of including a foreign key property in the Quote class, include
//     an Author property.
//    CREATE TABLE quotes (
//            id INT UNSIGNED NOT NULL AUTO_INCREMENT,
//            content TEXT NOT NULL,
//            author_id INT UNSIGNED NOT NULL,
//            PRIMARY KEY (id),
//    FOREIGN KEY (author_id) REFERENCES authors (id)
//            );
        private int id;
        private String content;
        private String author_id;
        private String Quote;
        private String Author;
        public BeanTest(int id, String content, String author_id, String quote, String author) {
            this.id = id;
            this.content = content;
            this.author_id = author_id;
            Quote = quote;
            Author = author;
        }
        public int getId() {
            return id;
        }
        public String getContent() {
            return content;
        }
        public String getAuthor_id() {
            return author_id;
        }
        public String getQuote() {
            return Quote;
        }
        public String getAuthor() {
            return Author;
        }
        public void setId(int id) {
            this.id = id;
        }
        public void setContent(String content) {
            this.content = content;
        }
        public void setAuthor_id(String author_id) {
            this.author_id = author_id;
        }
        public void setQuote(String quote) {
            Quote = quote;
        }
        public void setAuthor(String author) {
            Author = author;
        }
    }

