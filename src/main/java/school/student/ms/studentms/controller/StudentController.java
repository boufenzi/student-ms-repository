package school.student.ms.studentms.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import school.student.ms.studentms.service.StudentService;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping(value = "students-ms")
public class StudentController {


    private StudentService studentService;

@GetMapping(value = "findAllStudentsWithPagination")
    public Map<String, Object> findAllStudentWithPagination(@RequestParam("page") int page,
                                                            @RequestParam("size") int size) {
        return studentService.findStudents(page, size);
    }
@GetMapping(value = "coucou")
    public String coucou() {
    return "coucou";
    }


}
