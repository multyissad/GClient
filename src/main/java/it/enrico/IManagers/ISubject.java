package it.enrico.IManagers;

public class ISubject {

    private final String subjectName;
    public ISubject(String name){
        subjectName = name;
    }

    public String getName(){
        return subjectName;
    }
}
