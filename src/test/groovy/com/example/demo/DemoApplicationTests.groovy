package com.example.demo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    BookService bookService;

    @Test
    void saveAndFindBook() {
		bookService.save("TestOne")

		assert bookService.findByTitle("TestOne") !=null
    }

}
