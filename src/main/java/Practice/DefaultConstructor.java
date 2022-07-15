package Practice;

public
class DefaultConstructor {
    public
    DefaultConstructor() {
        this(10);
        System.out.println("Default Constructor");
    }

    public
    DefaultConstructor(int x) {
        this(1,3);
        System.out.println("single value constructor");
    }

    public
    DefaultConstructor(int x, int y) {
        System.out.println(x*y);
    }

    public static
    void main(String[] args) {
        new DefaultConstructor();
    }
}
