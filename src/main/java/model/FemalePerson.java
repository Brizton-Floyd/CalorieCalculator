package model;

public class FemalePerson extends Person {

    private int expenditureMultiplicationValue;

    public FemalePerson(){this.expenditureMultiplicationValue = 10;}
    public FemalePerson(String gender, float weight) {
        super(gender, weight);
        this.expenditureMultiplicationValue = 10;
    }

    @Override
    public void calculateRestingEnergyExpenditure() {
        restingEnergyExpenditure = (int) (getWeight() * expenditureMultiplicationValue);
    }
}
