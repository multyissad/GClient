package it.enrico;

public class InstanceManager extends GradeInstance {



    public InstanceManager(){
        this.load();
    }

    private void init(){
        System.out.println("Initialising the Grade Client");


    }

    @Override
    public int getInstanceID() {
        return 19;
    }

    @Override
    public GradeInstance getInstance() {
        return this;
    }

    @Override
    public void load() {
        init();
    }
}
