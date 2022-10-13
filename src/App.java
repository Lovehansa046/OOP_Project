import MyClasses.Author;
import MyClasses.Book;

public class App {

    public void run() {
        Book book = createBook("Евгений Онегин");
        book.AddAuthor(createAuthor("Александр", "Пушкик"));

        System.out.println(book);

        Book book1 = createBook("Роман");
        book1.AddAuthor(createAuthor("Роман", "Ломоноссов"));

        System.out.println(book1);

        Book book2 = createBook("Золотой цыпленок");
        book2.AddAuthor(createAuthor("Евгений", "Петров"));
        book2.AddAuthor(createAuthor("Илья", "Илф"));

        System.out.println(book2);
    }

    private static Book createBook(String caption) {
        Book book = new Book();
        book.setCaption(caption);
        return book;
    }

    private static Author createAuthor(String firstname, String lastname) {
        Author author = new Author();
        author.setFirstname(firstname);
        author.setLastname(lastname);
        return author;
    }
}

