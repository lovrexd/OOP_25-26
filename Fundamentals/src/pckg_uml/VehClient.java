package pckg_uml;

public class VehClient {

    public static void main(String[] args) {

        private static Vehicle veh;
        private static SportCar sc1;
        private static SportCar sc2;

        public static void main(String[] args){
            veh = new Vehicle("x4", "BMW");
            sc1 = new SportCar("Carrera", "Porsche");
            sc2 = new SportCar("Spider", "Ferrari");
            veh.startVehicle();
            veh.setDate("23-11-2008.");
            veh.vehInfo();
            sc1.setDate("10-10-2023");
            sc2.setDate("05-05-2024.");
            sc1.startVehicle();
            sc2.startVehicle();
            sc1.vehInfo();
        }

    }
}
