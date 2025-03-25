import java.util.List;
import java.util.ArrayList;

public class TaskManagement {

    private  List<Task> taskList = new ArrayList<>();

   public TaskManagement(){

   }

   public Task createTask(String text, String userEmail){
       Task task = new Task(text, userEmail);
       taskList.add(task);
       return task;
   }

    public List<Task> getTaskByEmail(String email) {
       List<Task> userTaskList = new ArrayList<>();
       for (Task task : taskList ) {
           if (task.getUsersEmail().equals(email)){
               userTaskList.add(task);
           }
       }
       return userTaskList;
    }

    public void taskComplete(Task task){
       task.complete();
    }
}
