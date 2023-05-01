public class Car extends Vehicle {
        private String type;
        private int yearOfManufacture;

        public Car(){

        }
        public Car(String vehicleId){
            this.vehicleId = vehicleId;
        }
        public Car(String type, int yearOfManufacture){
            this.yearOfManufacture = yearOfManufacture;
            this.type = type;
        }
    public Car(String type, int yearOfManufacture, String name, String color, String vehicleId, String brand, int price) {
        super(name, color, vehicleId, brand, price);
        this.type = type;
        this.yearOfManufacture = yearOfManufacture;
    }
    public String getType() {
        return type;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getName() {
        return super.getName();
    }

    public String getColor() {
        return super.getColor();
    }

    public String getVehicleId() {
        return super.getVehicleId();
    }

    public String getBrand() {
        return super.getBrand();
    }

    public int getPrice() {
        return super.getPrice();
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void setColor(String color) {
        super.setColor(color);
    }

    public void setVehicleId(String vehicleId) {
        super.setVehicleId(vehicleId);
    }

    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    public void setPrice(int price) {
        super.setPrice(price);
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "+)  CAR: \n" + super.toString() + " ; Type - " + this.type + " ; Year of manufacture - " + this.yearOfManufacture + "\n";
    }

    @Override
    protected void updateVehicle() {
        super.updateVehicle();
        this.type = Utils.updateType(this.type, "Update Type (Sport/Travel/Common): ");
        this.yearOfManufacture = Utils.updateYear(this.yearOfManufacture, "Update Year of manufacture: ");
    }

    @Override
    protected void createVehicle() {
        super.createVehicle();
        this.type = Utils.getType("Type (Sport/Travel/Common): ");
        this.yearOfManufacture = Utils.getYear("Year of manufacture: ");
    }
}
