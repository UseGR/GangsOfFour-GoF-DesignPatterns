package patterns.behavioral.mediator;

public interface Chat {
    void sendMessage(String message, User user);
    void setAdmin(User admin);
    void addUserToChat(User user);
}
