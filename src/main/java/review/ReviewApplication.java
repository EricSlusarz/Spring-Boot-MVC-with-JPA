package review;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReviewApplication {

	private static final Logger log = LoggerFactory.getLogger(ReviewApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	@Resource
	private ReviewRepository reviewRepository;

	@Resource
	private CategoryRepository categoryRepository;

}
