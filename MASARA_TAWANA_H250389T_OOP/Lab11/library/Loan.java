package Lab11.library;

import java.time.LocalDate;

public record Loan(String memberId, String itemId, LocalDate checkoutDate, LocalDate returnDueDate) {
    public String toCsv() {
        return memberId + "," + itemId + "," + checkoutDate + "," + returnDueDate;
    }
}