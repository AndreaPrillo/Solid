package i.before;

import java.time.LocalDateTime;

public abstract class LibraryItemAfter {

    String author;
    LocalDateTime borrowDate;
    String borrower;
    int checkOutDurationInDays;
    String libraryId;
    String title;
    int pages;


    abstract String getAuthor();

    abstract LocalDateTime getBorrowDate();

    abstract String getBorrower();

    abstract int getCheckOutDurationInDays();

    abstract String getLibraryId();

   abstract  int getPages();

    abstract String getTitle();

    abstract void checkIn();

    abstract void checkOut(String borrower);

    abstract LocalDateTime getDueDate();

}
