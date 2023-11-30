package spring.BooksCatalog.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import spring.BooksCatalog.Entities.TitleAuthor;
import spring.BooksCatalog.Repo.TitleAuthorRepo;
@RestController  
public class TitleAuthorController {
	@Autowired
	TitleAuthorRepo titleAuthorRepo;
	@GetMapping("/titleauthors")
	@Operation(summary = "Get all titleAuthors", description = "Retrieve a list of all titleAuthors from the database")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Successfully retrieved the list of all titleAuthors"),
			@ApiResponse(responseCode = "500", description = "Internal server error") })
	public List<TitleAuthor> getAllTitleAuthors() {
		return titleAuthorRepo.findAll();   
	}

}

