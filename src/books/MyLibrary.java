package books;

import java.util.Set;
import java.util.TreeSet;

public class MyLibrary {

    // здесь создаю несколько коллекций с уникальными названиями книг, используя Set и
    // реализую отображение этих книг по алфавиту (TreeSet).
    static Set<String> bookShevchenko() {
        Set<String> bookShevchenko = new TreeSet<>();
        bookShevchenko.add("Завещание");
        bookShevchenko.add("Кобзарь");
        bookShevchenko.add("Сон");
        return bookShevchenko;
    }

    static Set<String> bookUkrainka() {
        Set<String> bookUkrainka = new TreeSet<>();
        bookUkrainka.add("Forest song");
        bookUkrainka.add("Noblewoman");
        bookUkrainka.add("Contra spem spero");
        return bookUkrainka;
    }

    static Set<String> bookNosov() {
        Set<String> bookNosov = new TreeSet<>();
        bookNosov.add("Dreamers");
        bookNosov.add("Dunno on the Moon");
        bookNosov.add("Mishka's cat");
        return bookNosov;
    }
}
