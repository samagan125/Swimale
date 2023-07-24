public class Duck implements Swimable{
    private String name;

    public Duck(String name) {
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
        System.out.println(name+"Baikal gei");
    }
}
