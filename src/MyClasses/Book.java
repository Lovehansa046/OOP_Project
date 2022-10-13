package MyClasses;

import java.util.Arrays;

public class Book {
    private Author[] authors;
    private String caption;

    public Book(){
        authors = new Author[0];
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public void AddAuthor(Author author) {
        Author[] newAuthors = Arrays.copyOf(authors, authors.length+1); //Скопировать autrhors в newAuthors, где на одну ячейку больше
        newAuthors[newAuthors.length-1] = author; //Добавить в эту ячейку author из параметра метода
        authors = newAuthors; //Скопировать ссылку newAuthors в authors
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authors=" + Arrays.toString(authors) +
                ", caption='" + caption + '\'' +
                '}';
    }
}
