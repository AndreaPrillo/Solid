package i.before;

import java.time.LocalDateTime;
import java.util.List;

public class DVD extends LibraryItemAfter {

    List<String> actors;
    int runtimeInMinutes;

    @Override
    public String getAuthor() {
        return "";
    }

    @Override
    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    @Override
    public String getBorrower() {
        return borrower;
    }

    @Override
    public int getCheckOutDurationInDays() {
        return 14;
    }

    @Override
    public String getLibraryId() {
        return libraryId;
    }

    @Override
    public int getPages() {
        return -1;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void checkIn() {
        borrower = "";
    }

    @Override
    public void checkOut(String borrower) {
        this.borrower = borrower;
        borrowDate = LocalDateTime.now();
    }

    @Override
    public LocalDateTime getDueDate() {
        return borrowDate.plusDays(checkOutDurationInDays);
    }

    public List<String> getActors() {
        return actors;
    }

    public int getRuntimeInMinutes() {
        return runtimeInMinutes;
    }
}
