package pckg_uml_abs;

import pckg_uml.SportCar;

public class TestClient {
    SportGPMotor mot1 = new SportGPMotor("Ducati", "H1000");
    SportCar spc = new SportCar("Mercedes", "c63 amg");
    mot1.startVeh();
}
