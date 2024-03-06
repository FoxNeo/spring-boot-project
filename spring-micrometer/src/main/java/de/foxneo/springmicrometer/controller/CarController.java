package de.foxneo.springmicrometer.controller;

import de.foxneo.springmicrometer.model.CarStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

  Logger log = LoggerFactory.getLogger(CarController.class);

  @GetMapping("/api/status")
  public CarStatus getStatus() {
    log.info("getStatus() has been called");
    return new CarStatus("25°C", "150 km");
  }

}
