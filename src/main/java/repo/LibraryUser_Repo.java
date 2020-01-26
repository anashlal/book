package repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.LibraryUser;

@Repository
public interface LibraryUser_Repo extends CrudRepository<LibraryUser, Integer> {

	LibraryUser findByEmail(String email);

}
