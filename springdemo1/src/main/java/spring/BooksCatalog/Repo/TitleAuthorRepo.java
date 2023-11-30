package spring.BooksCatalog.Repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import spring.BooksCatalog.Entities.TitleAuthor;
public interface TitleAuthorRepo extends JpaRepository<TitleAuthor,String > {
}
