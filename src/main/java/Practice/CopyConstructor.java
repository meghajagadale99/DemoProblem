package Practice;

public
class CopyConstructor {
    private int id;
    private int empid;

    public
    CopyConstructor(int id, int empid) {
        this.id = id;
        this.empid = empid;
    }

    public
    CopyConstructor(CopyConstructor c) {
        id = c.id;
        empid = c.empid;
    }

    public static
    void main(String[] args) {
        CopyConstructor c1 = new CopyConstructor(1, 5);
        CopyConstructor c2 = new CopyConstructor(c1);
        System.out.println(c1);
    }

    @Override
    public
    String toString() {
        return (id + " + " + empid + " i ");
    }
}
