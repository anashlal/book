package Services;

import java.util.List;


import models.Loan;

public interface Loan_Dao {
	
	Loan findById_Loan(int id);
	Loan save_Loan(Loan loan);
	boolean remove(int id);
	List<Loan> findAll ();
	Loan update_Loan(int id,Loan update);

}
