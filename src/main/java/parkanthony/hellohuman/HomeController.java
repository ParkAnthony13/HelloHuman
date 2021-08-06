package parkanthony.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String showLang(@RequestParam(value="name", required=false) String searchQuery, @RequestParam(value="lname", required=false) String lastName) {
		if (searchQuery == null) {
			return "<div><h1>Hello Human! </h1><p>Welcome to SpringBoot!</p><a href='/'>Home</a></div>";
		} else if (searchQuery!=null && lastName!=null) {
			return "<div><h1>Hello "+searchQuery+" "+lastName+"!</h1><p>Welcome to SpringBoot!</p><a href='/'>Home</a></div>";
		} else {
			return "<div><h1>Hello "+searchQuery+"!</h1><p>Welcome to SpringBoot!</p><a href='/'>Home</a></div>";
		}
	}
}
