package by.htp.book.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.book.entity.Book;
import by.htp.book.entity.Library;

public class BookLogic {

	public List<Book> author(Library library, String name) {
		List<Book> result = new ArrayList<Book>();

		List<Book> librarys = library.getBooks();

		for (int i = 0; i < librarys.size(); i++) {
			Book b = librarys.get(i);
			String s = b.getAutor();

			if (s.equalsIgnoreCase(name)) {
				result.add(librarys.get(i));
			}
		}
		return result;
	}

	public List<Book> publishingHouse(Library library, String name) {
		List<Book> result = new ArrayList<Book>();

		List<Book> librarys = library.getBooks();

		for (int i = 0; i < librarys.size(); i++) {
			Book b = librarys.get(i);
			String s = b.getPublishingHouse();

			if (s.equalsIgnoreCase(name)) {
				result.add(librarys.get(i));
			}
		}
		return result;
	}

	public List<String> publishingYear(Library library, int year) {
		List<String> result = new ArrayList<String>();

		List<Book> librarys = library.getBooks();

		for (int i = 0; i < librarys.size(); i++) {
			Book b = librarys.get(i);
			int s = b.getYearPublish();

			if (s > year) {
				result.add(b.getYearPublish() + " " + b.getAutor());
			}
		}
		return result;
	}

}
