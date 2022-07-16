package books;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the full name of the author from the list: " + "\n" + authorAllBooks().keySet());

        // использую сканер с валидатором от пустого ввода значений и внешних пробелов
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the full name of the author from the list: ");
        String inputAuthor = scanner.nextLine().trim();
        while (inputAuthor.isEmpty()){
            System.out.println("Please enter the full name and surname of the author: ");
            inputAuthor = scanner.nextLine().trim();
        }
        scanner.close();

        // Здесь выводится результат программы (список книг в зависимости от имени автора)
        System.out.println("List of books by the author: " + "\n" + listAuthorBooks(inputAuthor, authorAllBooks()));
    }

    // в этом методе формируется Map (ключ, значение):
    // "ключ" - имя автора , "значение" - его книги
    public static Map<String, Set<String>> authorAllBooks(){
        Map<String, Set<String>> authorAndWorks = new TreeMap<>();
        authorAndWorks.put("Taras Shevchenko", MyLibrary.bookShevchenko());
        authorAndWorks.put("Lesya Ukrainka", MyLibrary.bookUkrainka());
        authorAndWorks.put("Nikolai Nosov", MyLibrary.bookNosov());
        return authorAndWorks;
    }

    // метод возвращает список книг, в зависимости от введенного имени автора
    public static Set<String> listAuthorBooks(String inputAuthor, Map<String, Set<String>> authorAllBooks) {
        return authorAllBooks.get(inputAuthor);
    }
}