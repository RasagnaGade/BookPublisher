package com.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Book;



public interface BookPublisherDao extends JpaRepository<Book, Integer> {

	List<Book> findAllDetails(int id);
	List<Book> findBookByPublisher(int publisher_id);
}
