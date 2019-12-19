package repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Book;
import models.LibraryUser;
import models.Loan;

@Repository
public interface Loan_Repo extends CrudRepository<Loan, Integer> {

	Loan findByLibraryUser(LibraryUser user);

	Loan findByBook(Book book);

	Loan findByterminated(Boolean Isterminated);

}
