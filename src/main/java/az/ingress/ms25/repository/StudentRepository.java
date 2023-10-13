package az.ingress.ms25.repository;

import az.ingress.ms25.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Long>, JpaSpecificationExecutor<Student> {


    List<Student> findByFirstName(String elgun);

    List<Student> findByFirstNameAndLastName(String Elgun, String Mahmudov);


    @Query("Select s from Student s Where s.firstName = ?1 AND s.lastName = ?2 ")
    List<Student> findStudentWithJpql(String firstName, String lastName);


    @Query(nativeQuery = true, value = " Select * from our_students s where s.first_Name = ?1 AND s.last_Name = ?2")
    List<Student> findStudentWithSql(String elgun, String mahmudov);

    @Query(value = "select s from Student s where (:firstName is null or s.firstName=:firstName)" +
            "and (:lastName is null or s.lastName =:lastName)" +
            "and (:age is null or s.age =:age)")
            List<Student>getStudentsWithParams(@Param("firstName") String firstName,
            @Param("lastName")String lastName,
            @Param("age")Integer age);

//    List<Student> getStudentsWithParams();
}
