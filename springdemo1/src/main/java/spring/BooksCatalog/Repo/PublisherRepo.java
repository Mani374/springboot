package spring.BooksCatalog.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.BooksCatalog.Entities.Publisher;

public interface PublisherRepo extends JpaRepository<Publisher, String> {

}
