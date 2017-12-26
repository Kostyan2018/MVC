package com.company;

public class StudentController {
    private Student model;
    private View view;

    public StudentController(Student model, View view) {
        this.model = model;
        this.view = view;
    }
    public void setStudentName(String name){model.getName();}
    public String getStudent(){return model.getName();}
    public void setLesson(String lesson){model.setLesson(lesson);}
    public String getLesson(){return model.getLesson();}

    public void updateView(){
        view.printStudentInfo(model.getName(),model.getLesson());
    }




}
