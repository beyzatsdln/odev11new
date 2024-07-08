public class Car {
    private String marka;
    private String model;
    private int yil;
    private int km;


    public static final class CarBuilder {
        private String marka;
        private String model;
        private int yil;
        private int km;

        private CarBuilder() {
        }

        public static CarBuilder aCar() {
            return new CarBuilder();
        }

        public CarBuilder withMarka(String marka) {
            this.marka = marka;
            return this;
        }

        public CarBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder withYil(int yil) {
            this.yil = yil;
            return this;
        }

        public CarBuilder withKm(int km) {
            this.km = km;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.marka = this.marka;
            car.model = this.model;
            car.km = this.km;
            car.yil = this.yil;
            return car;
        }
    }
    @Override
    public String toString(){
        return "Car{" +
                "marka='" + marka+ '\'' +
                ", model='" + model + '\'' +
                ", yil ='" + yil + '\'' +
                ", km =" + km +
                '}';
}

}
