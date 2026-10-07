package Lab11.library;

public interface Borrowable {
    void borrow(Member member) throws ItemNotAvailableException, MemberLimitExceededException;
    void giveBack();
}