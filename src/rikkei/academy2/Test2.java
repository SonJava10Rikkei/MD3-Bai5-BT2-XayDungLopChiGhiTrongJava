package rikkei.academy2;

import rikkei.academy.Student;

public class Test2 extends Student {
    public static void main(String[] args) {
        Student student1 = new Student();
        Test2 test2 = new Test2();

        student1.setName("Son");
        test2.setClasses("C005");
        student1.display();
    }

}
