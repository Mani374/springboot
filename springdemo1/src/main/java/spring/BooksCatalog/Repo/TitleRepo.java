package spring.BooksCatalog.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import spring.BooksCatalog.Entities.Publisher;
import spring.BooksCatalog.Entities.Title;

public interface TitleRepo extends JpaRepository<Title, String> {

	List<Title> findByPublisher(Optional<Publisher> publisher);
	List<Title> findByTitleContaining(String title);

	List<Title> findByPriceBetween(Double minPrice, Double maxPrice);

	List<Title> findTop5ByOrderByYtdsalesDesc();

	@Query( "SELECT t.title, a.auName FROM Title t JOIN t.authors a")
	List<Object []> findTitleAndAuthor();

	@Query("select t.title as title ,t.price as price ,t.ytdsales as ytdSales,t.publisher.pubName as pubName ,a.auName  as auName from Title t join t.authors a where titleId like %:titleId%  ")
	List<TitleDetailsDTO > findAllDetailsByTitle(@Param("titleId") String titleId);
}
