package model;

public class FemalePerson extends Person {

    private int expenditureMultiplicationValue;

    public FemalePerson(String gender, float weight) {
        super(gender, weight);
        this.expenditureMultiplicationValue = 10;
    }

    @Override
    protected void calculateRestingEnergyExpenditure() {

    }
}
