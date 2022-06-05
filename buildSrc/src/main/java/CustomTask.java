import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

public class CustomTask extends DefaultTask {

  @Input
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  private String from;

  @TaskAction
  void greeting() {
    System.out.println("Hello world from " + from);
  }
}
