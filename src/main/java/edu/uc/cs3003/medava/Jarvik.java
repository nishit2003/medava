package edu.uc.cs3003.medava;
public class Jarvik implements Shippable  {
  // Constructor
  Jarvik(String deviceSerialNumber) {
    serialNumber = deviceSerialNumber;
  }

  
  public String getMedicineName() {
    return "Jarvik Artificial Heart";
  }

  // Get
  public MedicineSchedule getSchedule() {
    return MedicineSchedule.Uncontrolled;
  }

  // Get
  public String getSerialNumber() {
    return serialNumber;
  }

  // check range
  public boolean isTemperatureRangeAcceptable(Double lowTemperature, Double highTemperature) {
    if (30.0 <= lowTemperature && highTemperature <= 90.0) {
      return true;
    }
    return false;
  }

  private String serialNumber;
}