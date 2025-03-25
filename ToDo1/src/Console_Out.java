import java.util.List;

public class Console_Out {

    public void userCreate(User user){
        System.out.println("Пользователь:" + user.getName() + " создан.");
        System.out.println("Почта пользователя: " + user.getEmail());
    }

    public void taskCreate(Task task){
        System.out.println("Задача добавлена: " + task.getText());
    }

    public void usersTasks(List<Task> taskList){
        if (taskList.isEmpty()){
            System.out.println("Задач нет");
        } else { for (Task task : taskList){
            System.out.println("Задача " + "' " + task.getText() + " '" + " Завершена: " + task.isCompleted());
            }

        }
    }

    public void taskComplete(Task task){
        System.out.println("Задача: " + task.getText()+ " завершена.");
    }
}
