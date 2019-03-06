package model;

public abstract class Person {

    private String gender;
    private int maintenanceCalories, surplusCalories, deficitCalories;
    int restingEnergyExpenditure;
    private float weight;

    public Person(){}
    public Person(String gender, float weight){
        this.gender = gender;
        this.weight = weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getRestingEnergyExpenditure() {
        return restingEnergyExpenditure;
    }

    public String getGender() {
        return gender;
    }

    public float getWeight() {
        return weight;
    }

    public abstract void calculateRestingEnergyExpenditure();

    @Override
    public String toString() {
        return super.toString();
    }
}
