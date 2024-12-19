public class MainClass {
    public static void main(String[] args) {
        A b1 = new A();
        A b2 = new C();
        b1 = (A) b2; // Valid type casting (C is a subclass of A)
        A b3 = (B) b2; // Compilation error: C cannot be cast to B

        b1.test();
        b2.test();
    }
}
