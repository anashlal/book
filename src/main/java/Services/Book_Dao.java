package Services;

import java.util.List;

import models.Book;

public interface Book_Dao {
	
	Book findById_Book(int id);
	Book save_Book(Book book);
	boolean remove(int id);
	List<Book> findAll ();
	Book update_Book(int id,Book update);
	
	Book findBytitle(String title);

	Book findByavailable(boolean Isavailable);

	Book findByreserved(boolean Isreserved);
}
