package school.student.ms.studentms.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import school.student.ms.studentms.entity.Student;
import school.student.ms.studentms.repository.StudentRepo;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@WebMvcTest(controllers = StudentService.class)
class StudentServiceTest {

    @MockBean
    private StudentRepo studentRepo;

    @Autowired
    private StudentService studentService;

    @Test
    void findStudents() {
        Page<Student> students = new PageImpl<Student>(List.of(Student.builder()
                .studentId((long)1)
                .firstName("abdelghafour")
                .lastName("boufenzi")
                .dayOfBirth(Date.valueOf("1989-01-01"))
                .build()));
        when(studentRepo.findAll(Mockito.any(PageRequest.class)))
                .thenReturn(students);
        //Map<String, Object> studentsMap = studentService.findStudents(1, 2);

        assertEquals("abdelghafour", students.getContent().get(0).getFirstName() );
        assertEquals(0, students.getNumber());
        assertEquals(1, students.getTotalElements());
        assertEquals(1, students.getTotalPages());
    }
}