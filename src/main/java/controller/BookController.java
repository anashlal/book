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

import Services.Book_Dao;
import models.Book;
import models.LibraryUser;

@RestController
@RequestMapping("/myapp/api")
public class BookController {

	private Book_Dao bookservaice;

	@Autowired
	public BookController(Book_Dao bookservaice) {
		super();
		this.bookservaice = bookservaice;
	}

	@GetMapping("/allbook/{id}")
	public ResponseEntity<Book> book_By_Id(@PathVariable int id) {
		try {
			return ResponseEntity.ok(bookservaice.findById_Book(id));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/allbook")
	public ResponseEntity<List<Book>> book_all() {
		List<Book> books = bookservaice.findAll();

		if (books.isEmpty()) {
			return ResponseEntity.noContent().build();
		} else {
			return ResponseEntity.ok(books);
		}
	}

	@PostMapping("/Creatbook")
	public ResponseEntity<Book> create_book(@RequestBody Book newbook) {
		if (newbook == null) {
			return ResponseEntity.badRequest().build();
		}

		Book saved = bookservaice.save_Book(newbook);

		return ResponseEntity.status(HttpStatus.CREATED).body(saved);
	}

	@PutMapping("/updatebook/{id}")
	public ResponseEntity<Book> update_book(@PathVariable int id, @RequestBody Book updated) {
		if (updated == null) {
			return ResponseEntity.badRequest().build();
		}
		try {
			return ResponseEntity.ok(bookservaice.update_Book(id, updated));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/allbook/{title}")
	public ResponseEntity<Book> book_By_title(@PathVariable String title) {
		try {
			return ResponseEntity.ok(bookservaice.findBytitle(title));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/allbook/{available}")
	public ResponseEntity<Book> book_By_available(@PathVariable Boolean available) {
		try {
			return ResponseEntity.ok(bookservaice.findByavailable(available));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/allbook/{reserved}")
	public ResponseEntity<Book> book_By_reserved(@PathVariable Boolean reserved) {
		try {
			return ResponseEntity.ok(bookservaice.findByreserved(reserved));
		} catch (IllegalArgumentException e) {
			return ResponseEntity.notFound().build();
		}
	}

}
