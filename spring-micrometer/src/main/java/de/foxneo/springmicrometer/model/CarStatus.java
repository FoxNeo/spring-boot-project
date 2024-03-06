package de.foxneo.springmicrometer.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CarStatus {

  @Getter
  @Setter
  private String temp;

  @Getter
  @Setter
  private String speed;

  public CarStatus(String temp, String speed) {
    this.temp = temp;
    this.speed = speed;
  }

}