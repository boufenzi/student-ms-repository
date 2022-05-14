package school.student.ms.studentms.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;
    private Date dayOfBirth;
    private String phoneNumber;
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date createdAt;
}
