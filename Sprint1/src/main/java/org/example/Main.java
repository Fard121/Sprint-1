package org.example;
import java.util.UUID;


public class Main {
    public static void main(String[] args) {
        // Create a building management system
        BuildingManagementSystem bms = new BuildingManagementSystem();

        // Add a building

        // Find the building we just added (this part depends on your implementation of addBuilding())
        Building building = bms.getBuildings().get(0);

        // Add sensors and actuators to the building
        TemperaturSensor tempSensor = new TemperaturSensor("Temp Sensor 1");
        Co2Sensor co2Sensor = new Co2Sensor("CO2 Sensor 1");
        VentilationAktuator ventActuator = new VentilationAktuator("Vent Actuator 1");

        building.getSensors();
        building.getActuators();

        // Retrieve and print out sensor readings and actuator status
        for (Sensor sensor : building.getSensors()) {
            System.out.println("Sensor: " + sensor.getName() + ", Value: " + sensor.getValue());
        }

        for (Aktuator actuator : building.getActuators()) {
            System.out.println("Actuator: " + actuator.getName() + ", Value: " + actuator.getValue());
        }

        // Assume you have set values for actuators before retrieving
        ventActuator.setValue(10.5);
        System.out.println("After setting value, " + ventActuator.getName() + " Value: " + ventActuator.getValue());
    }
}