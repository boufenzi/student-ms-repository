package school.student.ms.studentms.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import school.student.ms.studentms.entity.Student;
import school.student.ms.studentms.repository.StudentRepo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Service
public class StudentService {

    private StudentRepo studentRepo;

    public Map<String, Object> findStudents(int page, int size) {
        Pageable pageable = PageRequest.of(page,size);
        Page<Student> students = studentRepo.findAll(pageable);
        Map<String, Object> studentMap = new HashMap<>();
        studentMap.put("students", students.getContent() );
        studentMap.put("currentPage", students.getNumber());
        studentMap.put("totalElements", students.getTotalElements());
        studentMap.put("totalPages", students.getTotalPages());
        return studentMap;
    }
}
