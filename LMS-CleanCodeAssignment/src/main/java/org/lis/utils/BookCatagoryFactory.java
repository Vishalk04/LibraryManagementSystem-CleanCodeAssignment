package org.lis.utils;

import org.lis.books.SearchActionBooks;
import org.lis.books.SearchBooks;
import org.lis.books.SearchFictionBooks;

//factory for SearchResults


public class BookCatagoryFactory {

	public static SearchBooks getBookCatagory(String catagory) throws Exception{
		
		if(catagory.equalsIgnoreCase("Action")){
			return new SearchActionBooks();
		}else if(catagory.equalsIgnoreCase("Fiction")){
			return new SearchFictionBooks();
		}else{
			return new SearchFictionBooks();
		}
		
	}
}
