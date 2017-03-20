package review;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

	@Resource
	private CategoryRepository cat;

	@RequestMapping("/showallcategory")
	public String showallcategory(Model model) {
		model.addAttribute("categoryName", cat.findAll());
		return "all-category";
	}

	@RequestMapping("/showcategory{categoryID}")
	public String showcategory(@PathVariable long categoryID, Model model) {
		model.addAttribute("cat", cat.findOne(categoryID));
		return "category";

	}
}