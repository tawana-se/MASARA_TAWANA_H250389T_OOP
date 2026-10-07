package Lab11;

import Lab11.library.*;

public class sod {
    public static void main(String[] args) {
        System.out.println("Initializing Lab 11 Architecture System Framework...");
        Library lib = new Library();
        try {
            lib.addItem(new Book("B1", "Object-Oriented Design in Java"));
            lib.addItem(new Dvd("D1", "Effective OOP Lectures"));
            lib.registerMember(new Member("M1", "Masara Tawana"));
            
            System.out.println("Catalog assets configuration matching complete. Searching for objects:");
            lib.searchByTitle("Java").forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("System orchestration initialization fault: " + e.getMessage());
        }
    }
}