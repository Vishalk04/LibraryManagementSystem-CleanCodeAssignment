package org.lis;

import java.util.List;
import java.util.Scanner;

import org.lis.books.SearchBooks;
import org.lis.model.Book;
import org.lis.utils.BookCatagoryFactory;

public class LISApp {
	
	 Scanner scan; 
	 
	public static void  run(){
		try{
		new LISApp().start();
		
		}catch(Exception e){
			
			System.out.println("oops! something went Wrong");
		}
	}
	
	public void start(){
		System.out.println("Welcome to LIS app!");
		search();
	}
	
	public void search(){
		//factory
		SearchBooks book = null;
		
		try{
		scan = new Scanner(System.in);
		
		 
		List<Book> result;
		String input;
		Book bk;
		
		 
	
	while(true){
		System.out.println("enter 1 for search by catagory, 2 - title , 3 - Auther, 4 - id");

String option = scan.nextLine();
		
		switch (option) {
		
		case "1":
			System.out.println("Enter Book catagory");
			input = scan.nextLine();
			if(validateInput(input)){
			book = BookCatagoryFactory.getBookCatagory(input);
			result = book.getAllBooks(input);
			displayBooks(result);
			}
			else{
				System.out.println("No value entered");
			}
			//System.out.println("Enter Bood id");
			break;
			
		case "2":
			System.out.println("Enter Book Title ");
			input = scan.nextLine();
			if(validateInput(input)){
			book = BookCatagoryFactory.getBookCatagory(input);
			result = book.SearchBooksByTitle(input);
			displayBooks(result);
			}
			else{
				System.out.println("No value entered");
			}
			break;
			
		case "3":
			System.out.println("Enter Book Auther");
			input = scan.nextLine();
			if(validateInput(input)){
			book = BookCatagoryFactory.getBookCatagory(input);
			result = book.SearchBooksByAuther(input);
			displayBooks(result);
		}
		else{
			System.out.println("No value entered");
		}
			break;
			
		case "4":
			System.out.println("Enter Book id");
			input = scan.nextLine();
			book = BookCatagoryFactory.getBookCatagory(input);
			bk = book.SearchBookById(input);
			System.out.println("Books available are : ");
			System.out.println(bk);
			break;
		
		default:
			System.out.println("Enter valid option");
			
		}
	}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	private boolean validateInput(String input) {
	if(input == null || input.isEmpty() || input.equals(" ") ){
		return false;
	}
		return true;
	}

	public void displayBooks(List<Book> result){
		System.out.println("Books available are : ");
		for (Book book2 : result) {
			System.out.println(book2);
		}
	}

}


