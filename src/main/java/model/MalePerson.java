package model;

public class MalePerson extends Person {

    private int expenditureMultiplicationValue;

    public MalePerson(String gender, float weight) {
        super(gender, weight);
        this.expenditureMultiplicationValue = 11;
    }

    @Override
    protected void calculateRestingEnergyExpenditure() {

    }
}
