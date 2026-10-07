package Lab11.library;

public abstract class LibraryItem implements Borrowable {
    private final String id;
    private final String title;
    private boolean available = true;

    protected LibraryItem(String id, String title) {
        if(id == null || id.isBlank() || title == null || title.isBlank()) {
            throw new IllegalArgumentException("Item identity indexes are mandatory.");
        }
        this.id = id.trim();
        this.title = title.trim();
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean status) { this.available = status; }

    public abstract int loanPeriodDays();
    public abstract String getItemType();

    @Override
    public void borrow(Member member) throws ItemNotAvailableException, MemberLimitExceededException {
        if (!available) throw new ItemNotAvailableException("Item is currently checked out.");
        if (member.getCurrentLoanItemIds().size() >= 3) throw new MemberLimitExceededException("Limit of 3 books hit.");
        available = false;
        member.trackLoan(this.id);
    }

    @Override
    public void giveBack() {
        available = true;
    }

    public String toCsv() {
        return getItemType() + "," + id + "," + title + "," + available;
    }

    @Override
    public String toString() {
        return "[" + getItemType() + "] ID: " + id + " | " + title + " | Available: " + available;
    }
}