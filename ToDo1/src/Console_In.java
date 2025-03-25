import java.util.Scanner;

public class Console_In {

   private Scanner scan = new Scanner(System.in);

   public String getUserName(){
       System.out.println("Введите имя пользователя:");
       return scan.nextLine();
   }

   public String getUserEmail(){
       System.out.println("Введите email:");
       return scan.nextLine();
   }

   public String getUserPassword(){
       System.out.println("Введите пароль:");
       return scan.nextLine();
   }

   public String getTaskText(){
       System.out.println("Введите текст задачи:");
       return scan.nextLine();
   }

   public int getMenu(){
       System.out.println("Выберите действие:");
       return Integer.parseInt(scan.nextLine());
   }
}
