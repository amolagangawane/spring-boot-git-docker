//package com.practice_jpa.controller;
//
//import com.practice_jpa.model.Book;
//import com.practice_jpa.repo.BookRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//// Annotation
//@RestController
//
//// Class
//public class BookController {
//
//	@Autowired
//	private BookRepo repo;
//
//	@PostMapping("/addBook")
//	public String saveBook(@RequestBody Book book){
//		repo.save(book);
//
//		return "Added Successfully";
//	}
//
//	@GetMapping("/findAllBooks")
//	public List<Book> getBooks() {
//
//		return repo.findAll();
//	}
//
//	@DeleteMapping("/delete/{id}")
//	public String deleteBook(@PathVariable int id){
//		repo.deleteById(id);
//
//		return "Deleted Successfully";
//	}
//
//	@PutMapping("/updateBook")
//	public String updateBook(@RequestBody Book modifiedBook){
//		Optional<Book> byId = repo.findById(modifiedBook.getId());
//		if(byId.isPresent()){
//			Book book = byId.get();
//			book.setBookName(modifiedBook.getBookName());
//			book.setAuthorName(modifiedBook.getAuthorName());
//			repo.save(book);
//			return "successfully updated the document";
//		}
//		return "failed to update";
//	}
//}
