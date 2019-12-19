package se.lexicon.anas.booklender;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;

import Services.Book_Dao;
import Services.LibraryUser_Dao;
import Services.Loan_Dao;
import models.Book;
import models.LibraryUser;
import models.Loan;
import repo.Book_Repo;
import repo.LibraryUser_Repo;
import repo.Loan_Repo;

@SpringBootApplication(scanBasePackages = {"boot.registration"} , exclude = JpaRepositoriesAutoConfiguration.class)
public class BooklenderApplication {


	 
	public static void main(String[] args) {
		SpringApplication.run(BooklenderApplication.class, args);
		
	
	}
	
	
	
}


