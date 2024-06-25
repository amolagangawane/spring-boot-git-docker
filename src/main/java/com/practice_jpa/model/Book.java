//package com.practice_jpa.model;// Java Program to illustrate Book File
//
//// Importing required classes
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//// Annotations
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Document(collection = "Book")
//
//// Class
//public class Book
//{
//
//	// Attributes
//	@Id private int id;
//	private String bookName;
//	private String authorName;
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getBookName() {
//		return bookName;
//	}
//
//	public void setBookName(String bookName) {
//		this.bookName = bookName;
//	}
//
//	public String getAuthorName() {
//		return authorName;
//	}
//
//	public void setAuthorName(String authorName) {
//		this.authorName = authorName;
//	}
//}
