import MyClasses.Author;
import MyClasses.Book;

public class Oppproject {
    public static void main(String[] args) {

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

//        Author author1 = new Author();
//        Author author2 = new Author();
//        Author author3 = new Author();
//        Author author4 = new Author();
//
//        author4.setFirstname("Роман");
//        author4.setLastname("Ломоноссов");
//
//        author3.setFirstname("Евгений");
//        author3.setLastname("Петров");
//
//        author2.setFirstname("Илья");
//        author2.setLastname("Илф");
//
//        author1.setFirstname("Aleksandr");
//        author1.setLastname("Pushkin");
//
//        Book book = new Book();
//        Book book1 = new Book();
//        Book book2 = new Book();
//
//        book2.setCaption("Роман");
//        book1.setCaption("Золотой цыпленок");
//        book.setCaption("Evgenij Onegin");
//
//        Author[] authors = new Author[1];
//        authors[0] = author1;
//
//        Author[] authors1 = new Author[2];
//        authors1[1] = author2;
//        authors1[0] = author3;
//
//        book.setAuthors(authors);
//        book1.setAuthors(authors1);
//        book2.AddAuthor(author4);
//
//        System.out.println(book.toString());
//        System.out.println(book1.toString());
//        System.out.println(book2.toString());

    }
    private static Book createBook(String caption){
        Book book = new Book();
        book.setCaption(caption);
        return book;
    }
    private static Author createAuthor(String firstname, String lastname){
        Author author = new Author();
        author.setFirstname(firstname);
        author.setLastname(lastname);
        return author;
    }
}
