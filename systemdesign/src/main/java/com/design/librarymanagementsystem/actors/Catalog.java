package com.design.librarymanagementsystem.actors;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Catalog implements Search
{
    private HashMap<String, List<Book>> bookTitles;
    private HashMap<String, List<Book>> bookAuthors;
    private HashMap<String, List<Book>> bookSubjects;
    private HashMap<String, List<Book>> bookPublicationDates;

    @Override
    public List<Book> searchByTitle(String title) {
        return bookTitles.get("");
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> searchBySubject(String subject) {
        return null;
    }

    @Override
    public List<Book> searchByPubDate(Date publishDate) {
        return null;
    }
}
