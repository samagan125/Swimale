public class Shark implements Swimable{
    private String name;

    public Shark(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Kumar negr");
    }
}
