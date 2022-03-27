package it.enrico.IManagers;

import it.enrico.Errors.SubjectAlreadyAssignedException;

import java.util.ArrayList;

public class ITeacher {

    private final String teacherName;
    public String getTeacherName() {
        return teacherName;
    }
    private ArrayList<ISubject> subjects;
    public ArrayList<ISubject> getSubjects() {
        return subjects;
    }
    public ITeacher(String name){
        teacherName = name;
        subjects = new ArrayList<>();
    }

    public void assignSubject(ISubject subject) throws SubjectAlreadyAssignedException {
        if(subjects.isEmpty()){
            subjects.add(subject);
            System.out.println("Subject " + subject.getName() + " assigned to teacher " + getTeacherName());
            return;
        }
        if(!subjects.contains(subject)){
            subjects.add(subject);
            System.out.println("Subject " + subject.getName() + " assigned to teacher " + getTeacherName());
        }else{
            throw new SubjectAlreadyAssignedException(this, subject);
        }

    }
    //I would not like to create a removeSubject HERE because honestly if that would ever happen, the app can get reloaded easily and the list would automatically be cleared


}
