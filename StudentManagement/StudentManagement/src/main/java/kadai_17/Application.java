//まとめたもの(最後動画）
package kadai_17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Application {

  private String name = "Enami Kouji";
  private String age = "37";

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @GetMapping("/studentInfo")
  public String getStudentInfo(String name) {
    return name + " " + age + "歳";
  }

  @PostMapping("/studentName")
  public void UpdateName(String name) {
    this.name = name;
  }
}
