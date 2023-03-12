class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi";
    }

    @Override
    public String brake() {
        return "Mitsubishi";
    }
}
