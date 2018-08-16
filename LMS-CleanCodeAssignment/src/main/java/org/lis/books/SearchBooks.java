package org.lis.books;

import java.util.List;

import org.lis.dao.BookDao;
import org.lis.dao.BookDaoImpl;
import org.lis.model.Book;

public abstract class SearchBooks {
	
	BookDao dao = new BookDaoImpl();
	

	public List<Book> SearchBooksByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.SearchBooksByTitle(title);
	}

	
	public List<Book> SearchBooksByAuther(String auther) {
		// TODO Auto-generated method stub
		return dao.SearchBooksByAuther(auther);
	}

	/*@Override
	public List<Book> SearchByCatagory(String catagory) {
		// TODO Auto-generated method stub
		return dao.SearchByCatagory(catagory);
	}*/

	
	public Book SearchBookById(String bookId) {
		// TODO Auto-generated method stub
		return dao.searchBookById(bookId);
	}

	public abstract List<Book> getAllBooks(String catagory);
	
}
