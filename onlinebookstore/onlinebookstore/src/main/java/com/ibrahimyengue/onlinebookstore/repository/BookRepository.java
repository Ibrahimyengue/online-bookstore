package com.ibrahimyengue.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ibrahimyengue.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
