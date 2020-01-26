package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Services.LibraryUser_Dao;
import models.LibraryUser;

@RestController
@RequestMapping("/myapp/api")
public class LibraryUserController {

	private LibraryUser_Dao librareuserServices;

	@Autowired
	public LibraryUserController(LibraryUser_Dao librareuserServices) {
		super();
		this.librareuserServices = librareuserServices;

	}

	@GetMapping("/alllibrareuser/{id}")
	public ResponseEntity<LibraryUser> library_By_Id(@PathVariable int id) {
		try {
			return ResponseEntity.ok(librareuserServices.findById_LibraryUser(id));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/alllibrareuser/{email}")
	public ResponseEntity<LibraryUser> library_By_email(@PathVariable String email) {
		try {
			return ResponseEntity.ok(librareuserServices.findBy_Email(email));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/alllibrareuser")
	public ResponseEntity<List<LibraryUser>> library_all() {
		List<LibraryUser> librareusers = librareuserServices.findAll();

		if (librareusers.isEmpty()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok(librareusers);
		}
	}

	@PostMapping("/Creatlibrareuser")
	public ResponseEntity<LibraryUser> create_librareuser(@RequestBody LibraryUser newlibrareuser) {
		if (newlibrareuser == null) {
			return ResponseEntity.badRequest().build();
		}

		LibraryUser saved = librareuserServices.save_LibraryUser(newlibrareuser);

		return ResponseEntity.status(HttpStatus.CREATED).body(saved);
	}

	@PutMapping("/updatealllibrareuser/{id}")
	public ResponseEntity<LibraryUser> update_LibraryUser(@PathVariable int id, @RequestBody LibraryUser updated) {
		if (updated == null) {
			return ResponseEntity.badRequest().build();
		}
		try {
			return ResponseEntity.ok(librareuserServices.update_LibraryUser(id, updated));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}
	}
}
