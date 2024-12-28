package com.jbk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Books {

	@Id
	private int book_id;
	private String title;
	private String author;
	private String genre;
	private int price;

	public Books() {

	}

	public Books(int book_id, String title, String author, String genre, int price) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.price = price;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Books [book_id=" + book_id + ", title=" + title + ", author=" + author + ", genre=" + genre + ", price="
				+ price + "]";
	}

}
