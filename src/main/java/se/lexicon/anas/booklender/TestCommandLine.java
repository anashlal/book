package se.lexicon.anas.booklender;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import Services.Book_Dao;

import Services.LibraryUser_Dao;
import Services.Loan_Dao;
import models.Book;
import models.LibraryUser;
import models.Loan;
import repo.Book_Repo;
import repo.LibraryUser_Repo;
import repo.Loan_Repo;
import java.math.BigDecimal;
import java.time.LocalDate;


@Component
@Transactional(rollbackFor = Exception.class)
public class TestCommandLine implements CommandLineRunner {

	private Loan_Repo loanrepo;
	private LibraryUser_Repo librarerepo;
	private Book_Repo bookrepo;

	private Loan TestLoan;
	private Book TestBook;
	private LibraryUser TestLibrare;

	private Book_Dao bookservice;
	private LibraryUser_Dao librareservaice;
	private Loan_Dao loanservaice;

	BigDecimal bd1 = new BigDecimal("10.0987654321");

	public TestCommandLine(Loan_Repo loanrepo, LibraryUser_Repo librarerepo, Book_Repo bookrepo) {
		super();
		this.loanrepo = loanrepo;
		this.librarerepo = librarerepo;
		this.bookrepo = bookrepo;
	}

	@Override
	public void run(String... args) throws Exception {
		Book book = new Book("java", 5, bd1, "javacorse");
		Book book1 = new Book("c++", 5, bd1, "c++ corse");
		Book book2 = new Book("ph", 5, bd1, "ph corse");

		LibraryUser librare = new LibraryUser(LocalDate.now(), "java", "anas@gmail.com");

		Loan loan2 = new Loan(librare, book, librare, LocalDate.now(), false);

		TestBook = bookrepo.save(book);
		TestBook = bookrepo.save(book1);
		TestBook = bookrepo.save(book2);
		TestLibrare = librarerepo.save(librare);
		TestLoan = loanrepo.save(loan2);
		
		System.out.println(TestLibrare);
		System.out.println(TestLoan);
		System.out.println(TestBook);

	}

}
