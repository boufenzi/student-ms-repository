package school.student.ms.studentms.controller;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import school.student.ms.studentms.entity.Student;
import school.student.ms.studentms.service.StudentService;

import javax.annotation.meta.When;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@WebMvcTest(controllers = StudentController.class)
class StudentControllerTest {

    @Autowired
    private StudentController studentController;

    @Autowired
    private MockMvc mockMvc;


    @MockBean
    private StudentService studentService;

    @Test
    void findAllStudentWithPagination() throws Exception {
        Map<String,Object> studentMap = new HashMap<>();
        studentMap.put("students", Student.builder()
                .studentId((long)1)
                .firstName("abdelghafour")
                .lastName("boufenzi")
                .dayOfBirth(Date.valueOf("1989-01-01"))
                .build());
        when(studentService.findStudents(anyInt(),anyInt()))
                .thenReturn(studentMap);

        mockMvc.perform(MockMvcRequestBuilders
                .get("/students-ms/findAllStudentsWithPagination?page=1&size=1")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.students.firstName",
                        Matchers.is("abdelghafour")));

    }

    @Test
    void coucou() {
        assertEquals("coucou", studentController.coucou());
    }
}