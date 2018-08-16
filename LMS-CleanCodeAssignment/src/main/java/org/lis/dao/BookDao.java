package org.lis.dao;

import java.util.List;

import org.lis.model.Book;

public interface BookDao {
	

	public List<Book> SearchBooksByTitle(String title);
	
	public List<Book> SearchBooksByAuther(String auther);
	
	public List<Book> SearchBooksByCatagory(String catagory);

	public Book searchBookById(String bookId);

	public List<Book> getAllBooks(String catagory);

}
