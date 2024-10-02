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
        System.out.println("Active: " + this.active);
        System.out.println("Status: " + this.status);
        System.out.println("Message: " + this.message);
    }

    public static void main(String[] args) {
        Error defaultError = new Error();
        defaultError.printInfo();

        Error error1 = new Error(true, 404, "Not Found");
        error1.printInfo();

        Error error2 = new Error(false, 200, "OK");
        error2.printInfo();
    }
}
