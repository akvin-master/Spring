package Main;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import response.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/get")
	public List<BookResponse>  getBooks() throws IOException {
		List<BookResponse> temp =new ArrayList<>();
//		temp.add(new Book(1,"Angular"));
//		temp.add(new Book(2,"React"));		
//		ObjectMapper objectMapper = new ObjectMapper();
//		String arrayToJson = objectMapper.writeValueAsString(temp);
//		return arrayToJson;
		temp.add(new BookResponse(1, "Jack"));
		temp.add(new BookResponse(2, "Sample"));
		temp.add(new BookResponse(3, "Account"));
		return temp;
		
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
