package pl.coderslab.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface BookService {
    List<Book> getBooks();
    void add(Book book);
    Optional<Book> get(Long id);
    void delete(Long id);
    void update(Book book);
}
