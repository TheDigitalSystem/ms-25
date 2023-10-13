package az.ingress.ms25;

import az.ingress.ms25.domain.Student;
import az.ingress.ms25.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
public class Ms25Application implements CommandLineRunner {
    private final StudentRepository studentRepository;
    public static void main(String[] args) {
        SpringApplication.run(Ms25Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Student student = Student.builder()
//                .age(20)
//                .firstName("Elgun")
//                .lastName("Mahmudov")
//                .studentNumber("234")
//                .build();

//
//
//        Student student1 = Student.builder()
//                .age(20)
//                .firstName("Resul")
//                .lastName("Mahmudov")
//                .studentNumber("211")
//                .build();
//        studentRepository.save(student1);
//        studentRepository.save(student);

    }
}
