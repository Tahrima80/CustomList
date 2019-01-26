package com.naztech;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomListTest {

	@Test
	public void listTest() {
		
		CustomList<Books> bookList = new CustomList<Books>();
		
		bookList.add(new Books("November 9", "Colleen Hoover", 1234567890 ,"10-11-2015", 500));
		bookList.add(new Books("Fahrenheit 451", "Ray Bradbury", 1234567890 ,"19-10-1953", 600));
		
		assertTrue(bookList.get(0).getAuthorName().equals("Colleen Hoover"));
		assertTrue(bookList.get(0).getBookName().equals("November 9"));
		
		CustomList<Books> bookList1 = new CustomList<Books>();
		bookList1.add(new Books("Book Lust", "Nancy Pearl", 1234567890 ,"19-10-2003", 400));
		bookList1.add(new Books("Pollomuhku ja Posityyhtynen", "Jaana Kapari-Jatta", 1234567890 ,"19-10-2008", 300));
		bookList.addAll(bookList1);
		
		assertEquals(400, bookList.get(2).getPrice());
		
		bookList.remove(1);
		assertEquals(400, bookList.get(1).getPrice());
		
		bookList.removeAll(bookList1);
        assertTrue(1==bookList.size());
        
        bookList.clear();
        assertTrue(0==bookList.size());
	}

}
