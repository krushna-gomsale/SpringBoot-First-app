package in.krushna;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class first {
	@GetMapping("/")
	String show() {
		
		return "welcome";
	}
	

}
