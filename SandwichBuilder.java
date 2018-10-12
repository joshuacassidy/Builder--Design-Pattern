class SandwichBuilder implements ISandwich {
    private Sandwich sandwich;

    public SandwichBuilder() {
        sandwich = new Sandwich();
    }

    @Override
    public Sandwich build() {
        return sandwich;
    }

    @Override
    public ISandwich setMeat(String meat) {
        sandwich.setFilling(meat);
        return this;
    }

    @Override
    public ISandwich setBread(String bread) {
        sandwich.setBread(bread);
        return this;
    }

    @Override
    public ISandwich setSauce(String sauce) {
        sandwich.setSauce(sauce);
        return this;
    }
}
