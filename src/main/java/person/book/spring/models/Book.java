package person.book.spring.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {

    private int id;

    @NotEmpty(message = "Название не должно быть пустым")
    @Size(min = 2, max = 100, message = "Название должно содержать от 2 до 100 символов")
    private String title;

    @NotEmpty()
    @Size(min = 2, max = 100, message = "Автор должен содержать в себе от 2 до 100 символов")
    private String author;

    @Min(value = 1000, message = "Год книги должен быть больше 1000")
    private int year;


    public Book() {
    }


    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
