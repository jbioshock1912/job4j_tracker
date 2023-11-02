package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активность ошибки " + active);
        System.out.println("Номер статуса " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error errorEmpty = new Error();
        errorEmpty.printInfo();
        Error graphicError = new Error(true, 2, "Графическая ошибка");
        graphicError.printInfo();
        Error publicationError = new Error(false, 0, "Ошибка публикации");
        publicationError.printInfo();
    }
}
