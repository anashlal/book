package Services;

import java.util.List;

import models.Book;
import models.LibraryUser;
import models.Loan;

public interface Loan_Dao {

	Loan findById_Loan(int id);

	Loan save_Loan(Loan loan);

	boolean remove(int id);

	List<Loan> findAll();

	Loan update_Loan(int id, Loan update);

	Loan findByLibraryUser(LibraryUser user);

	Loan findByBook(Book book);

	Loan findByterminated(Boolean Isterminated);

}
