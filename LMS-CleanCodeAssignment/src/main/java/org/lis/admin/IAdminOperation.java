package org.lis.admin;

import org.lis.model.Book;

interface IAdminOperation {
	
	public Boolean addBook(Book book);
	
	public Boolean removeBook(String bookId);
	

}
