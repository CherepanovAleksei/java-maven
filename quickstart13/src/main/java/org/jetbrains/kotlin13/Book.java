package org.jetbrains.kotlin13;

public class Book {
    String author;
    Integer index;
    Boolean inUse;
    public Book(String author, Integer index, Boolean inUse) {
        this.author = author;
        this.index = index;
        this.inUse = inUse;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getIndex() {
        return index;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getInUse() {
        return inUse;
    }

    public String getAuthor() {
        return author;
    }

    public void setInUse(Boolean inUse) {
        this.inUse = inUse;
    }
}
