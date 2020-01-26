package repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Book;

@Repository
public interface Book_Repo extends CrudRepository<Book, Integer> {

	Book findBytitle(String title);

	Book findByavailable(boolean Isavailable);

	Book findByreserved(boolean Isreserved);

}
