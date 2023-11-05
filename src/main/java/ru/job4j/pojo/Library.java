package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book ball = new Book("Ball", 10);
        Book wizard = new Book("Wizard", 25);
        Book foxAndWolf = new Book("Fox and wolf", 133);
        Book cleanCode = new Book("Clean code", 100);
        Book[] bookForChild = new Book[4];
        bookForChild[0] = ball;
        bookForChild[1] = wizard;
        bookForChild[2] = foxAndWolf;
        bookForChild[3] = cleanCode;
        for (int index = 0; index < bookForChild.length; index++) {
            Book book = bookForChild[index];
            System.out.println(book.getName() + " - " + book.getPage());
        }

        Book tempBook = bookForChild[0];
        bookForChild[0] = bookForChild[3];
        bookForChild[3] = tempBook;

        System.out.println("перестановка книг местами");
        for (int index = 0; index < bookForChild.length; index++) {
            Book book = bookForChild[index];
            System.out.println(book.getName() + " - " + book.getPage());
        }

        System.out.println("вывод книги с именем Clean code");
        for (int index = 0; index < bookForChild.length; index++) {
            Book book = bookForChild[index];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getPage());
            }
        }
    }
}
