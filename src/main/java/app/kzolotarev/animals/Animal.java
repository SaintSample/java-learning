package app.kzolotarev.animals;

public class Animal {
    public int age;

    public int weight;

    public String name;

    public Animal(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
        this.name = "Неизвестно";
    }

    public Animal() {}

    public String speak() {
        return "Some animal sound";
    }

    public String speak(String accent) {
        return "Some animal sound wit accent to " + accent;
    }

    public String sayMyName() {
        if (this.name == null) {
            return "I dont have name";
        }

        return this.name;
    }

    public String sayMyName(String prefix) {
        return prefix + " " + this.sayMyName();
    }
}
