package repo;

import org.springframework.data.repository.CrudRepository;

import models.LibraryUser;

public interface LibraryUser_Repo extends CrudRepository<LibraryUser, Integer> {

}
