package Services;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

import models.Book;
import models.LibraryUser;
import models.Loan;
import repo.Loan_Repo;

public class Loan_impl implements Loan_Dao {

	private Loan_Repo loan_repo;

	@Autowired
	public Loan_impl(Loan_Repo loan_repo) {
		super();
		this.loan_repo = loan_repo;
	}

	@Override
	public Loan findById_Loan(int id) {
		return loan_repo.findById(id).orElseThrow(IllegalArgumentException::new);
	}

	@Override
	public Loan save_Loan(Loan loan) {
		return loan_repo.save(loan);
	}

	@Override
	public boolean remove(int id) {
		loan_repo.deleteById(id);

		return loan_repo.existsById(id);
	}

	@Override
	public List<Loan> findAll() {
		return (List<Loan>) loan_repo.findAll();
	}

	@Override
	public Loan update_Loan(int id, Loan update) {

		Loan orginal = findById_Loan(id);
		orginal.setLoanTaker(update.getLoanTaker());
		orginal.setBook(update.getBook());
		orginal.setLoanDate(update.getLoanDate());
		orginal.setTerminated(update.isTerminated());
		return loan_repo.save(orginal);
	}

}
