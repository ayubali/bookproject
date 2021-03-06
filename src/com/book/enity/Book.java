package com.book.enity;

import java.util.List;

/**
 * This class represents book info
 * 
 * @author ayub
 *
 */
public class Book {
	private String name;
	private List<Author> authors;
	private String published­Date;
	private String isbn;

	public Book() {
	}

	public Book(String name, String isbn, List<Author> authors,
			String published­Date) {
		this.name = name;
		this.isbn = isbn;
		this.authors = authors;
		this.published­Date = published­Date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public String getPublished­Date() {
		return published­Date;
	}

	public void setPublished­Date(String published­Date) {
		this.published­Date = published­Date;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", authors=" + authors
				+ ", published­Date=" + published­Date + ", isbn=" + isbn + "]";
	}

}
