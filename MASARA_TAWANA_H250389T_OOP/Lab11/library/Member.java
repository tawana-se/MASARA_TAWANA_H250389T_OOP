package Lab11.library;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private final String id;
    private final String name;
    private final List<String> currentLoanItemIds = new ArrayList<>();

    public Member(String id, String name) {
        if(id == null || id.isBlank() || name == null || name.isBlank()) {
            throw new IllegalArgumentException("Identification tracking elements are mandatory.");
        }
        this.id = id.trim();
        this.name = name.trim();
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public List<String> getCurrentLoanItemIds() { return currentLoanItemIds; }

    public void trackLoan(String itemId) { currentLoanItemIds.add(itemId); }
    public void untrackLoan(String itemId) { currentLoanItemIds.remove(itemId); }

    public String toCsv() {
        return id + ";" + name + ";" + String.join(",", currentLoanItemIds);
    }

    @Override
    public String toString() {
        return "Member [" + id + "] " + name + " | Loans: " + currentLoanItemIds.size();
    }
}