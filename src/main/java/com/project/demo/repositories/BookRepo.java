package com.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.models.Book;


@Repository
public interface BookRepo extends JpaRepository<Book, Long>{

}
