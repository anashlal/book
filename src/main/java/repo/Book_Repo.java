package repo;

import org.springframework.data.repository.CrudRepository;

import models.Book;

public interface Book_Repo extends CrudRepository<Book, Integer>{

}
