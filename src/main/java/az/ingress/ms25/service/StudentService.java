package az.ingress.ms25.service;

import az.ingress.ms25.domain.Student;
import az.ingress.ms25.repository.StudentRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Slf4j
@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    //Query Methods
    // @PostConstruct
    public void ListByQueryMethods() {
        studentRepository.findByFirstName("Elgun")
                .stream()
                .forEach(System.out::println);


        studentRepository.findByFirstNameAndLastName("Mahmudov", "Elgun")
                .stream()
                .forEach(System.out::println);
    }

    // JPQL METHODS
//    @PostConstruct
    public void jpql() {
        //log.trace("Our Jpql query in process");
        studentRepository.findStudentWithJpql("Elgun", "Mahmudov")
                .stream()
                .forEach(System.out::println);

    }

//    @PostConstruct
    public void sql() {
        studentRepository.findStudentWithSql("Elgun", "Mahmudov")
                .stream()
                .forEach(System.out::println);
    }

    @PostConstruct
    public void getStudentsWithParams() {
        log.trace("Loading students with params");
        studentRepository.getStudentsWithParams("Elgun", "Mahmudov", 20)
                .forEach(System.out::println);
    }

}
