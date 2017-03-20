package review;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long categoryID;
	String categoryTitle;
	String CATEGORY_DESCRIPTION;

	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	public Collection<Review> reviews;

	Category(long categoryID, String categoryTitle, Review review, String CATEGORY_DESCRIPTION) {
		this(categoryID, categoryTitle, review, CATEGORY_DESCRIPTION, Collections.emptyList());
	}

	Category(long categoryID, String categoryTitle, Review review, String CATEGORY_DESCRIPTION,
			Collection<Review> reviews) {
		this.categoryTitle = categoryTitle;
		this.CATEGORY_DESCRIPTION = CATEGORY_DESCRIPTION;
		this.reviews = reviews;
	}

	private Category() {
	}

	/**
	 * @return the categoryID
	 */
	public long getCategoryID() {
		return categoryID;
	}

	/**
	 * @return the categoryTitle
	 */
	public String getCategoryTitle() {
		return categoryTitle;
	}

	/**
	 * @return the cATEGORY_DESCRIPTION
	 */
	public String getCATEGORY_DESCRIPTION() {
		return CATEGORY_DESCRIPTION;
	}

	/**
	 * @return the reviews
	 */
	public Collection<Review> getReviews() {
		return reviews;
	}

}
