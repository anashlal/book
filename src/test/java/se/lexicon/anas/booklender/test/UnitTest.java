/*
 * package se.lexicon.anas.booklender.test;
 * 
 * import static org.junit.jupiter.api.Assertions.*;
 * 
 * import java.time.LocalDate;
 * 
 * import org.junit.jupiter.api.Test;
 * 
 * import models.Book; import models.LibraryUser; import models.Loan;
 * 
 * class UnitTest {
 * 
 * @Test public void isOverDueShouldBeTrue() { Book book = new Book(true,
 * false); LibraryUser libraryUser = new LibraryUser(LocalDate.now(), "fd",
 * "fdsr"); Loan loan = new Loan(libraryUser, book, libraryUser,
 * LocalDate.now().plusDays(-1), false);
 * 
 * assertTrue(loan.isOverdue()); }
 * 
 * @Test public void isOverDueShouldBeFalse() { Book book = new Book(true,
 * false); LibraryUser libraryUser = new LibraryUser(LocalDate.now(), "fd",
 * "fdsr"); Loan loan = new Loan(libraryUser, book, libraryUser,
 * LocalDate.now().plusDays(1), false);
 * 
 * assertFalse(loan.isOverdue()); } }
 */