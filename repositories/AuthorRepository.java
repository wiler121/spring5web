package mf.springcourse.spring5web.repositories;

import mf.springcourse.spring5web.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
