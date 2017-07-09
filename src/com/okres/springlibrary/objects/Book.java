package com.okres.springlibrary.objects;

import java.util.Arrays;

/**
 * Created by Alex on 08.07.2017.
 */
public class Book {

    private Author author;
    private Genre genre;
    private Publisher publisher;
    private String name;
    private byte[] content;
    private Integer pageCount;
    private String isbn;
    private Integer publisherYear;
    private byte[] image;
    private String description;
    private Integer raiting;
    private Long voteCount;

    public Book() {
    }

    public Book(Author author, Genre genre, Publisher publisher, String name, byte[] content, Integer pageCount, String isbn, Integer publisherYear, byte[] image, String description, Integer raiting, Long voteCount) {
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.name = name;
        this.content = content;
        this.pageCount = pageCount;
        this.isbn = isbn;
        this.publisherYear = publisherYear;
        this.image = image;
        this.description = description;
        this.raiting = raiting;
        this.voteCount = voteCount;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(Integer publisherYear) {
        this.publisherYear = publisherYear;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRaiting() {
        return raiting;
    }

    public void setRaiting(Integer raiting) {
        this.raiting = raiting;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", genre=" + genre +
                ", publisher=" + publisher +
                ", name='" + name + '\'' +
                ", content=" + Arrays.toString(content) +
                ", pageCount=" + pageCount +
                ", isbn='" + isbn + '\'' +
                ", publisherYear=" + publisherYear +
                ", image=" + Arrays.toString(image) +
                ", description='" + description + '\'' +
                ", raiting=" + raiting +
                ", voteCount=" + voteCount +
                '}';
    }
}
