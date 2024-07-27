package kadai_20;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import raisetech.StudentManagement.Student;
import raisetech.StudentManagement.StudentRepository;

@SpringBootApplication
@RestController
public class StudentManagementApplication2 {

  @Autowired
  private StudentRepository2 repository;

  //private String name = "Enami Kouji";
  //private int age = 37;

  public static void main(String[] args) {
    SpringApplication.run(StudentManagementApplication2.class, args);
  }

  @GetMapping("/student")
  public List<Student> getAllStudents() {
    return repository.getAllStudents();
  }

  //GET POST
  //GETは取得する、リクエストの結果を受け取る
  //POSTは情報を与える、渡す

  @PostMapping("/student")
  public void registerStudent(String name, int age){
    repository.registerStudent(name, age);
  }

  @PatchMapping("/student")
  public void updateStudent(String name, int age){
    repository.updateStudent(name, age);
  }

  @DeleteMapping("/student")
  public void deleteStudent(String name){
    repository.deleteStudent(name);
  }

}
