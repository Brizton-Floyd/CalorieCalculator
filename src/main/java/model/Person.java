package model;

public abstract class Person {

    private String gender;
    private int maintenanceCalories, surplusCalories, deficitCalories;
    private float weight;

    public Person(String gender, float weight){
        this.gender = gender;
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public float getWeight() {
        return weight;
    }

    protected abstract void calculateRestingEnergyExpenditure();
}
