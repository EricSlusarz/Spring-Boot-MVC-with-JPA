package review;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long idForReview;

	String titleofReview;
	String datee;
	String reviewCategory;
	String contentattribute;

	@ManyToOne
	public Category category;

	public Review(long idForReview, String titleofReview, String datee, String reviewCategory, String contentattribute,
			Category category) {
		super();
		this.titleofReview = titleofReview;
		this.datee = datee;
		this.reviewCategory = reviewCategory;
		this.contentattribute = contentattribute;
		this.category = category;
	}

	public Review() {
	}

	/**
	 * @return the IdForReview
	 */
	public long getIdForReview() {
		return idForReview;
	}

	/**
	 * @return the titleofReview
	 */
	public String getTitleofReview() {
		return titleofReview;
	}

	/**
	 * @return the reviewCategory
	 */
	public String getReviewCategory() {
		return reviewCategory;
	}

	/**
	 * @return the contentattribute
	 */
	public String getContentattribute() {
		return contentattribute;
	}

	/**
	 * @return the date
	 */
	public String getDatee() {
		return datee;
	}

	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

}