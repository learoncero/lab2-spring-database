package lab2.manytomany.repository;

import lab2.manytomany.ibp.DescriptionOnly;
import lab2.manytomany.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

   // Methods to be added

    Iterable<DescriptionOnly> getCourseByName(String name);
}
