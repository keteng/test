/**
 * 
 */
package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Book;

/**
 * @author mengqinglan
 *2017年4月27日
 *TODO
 */ 
public interface BookRespository extends JpaRepository<Book, Long> {

	List<Book> findByReader(String reader) ;
}
 