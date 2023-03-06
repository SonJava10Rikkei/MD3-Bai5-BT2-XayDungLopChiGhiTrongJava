//  UML    ________________________________
//        |        Student                |
//        |-------------------------------|
//        | -name:  String                |
//        | -classes: String              |
//        |-------------------------------|
//        | +Student():                   |
//        | +setName(name:String): String |
//        | +setClasses(classes:String): String |
//        |                               |
//        |                               |
//        |_______________________________|
package rikkei.academy;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }


    //    private void setClasses(String classes) {
//        this.classes = classes;
//    }
//    void setClasses(String classes) {
//        this.classes = classes;
//    }
    protected void setClasses(String classes) {
        this.classes = classes;
    }
//    public void setClasses(String classes) {
//        this.classes = classes;
//    }

    public void display() {
        System.out.println("name: " + name + "\nclass: " + classes);
    }

}
