package it.enrico.Errors;

import it.enrico.IManagers.ISubject;
import it.enrico.IManagers.ITeacher;

public class SubjectAlreadyAssignedException extends Exception{

    public SubjectAlreadyAssignedException(ITeacher teacher, ISubject subject){
        super("Teacher " + teacher.getTeacherName() + " | Subject " + subject.getName());
    }
}
