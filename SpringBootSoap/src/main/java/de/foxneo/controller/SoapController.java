package de.foxneo.controller;

import de.foxneo.client.SoapClient;
import de.foxneo.wsdl.AddResponse;
import de.foxneo.wsdl.DivideResponse;
import de.foxneo.wsdl.MultiplyResponse;
import de.foxneo.wsdl.SubtractResponse;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoapController {

  @Autowired
  private SoapClient soapClient;

  @PostMapping("/add")
  public ResponseEntity<?> add(@RequestParam int numberA, @RequestParam int numberB) {
    Map<String, Integer> response = new HashMap<>();
    AddResponse addResponse = soapClient.getAddResponse(numberA, numberB);
    response.put("Result", addResponse.getAddResult());
    return ResponseEntity.ok(response);
  }

  @PostMapping("/subtract")
  public ResponseEntity<?> subtract(@RequestParam int numberA, @RequestParam int numberB) {
    Map<String, Integer> response = new HashMap<>();
    SubtractResponse subtractResponse = soapClient.getSubstractResponse(numberA, numberB);
    response.put("Result", subtractResponse.getSubtractResult());
    return ResponseEntity.ok(response);
  }

  @PostMapping("/multiply")
  public ResponseEntity<?> multiply(@RequestParam int numberA, @RequestParam int numberB) {
    Map<String, Integer> response = new HashMap<>();
    MultiplyResponse multiplyResponse = soapClient.getMultiplyResponse(numberA, numberB);
    response.put("Result", multiplyResponse.getMultiplyResult());
    return ResponseEntity.ok(response);
  }

  @PostMapping("/divide")
  public ResponseEntity<?> divide(@RequestParam int numberA, @RequestParam int numberB) {
    Map<String, Integer> response = new HashMap<>();
    DivideResponse divideResponse = soapClient.getDivideResponse(numberA, numberB);
    response.put("Result", divideResponse.getDivideResult());
    return ResponseEntity.ok(response);
  }
}
