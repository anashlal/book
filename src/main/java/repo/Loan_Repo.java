package repo;

import org.springframework.data.repository.CrudRepository;

import models.Book;
import models.LibraryUser;
import models.Loan;

public interface Loan_Repo extends CrudRepository<Loan, Integer> {

	Loan findByLibraryUser(LibraryUser user);

	Loan findByBook(Book book);

	Loan findByterminated(Boolean Isterminated);

}
