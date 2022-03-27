package it.enrico.IManagers;

import it.enrico.Errors.TeacherAlreadyExistsException;
import it.enrico.GradeInstance;

import java.util.ArrayList;

public class TeacherManager {


    private final GradeInstance inst;
    private ArrayList<ITeacher> teacherList;
    public ArrayList<ITeacher> getTeacherList() {
        return teacherList;
    }
    public TeacherManager(GradeInstance instance){
        teacherList = new ArrayList<>();
        if(instance.getInstanceID() == 19){
            //Loaded from scratch. might be useful
        }else{
            //Not loaded from scratch. might be useful
        }

        inst = instance;
    }


    public void newTeacher(String name) throws TeacherAlreadyExistsException{
        if(!isTeacherRegistered(name)){
            teacherList.add(new ITeacher(name));
        }else throw new TeacherAlreadyExistsException(name);
    }

    public boolean isTeacherRegistered(String teacherName){
        if(teacherList.isEmpty()) return false;
        for(ITeacher t : teacherList){ if(t.getTeacherName().equalsIgnoreCase(teacherName)) return true; }
        return false;
    }

    public boolean isTeacherRegistered(ITeacher teacher){

        if(teacherList.isEmpty()) return false;
        return teacherList.contains(teacher);
    }


}
