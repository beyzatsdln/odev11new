public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        Car car = Car.CarBuilder.aCar()
                .withMarka("Toyota")
                .withModel("Corolla")
                .withYil(2023)
                .withKm(24000)
                .build();

        System.out.println(car.toString());


    }
}



