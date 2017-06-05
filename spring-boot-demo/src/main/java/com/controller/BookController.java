/**
 * 
 */
package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Book;
import com.repository.BookRespository;

/**
 * @author mengqinglan
 *2017年4月27日
 *TODO
 */
@Controller
@SpringBootApplication //开启组件扫描和自动配置  
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookRespository  bookRespository ;
	 
	@RequestMapping("/list/{reader}")
	String readerList(@PathVariable("reader") String reader,Book book) {
		book.setReader(reader);
		bookRespository.save(book) ;
		return "redirect:/book/find/{reader}" ;
	}
	@ResponseBody
	@RequestMapping("/find/{reader}")
	Object getReader(@PathVariable("reader") String reader) {
		 
		return bookRespository.findByReader(reader);
	}
	
	/**
	 * 
	 */
	@RequestMapping(method=RequestMethod.POST)
	String addToReadingList(Book book) {
		bookRespository.save(book) ;
		return "redirect:/readingList" ;
	}
	
	
	
	 
}
 