package se.lexicon.anas.booklender;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;


@SpringBootApplication(scanBasePackages = {"boot.registration"} , exclude = JpaRepositoriesAutoConfiguration.class)
public class BooklenderApplication {

	
	 
	public static void main(String[] args) {
		SpringApplication.run(BooklenderApplication.class, args);
		
		
	}
	

	

	
	
	
}


