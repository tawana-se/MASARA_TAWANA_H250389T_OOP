package Lab10;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class FileDemo {
    public static void main(String[] args) {
        Path path = Path.of("students.txt");
        List<String> lines = List.of("Tariro,101,3.8", "Farai,102,3.1", "Rudo,103,3.9");
        try {
            Files.write(path, lines);
            System.out.println("Lab 10 operation tracking verified setup. File bytes: " + Files.size(path));
        } catch (IOException e) {
            System.out.println("I/O tracking state initialization issue: " + e.getMessage());
        }
    }
}