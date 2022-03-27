package it.enrico.IManagers;

public class IGrades {


    private final ISubject subject;
    private final ITeacher teacher;
    private final double mark;

    public IGrades(ISubject subject, ITeacher teacher, double grade){
        this.subject = subject;
        this.teacher = teacher;
        mark = grade;
    }

    public double getMark() {
        return mark;
    }
    public ITeacher getTeacher() {
        return teacher;
    }
    public ISubject getSubject() {
        return subject;
    }


    public static double calcoloMedia(IGrades[] grade){

        double calc = 0.0;
        int times = 0;
        for(IGrades grades : grade){
            calc+= grades.getMark();
            times++;
        }

        return (double) (calc / times);

    }


}
