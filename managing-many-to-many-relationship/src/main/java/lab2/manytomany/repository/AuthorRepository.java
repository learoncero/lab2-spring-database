package lab2.manytomany.repository;

import lab2.manytomany.dto.AuthorCourseDto;
import lab2.manytomany.model.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
	
	@Query("SELECT new lab2.manytomany.dto.AuthorCourseDto(c.id, a.name, c.name, c.description) from AUTHOR a, COURSES c, AUTHORS_COURSES ac where a.id = ac.authorId and c.id=ac.courseId and ac.authorId=?1")
	Iterable<AuthorCourseDto> getAuthorCourseInfo(long authorId);
}
