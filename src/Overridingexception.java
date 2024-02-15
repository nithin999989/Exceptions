class Parent {
    void display() throws Exception {
        throw new Exception("Exception from Parent's display method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        try {
            throw new Exception("Exception from Child's display method");
        } catch (Exception e) {
            System.out.println("Exception caught in Child class: " + e.getMessage());
        }
    }
}

public class Overridingexception {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        try {
            parent.display();
        } catch (Exception e) {
            System.out.println("Exception caught in Parent class: " + e.getMessage());
        }

        child.display();
    }
}
