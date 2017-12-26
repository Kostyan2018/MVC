package com.company;

public class MVCMain {

    public static void main(String[] args) {
        Student model = retrieveStudentFromDB();
        View view = new View();
        StudentController controller = new StudentController(model , view);
        controller.updateView();

        controller.setStudentName("Vovan");
        controller.updateView();
    }
    private static Student retrieveStudentFromDB() {
        Student student = new Student();
        student.setName("Ivan");
        student.setLesson("lesson1");

        return student;
    }
}
