package Lab11.library;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Library {
    private final Map<String, LibraryItem> items = new HashMap<>();
    private final Map<String, Member> members = new HashMap<>();
    private final List<Loan> loans = new ArrayList<>();

    public void addItem(LibraryItem item) { items.put(item.getId(), item); }
    public void registerMember(Member member) { members.put(member.getId(), member); }

    public List<LibraryItem> searchByTitle(String keyword) {
        return items.values().stream()
            .filter(i -> i.getTitle().toLowerCase().contains(keyword.toLowerCase()))
            .sorted(Comparator.comparing(LibraryItem::getTitle))
            .toList();
    }
}