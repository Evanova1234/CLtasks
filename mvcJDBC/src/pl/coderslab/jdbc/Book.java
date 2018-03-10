package pl.coderslab.jdbc;

public class Book {
	
	private String id; 
	private String title; 
	private String author; 
	private String isbn;
	
	public Book(String title, String author, String isbn) { 
		this.author = author; 
		this.title = title; 
		this.isbn = isbn; 
	}
	
	public Book(String id, String title, String author, String isbn) { 
		this.id = id; 
		this.author = author; 
		this.title = title; 
		this.isbn = isbn; 
	}
	
	public String getId() { 
		return id; 
	}
	
	public void setId(String id) { 
		this.id = id;
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	
	
	

}