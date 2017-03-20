package review;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

	@Resource
	private CategoryRepository categories;
	@Resource
	private ReviewRepository reviews;

	@RequestMapping(method = RequestMethod.GET)
	public String index(String indexy, Model model) {
		model.addAttribute("reviews", reviews.findAll());
		model.addAttribute("category", categories.findAll());
		return "index";
	}
}