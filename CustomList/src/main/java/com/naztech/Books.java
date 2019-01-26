package com.naztech;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data

@AllArgsConstructor
@NoArgsConstructor
@Getter 
@EqualsAndHashCode

public class Books {
	
	@NonNull
	String bookName;
	@NonNull
	String authorName;
	@NonNull
	int isbnNo;
	@NonNull
	String publishDate;
	@NonNull
	int price;
	
	public Books(String bookName, String authorName, int isbnNo, String publishDate, int price) {
		// TODO Auto-generated constructor stub
		
		this.bookName = bookName;
        this.authorName = authorName;
        this.isbnNo = isbnNo;
        this.publishDate = publishDate;
        this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getIsbnNo() {
		return isbnNo;
	}

	public void setIsbnNo(int isbnNo) {
		this.isbnNo = isbnNo;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
