package by.htp.book.main;

import by.htp.book.entity.Book;
import by.htp.book.entity.Library;
import by.htp.book.logic.BookLogic;
import by.htp.book.print.PrintResultSearch;

//public Book(int id, String nameBook, String autor, String publishingHouse, int yearPublish, int numberOfPages,
//double price, String typePerepleta) {
public class Main {

	public static void main(String[] args) {
		Book bok1 = new Book(1, "Война и мир", "Л.Н.Толстой", "Издательство", 1921, 800, 325.2, "Твердый переплет");
		Book bok2 = new Book(2, "Анна Каренина", "Л.Н.Толстой", "Переиздательство", 1928, 850, 325.11,
				"Твердый переплет");
		Book bok3 = new Book(3, "Бородино", "М.Ю.Лермонтов", "Издательство", 1921, 800, 325.2, "Твердый переплет");
		Book bok4 = new Book(4, "Родина", "М.Ю.Лермонтов", "Переиздательство", 1928, 850, 325.11, "Твердый переплет");
		Library library = new Library();

		library.add(bok1);
		library.add(bok2);
		library.add(bok3);
		library.add(bok4);

		BookLogic logic = new BookLogic();
		logic.author(library, "Л.Н.Толстой");
		logic.publishingHouse(library, "Издательство");
		logic.publishingYear(library, 1925);
		PrintResultSearch print = new PrintResultSearch();
		print.printAuthor(library, "Л.Н.Толстой");
		print.printPublishingHouse(library, "Переиздательство");

	}

}
