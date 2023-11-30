package spring.BooksCatalog.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import spring.BooksCatalog.Entities.Store;
import spring.BooksCatalog.Entities.Title;

public interface StoreRepo extends JpaRepository<Store,String>  {
	
	
	@Query("SELECT t FROM Store s JOIN s.titles t WHERE s.storeId = :storeId")
	List<Title> findByStoreId(@Param("storeId") String storeId);

}
