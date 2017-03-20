package review;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {

	@Resource
	private ReviewRepository repo;

	@RequestMapping("/showreview{id}")
	public String showreview(@PathVariable long id, Model model) {
		model.addAttribute("review", repo.findOne(id));
		return "review-view";

	}

	@RequestMapping("/showreviews")
	public String showreviews(Model model) {
		model.addAttribute("reviews", repo.findAll());
		return "all-reviews-view";

	}
}