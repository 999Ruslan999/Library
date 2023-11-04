package person.book.spring.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import person.book.spring.dao.BookDAO;

@Controller
@RequestMapping("/book")
public class BookController {


    private final BookDAO bookDAO;

    @Autowired
    public BookController(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }


    @GetMapping
    public String index(Model model) {
        model.addAttribute("book", bookDAO.index());
        return "book/index";
    }



}