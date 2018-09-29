package mf.springcourse.spring5web.repositories;

import mf.springcourse.spring5web.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
