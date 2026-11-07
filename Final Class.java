final class A {
    void display() {
        System.out.println("Final class");
    }
}

// class B extends A { }
// This would cause a compilation error.

class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}
