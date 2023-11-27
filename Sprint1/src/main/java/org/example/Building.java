package org.example;
import java.util.List;

public class Building {
    private List<Sensor> sensors;
    private List<Aktuator> actuators;

    public List<Sensor> getSensors() {
        return sensors;
    }

    public List<Aktuator> getActuators() {
        return actuators;
    }

    // Additional methods to add/remove sensors and actuators
}
