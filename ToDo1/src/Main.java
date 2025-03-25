import java.util.List;

public class Main {

    public static void main(String[] args){

    UserSave userSave = new UserSave();
    TaskManagement taskManagement = new TaskManagement();
    Console_In consoleIn = new Console_In();
    Console_Out consoleOut = new Console_Out();

    while (true) {
        System.out.println("1. Добавить пользователя");
        System.out.println("2. Добавить задачу");
        System.out.println("3. Просмотр задач");
        System.out.println("4. Завершить задачу");
        System.out.println("5. Выйти");


        int number = consoleIn.getMenu();

        switch (number) {
            case 1:
                addUser(userSave, consoleIn, consoleOut);
                break;
            case 2:
                addTask(userSave, taskManagement, consoleIn, consoleOut);
                break;
            case 3:
                showTasks(userSave, taskManagement, consoleIn, consoleOut);
                break;
            case 4:
                completeTask(userSave, taskManagement, consoleIn, consoleOut);
                break;
            case 5:
                System.out.println("Выход");
                return;
        }
    }


}
    private static void addUser(UserSave userSave, Console_In consoleIn, Console_Out consoleOut){
        String name = consoleIn.getUserName();
        String email = consoleIn.getUserEmail();
        String password = consoleIn.getUserPassword();

        User user = userSave.addUser(name, email, password);
        if (user != null){
            consoleOut.userCreate(user);
        }
    }

    public static void addTask(UserSave userSave, TaskManagement taskManagement, Console_In consoleIn, Console_Out consoleOut) {
        String email = consoleIn.getUserEmail();
        User user = userSave.getUserByEmail(email);

        String text = consoleIn.getTaskText();
        Task task = taskManagement.createTask(text, email);
    }

    private static void showTasks(UserSave userSave, TaskManagement taskManagement, Console_In consoleIn, Console_Out consoleOut) {
        String email = consoleIn.getUserEmail();
        User user = userSave.getUserByEmail(email);

        List<Task> taskList = taskManagement.getTaskByEmail(email);
        consoleOut.usersTasks(taskList);
    }

    private static void completeTask(UserSave userSave, TaskManagement taskManagement, Console_In consoleIn, Console_Out consoleOut) {
        String email = consoleIn.getUserEmail();
        User user = userSave.getUserByEmail(email);

        String text = consoleIn.getTaskText();
        List<Task> taskList = taskManagement.getTaskByEmail(email);
        Task taskToComplete = null;
        for (Task task : taskList) {
            if (task.getText().equals(text)) {
                taskToComplete = task;
                break;
            }
        }
            if (taskToComplete != null){
                taskManagement.taskComplete(taskToComplete);
                consoleOut.taskComplete(taskToComplete);
            } else {
                System.out.println("Задача не найдена");
            }
    }
}

