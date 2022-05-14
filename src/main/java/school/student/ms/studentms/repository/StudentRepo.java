package school.student.ms.studentms.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import school.student.ms.studentms.entity.Student;

@RepositoryRestResource(path = "students-repo-ms")
public interface StudentRepo extends JpaRepository<Student, Long> {
    Page<Student> findAll(Pageable pageable);
}
