package main.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.model.Book;
import com.repository.BookRespository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=BookRespository.class)
public class SpringBootDemoApplicationTests {

	 @Autowired
	 private BookRespository bookRespository;

	@Test
	public void contextLoads() {
		System.out.println(1);
		Book book = new Book();
		book.setIsbn("1");
		book.setReader("dolores");
		book.setTitle("德洛丽丝传记");
		book.setDescription("关于德洛丽丝传奇一生的故事");
		book.setReader("可疼");
		bookRespository.save(book) ;
	}

}
