package com.book.writer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONValue;

import com.book.enity.Author;
import com.book.enity.Book;

/**
 * This class provides the support of writing book info to JSON
 * 
 * @author ayub
 *
 */
public class JsonWriter implements Writer<Book> {

	/*
	 * This method write book information into JSON format
	 * 
	 * @param book an instance of Book
	 */
	@Override
	public void write(Book book) {
		Map<String, Object> obj = new LinkedHashMap<String, Object>();
		obj.put("name", book.getName().toUpperCase());
		obj.put("isbn", book.getIsbn());
		List<String> authorsstr = new ArrayList<String>();
		for (Author author : book.getAuthors()) {
			authorsstr.add(author.getName());
		}
		obj.put("authors", authorsstr);
		obj.put("published-­date", book.getPublished­Date());
		Map<String, Object> root = new LinkedHashMap<String, Object>();
		root.put("book", obj);
		String jsonText = JSONValue.toJSONString(root);
		System.out.println(jsonText);
	}

}
