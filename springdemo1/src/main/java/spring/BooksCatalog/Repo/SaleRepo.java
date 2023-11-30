package spring.BooksCatalog.Repo;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import spring.BooksCatalog.Entities.Sale;
import spring.BooksCatalog.Entities.SaleCPK;

public interface SaleRepo extends JpaRepository<Sale,SaleCPK>
{
	
	@Query("select  s.store.storeId as storeId, sum(s.sold) as sumOfQtySold from Sale s Group By storeId Order By sumOfQtySold Desc")
	List<StoreSumOfQtyDTO > findByTitleSold(PageRequest pageRequest);
	
	@Query(" select s.store.storeId as storeId, s.sold as sold from Sale s join s.title t where t.titleId like  %:titleId% ")
	List<SalesByTitleDTO> findSaleByTitle(@Param("titleId") String titleId);
	
}

