public class Main {
    public static void main(String[] args) {
        Swimable[] oceanarium={new Shark("shark1"),
                new Shark("shark2"),
                new Shark("shark3"),
                new Shark("shark4"),
                new Shark("Shark5"),
                new Duck(""),
                new Duck(""),
                new Duck(""),
                new Duck(""),
                new Duck(""),
                new Turtle("turtle1"),
                new Turtle("turtle2"),
                new Turtle("turtle3"),
                new Turtle("turtle4"),
                new Turtle("turtle5")};
        for (int i = 0; i < oceanarium.length; i++) {
            oceanarium[i].swim();
        }
    }
}