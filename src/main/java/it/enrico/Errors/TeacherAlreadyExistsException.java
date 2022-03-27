package it.enrico.Errors;

public class TeacherAlreadyExistsException extends Exception{

    private final String teachersName;
    public TeacherAlreadyExistsException(String teacherName){
        super("Teacher " + teacherName + " already exists");
        teachersName = teacherName;
    }
    public String getTeachersName() {
        return teachersName;
    }

}
