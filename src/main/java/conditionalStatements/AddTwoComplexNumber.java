package conditionalStatements;

public
class AddTwoComplexNumber {
    private int real, imaginary;

    public
    AddTwoComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static
    AddTwoComplexNumber add(AddTwoComplexNumber c1, AddTwoComplexNumber c2) {
        AddTwoComplexNumber temp = new AddTwoComplexNumber(0, 0);
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;

        return temp;
    }

    public static
    void main(String[] args) {
        AddTwoComplexNumber m1 = new AddTwoComplexNumber(4, 5);
        AddTwoComplexNumber m2 = new AddTwoComplexNumber(3, 5);

        AddTwoComplexNumber res = add(m1, m2);
        System.out.println(" The Sum is " + res.real + " + " + res.imaginary + "i");
    }
}
