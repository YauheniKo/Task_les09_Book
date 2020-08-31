package by.htp.book.print;

import java.util.ArrayList;
import java.util.List;

import by.htp.book.entity.Book;
import by.htp.book.entity.Library;

public class PrintResultSearch {

	public void printAuthor(Library library, String name) {
		List<String> result = new ArrayList<String>();

		List<Book> librarys = library.getBooks();

		for (int i = 0; i < librarys.size(); i++) {
			Book b = librarys.get(i);
			String s = b.getAutor();

			if (s.equalsIgnoreCase(name)) {
				result.add(b.getNameBook() + " " + b.getAutor());
			}
		}
		System.out.println(result);
	}

	public void printPublishingHouse(Library library, String name) {
		List<String> result = new ArrayList<String>();

		List<Book> librarys = library.getBooks();

		for (int i = 0; i < librarys.size(); i++) {
			Book b = librarys.get(i);
			String s = b.getPublishingHouse();

			if (s.equalsIgnoreCase(name)) {
				result.add(b.getPublishingHouse() + " " + b.getAutor());
			}
		}
		System.out.println(result);
	}

	public void printPublishingYear(Library library, int year) {
		List<String> result = new ArrayList<String>();

		List<Book> librarys = library.getBooks();

		for (int i = 0; i < librarys.size(); i++) {
			Book b = librarys.get(i);
			int s = b.getYearPublish();

			if (s > year) {
				result.add(b.getYearPublish() + " " + b.getAutor());
			}
		}
		System.out.println(result);
	}

}
