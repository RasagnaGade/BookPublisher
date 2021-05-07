package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Publisher;



public interface PublisherDao extends JpaRepository<Publisher, Integer> {

}
