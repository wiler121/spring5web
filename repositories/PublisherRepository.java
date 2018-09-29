package mf.springcourse.spring5web.repositories;

import mf.springcourse.spring5web.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
