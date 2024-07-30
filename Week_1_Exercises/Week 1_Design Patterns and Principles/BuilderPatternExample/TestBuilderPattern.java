public class TestBuilderPattern {
    public static void main(String[] args) {
        
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();
        System.out.println(basicComputer);

        Computer gamingComputer = new Computer.Builder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setPowerSupply("750W")
                .setMotherboard("ASUS ROG")
                .build();
        System.out.println(gamingComputer);

        Computer workstationComputer = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("2TB SSD")
                .setGraphicsCard("AMD Radeon Pro")
                .setPowerSupply("850W")
                .setMotherboard("Gigabyte Aorus")
                .build();
        System.out.println(workstationComputer);
    }
}