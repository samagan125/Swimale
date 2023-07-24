public class Turtle implements Swimable{
    private String turtle;

    public Turtle(String turtle) {
        this.turtle = turtle;
    }

    public String getTurtle() {
        return turtle;
    }

    public void setTurtle(String turtle) {
        this.turtle = turtle;
    }

    @Override
    public void swim() {
        System.out.println("Kumarbek gei");
    }
}
