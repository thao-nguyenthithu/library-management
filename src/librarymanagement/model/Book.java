
package librarymanagement.model;

import java.util.Objects;

public class Book {
    private String idBook;
    private String titleBook;
    private String author;
    private String publisher;
    private String yearPublicationBook; 
    private String soLuongBook; 

    public Book() {
    }

    public Book(String idBook, String titleBook, String author, String publisher, String yearPublicationBook, String soLuongBook) {
        this.idBook = idBook;
        this.titleBook = titleBook;
        this.author = author;
        this.publisher = publisher;
        this.yearPublicationBook = yearPublicationBook;
        this.soLuongBook = soLuongBook;
    }

    public Book(String titleBook, String author, String publisher, String yearPublicationBook, String soLuongBook) {
        this.titleBook = titleBook;
        this.author = author;
        this.publisher = publisher;
        this.yearPublicationBook = yearPublicationBook;
        this.soLuongBook = soLuongBook;
    }

    public Book(String idBook, String titleBook, String author) {
        this.idBook = idBook;
        this.titleBook = titleBook;
        this.author = author;
    }

    
    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getYearPublicationBook() {
        return yearPublicationBook;
    }

    public void setYearPublicationBook(String yearPublicationBook) {
        this.yearPublicationBook = yearPublicationBook;
    }

    public String getSoLuongBook() {
        return soLuongBook;
    }

    public void setSoLuongBook(String soLuongBook) {
        this.soLuongBook = soLuongBook;
    }
    

    @Override
    public String toString() {
        return "Book{" + "idBook=" + idBook + ", titleBook=" + titleBook + ", author=" + author + ", publisher=" + publisher + ", yearPublicationBook=" + yearPublicationBook + ", soLuongBook=" + soLuongBook + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.idBook);
        hash = 59 * hash + Objects.hashCode(this.titleBook);
        hash = 59 * hash + Objects.hashCode(this.author);
        hash = 59 * hash + Objects.hashCode(this.publisher);
        hash = 59 * hash + Objects.hashCode(this.yearPublicationBook);
        hash = 59 * hash + Objects.hashCode(this.soLuongBook);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.idBook, other.idBook)) {
            return false;
        }
        if (!Objects.equals(this.titleBook, other.titleBook)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.publisher, other.publisher)) {
            return false;
        }
        if (!Objects.equals(this.yearPublicationBook, other.yearPublicationBook)) {
            return false;
        }
        return Objects.equals(this.soLuongBook, other.soLuongBook);
    }
    
}
