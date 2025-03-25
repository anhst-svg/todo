import java.util.HashMap;
import java.util.Map;

public class UserSave {
    private Map<String, User> userMap = new HashMap<>();

    public UserSave(){

    }

    public User addUser(String email, String name, String password){
        if (userMap.containsKey(email)){
            System.out.println("Пользователь уже существует");
            return null;
        }

        User user = new User(name, email, password);
        userMap.put(user.getEmail(), user);
        System.out.println("Пользователь создан: ");
        return user;
    }

    public User getUserByEmail(String email) {
        return userMap.get(email);
    }

}
