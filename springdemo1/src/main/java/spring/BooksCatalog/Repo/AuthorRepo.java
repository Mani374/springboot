package spring.BooksCatalog.Repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import spring.BooksCatalog.Entities.Author;

public interface AuthorRepo extends JpaRepository<Author, String> {
	
}
 