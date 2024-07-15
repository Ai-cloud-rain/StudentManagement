//Mapで作成
package kadai_17;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApplicationMap {

  private Map<String, String> student;

  public ApplicationMap() {
    this.student = new HashMap<>(); // マップを初期化
  }

  public static void main(String[] args) {
    SpringApplication.run(ApplicationMap.class, args);
  }

  @GetMapping("/studentInfo2")
  public Map<String, String> getStudent() {
    return student;
  }

  @PostMapping("/studentInfo2/add")
  public String addStudent(
      @RequestParam String name,
      @RequestParam String age
  ) {
    student.put(name, age + "歳");// 名前をキー、年齢を値として追加
    return "学生情報が追加されました:" + name;
  }
}
