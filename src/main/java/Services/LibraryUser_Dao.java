package Services;


import java.util.List;

import models.LibraryUser;

public interface LibraryUser_Dao {

	LibraryUser findById_LibraryUser(int id);

	LibraryUser save_LibraryUser(LibraryUser libraryUser);

	boolean remove(int id);

	List<LibraryUser> findAll();

	LibraryUser update_LibraryUser(int id, LibraryUser update);

	LibraryUser findBy_Email(String email);

}
