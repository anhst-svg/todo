public class Task {
    private String text;
    private boolean completed;
    private String userEmail;

    public Task(){
       this.completed = false;
    }

    public Task(String text,  String userEmail){
        this.text = text;
        this.completed = false;
        this.userEmail = userEmail;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public boolean isCompleted(){
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getUsersEmail(){
        return userEmail;
    }

    public void setUsersEmail(String usersEmail){
        this.userEmail = usersEmail;
    }

    public void complete(){
        this.completed = true;
    }
}
