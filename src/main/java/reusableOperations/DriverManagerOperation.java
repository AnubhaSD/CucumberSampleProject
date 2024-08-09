package reusableOperations;

import java.util.Objects;

import org.openqa.selenium.remote.RemoteWebDriver;



public class DriverManagerOperation {
  private DriverManagerOperation() {
  }

  private static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

  public static RemoteWebDriver getDriver() {
    return driver.get();
  }

  static void setDriver(RemoteWebDriver driverref) {
    if (Objects.nonNull(driverref)) {
      driver.set(driverref);
    }
  }

  static void unload() {
    driver.remove();
  }
}