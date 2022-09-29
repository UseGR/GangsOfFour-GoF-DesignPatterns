package patterns.behavioral.observer;

import java.util.List;

public class Subcsriber implements Observer{
    private String name;

    public Subcsriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWe have some changes in vacancies:\n" + vacancies +
                "\n===============================\n");
    }
}
