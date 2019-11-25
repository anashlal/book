package models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodBook extends Book{
	
	public MethodBook(int bookId, String title, boolean available, boolean reserved, int maxLoanDays,
			BigDecimal finePerDay, String description) {
		super(bookId, title, available, reserved, maxLoanDays, finePerDay, description);
		
	}
	public MethodBook( String title, int maxLoanDays,BigDecimal finePerDay, String description) {
		super(title,maxLoanDays, finePerDay, description);
	}
	public MethodBook(boolean available, boolean reserved) {
		super(available , reserved);
	}	

	List<Book> books = new ArrayList<Book>();
	Book book = new Book(getBookId(),getTitle(),getDescription());
	static Scanner in = new Scanner(System.in);

	public Book cretNewBook() {
		
		System.out.println("please enter book title ");
		String booktitle =in.next();
		book.setTitle(booktitle);
		
		System.out.println("please enter book description ");
		String bookdescription =in.next();
		book.setDescription(bookdescription);
		
		System.out.println(book);
		books.add(book);
		return bookSave(book);

	}
	public Book bookSave(Book newbook) {
		if (!books.contains(newbook)) {
			books.add(newbook);
		}
		return newbook;
	}
	public Book findBookId(int id) {
		System.out.println("enter book Id");
		in.next();
		for (Book bok :books) {
			if (bok.getBookId() == id) {
				System.out.println(bok);
				return bok;
			}
		}
		return null;
	}


	public List<Book> findAll() {
		System.out.println(books);
		return books;
	}

	public Book bookDelete(int id) {
		System.out.println("enter book id to delete");
		for (Book bok : books) {
			if (bok.getBookId() == id)
				books.remove(id);
			System.out.println("book deleted");
		}
		return books.remove(id);
	}

}
