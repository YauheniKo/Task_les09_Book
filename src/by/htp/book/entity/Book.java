package by.htp.book.entity;


//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
public class Book {
	private int id;
	private String nameBook;
	private String autor;
	private String publishingHouse;
	private int yearPublish;
	private int numberOfPages;
	private double price;
	private String typePerepleta;
				
	
	public Book(int id, String nameBook, String autor, String publishingHouse, int yearPublish, int numberOfPages,
			double price, String typePerepleta) {
		
		this.id = id;
		this.nameBook = nameBook;
		this.autor = autor;
		this.publishingHouse = publishingHouse;
		this.yearPublish = yearPublish;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.typePerepleta = typePerepleta;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameBook() {
		return nameBook;
	}
	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPublishingHouse() {
		return publishingHouse;
	}
	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}
	
	
	public int getYearPublish() {
		return yearPublish;
	}
	public void setYearPublish(int yearPublish) {
		this.yearPublish = yearPublish;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + yearPublish;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (yearPublish != other.yearPublish)
			return false;
		return true;
	}
	

}
