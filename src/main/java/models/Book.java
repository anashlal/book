package models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private String title;
	private boolean available;
	private boolean reserved;
	private int maxLoanDays;
	private BigDecimal finePerDay;
	private String description;
	
	
	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public boolean isAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}


	public boolean isReserved() {
		return reserved;
	}


	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}


	public int getMaxLoanDays() {
		return maxLoanDays;
	}


	public void setMaxLoanDays(int maxLoanDays) {
		this.maxLoanDays = maxLoanDays;
	}


	public BigDecimal getFinePerDay() {
		return finePerDay;
	}


	public void setFinePerDay(BigDecimal finePerDay) {
		this.finePerDay = finePerDay;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Book(String title, int maxLoanDays, BigDecimal finePerDay, String description) {
		super();
		this.title = title;
		this.maxLoanDays = maxLoanDays;
		this.finePerDay = finePerDay;
		this.description = description;
	}
	
	public Book(int bookId, String title, boolean available, boolean reserved, int maxLoanDays, BigDecimal finePerDay,String description) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.available = available;
		this.reserved = reserved;
		this.maxLoanDays = maxLoanDays;
		this.finePerDay = finePerDay;
		this.description = description;
	}



	public Book(boolean available, boolean reserved) {
		super();
		this.available = available;
		this.reserved = reserved;
	}

	public Book(int bookId, String title, String description) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.description = description;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [bookId=");
		builder.append(bookId);
		builder.append(", title=");
		builder.append(title);
		builder.append(", available=");
		builder.append(available);
		builder.append(", reserved=");
		builder.append(reserved);
		builder.append(", maxLoanDays=");
		builder.append(maxLoanDays);
		builder.append(", finePerDay=");
		builder.append(finePerDay);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}

	
}
