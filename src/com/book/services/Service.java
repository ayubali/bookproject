package com.book.services;

import com.book.enity.Book;
import com.book.util.BookSetting;

/**
 * This class provides conversion services
 * 
 * @author ayub
 *
 */
public abstract class Service {

	/**
	 * This method parse a file data of type JSON or TXT, return a book object
	 * 
	 * @param fileData
	 *            file data
	 * @return an instance of book if successful parse file data, null otherwise
	 */
	public Book doParse(String fileData) {
		Book book = null;
		switch (BookSetting.inputFormat) {
		case JSON:
			book = parseFromJson(fileData);
			break;

		case TXT:
			book = parseFromTxt(fileData);
			break;
		default:
			System.err.println("ERROR: input file not in corrent format");
			break;
		}
		return book;

	}

	/**
	 * This method takes an instance of book object and write into JSON or TXT
	 * format
	 * 
	 * @param book
	 *            an intance of book
	 */
	public void doWrite(Book book) {

		switch (BookSetting.targetFormat) {
		case JSON:
			WriteToJson(book);
			break;

		case TXT:
			WriteToTxt(book);
			break;
		default:
			System.err.println("ERROR: input file not in corrent format");
			break;
		}
	}

	/**
	 * This method parse TXT file data and form book object
	 * 
	 * @param fileData
	 *            file data
	 * @return an instance of book if file data is successfully parsed, null
	 *         otherwise
	 */
	public abstract Book parseFromTxt(String fileData);

	/**
	 * This method parse JSON file data and form book object
	 * 
	 * @param fileData
	 *            file data
	 * @return an instance of book if file data is successfully parsed, null
	 *         otherwise
	 */
	public abstract Book parseFromJson(String fileData);

	/**
	 * This method write the book information into TXT format
	 * 
	 * @param book
	 *            an instance of book
	 */
	public abstract void WriteToTxt(Book book);

	/**
	 * This method write the book information into JSON format
	 * 
	 * @param book
	 *            an instance of book
	 */
	public abstract void WriteToJson(Book book);

}