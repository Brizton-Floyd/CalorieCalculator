package model;

public class MalePerson extends Person {

    private int expenditureMultiplicationValue;

    public MalePerson(){this.expenditureMultiplicationValue = 11;
    }
    public MalePerson(String gender, float weight) {
        super(gender, weight);
        this.expenditureMultiplicationValue = 11;
    }

    @Override
    public void calculateRestingEnergyExpenditure() {
        restingEnergyExpenditure = (int) (getWeight() * expenditureMultiplicationValue);
    }
}
