class Ford extends Car{
    @Override
    public String startEngine() {
        return "Ford";
    }

    @Override
    public String accelerate() {
        return "Ford";
    }

    @Override
    public String brake() {
        return "Ford";
    }

    public Ford(int cylinders, String name) {
        super(cylinders, name);

    }
}
