package patterns.behavioral.mediator;

public class Test {
    public static void main(String[] args) {
        Chat chat = new SimpleTextChat();
        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User 1");
        User user2 = new SimpleUser(chat, "User 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, I am User 1");
        admin.sendMessage("Roger that, I am Admin");

    }
}
