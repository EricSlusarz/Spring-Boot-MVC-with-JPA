/**
 * Make the interface so that we can retrieve Category instances from the Database
 */
package review;

import org.springframework.stereotype.Component;

@Component
public interface ReviewRepository extends org.springframework.data.repository.CrudRepository<Review, Long> {

}
