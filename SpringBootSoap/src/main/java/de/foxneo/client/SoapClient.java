package de.foxneo.client;

import de.foxneo.wsdl.Add;
import de.foxneo.wsdl.AddResponse;
import de.foxneo.wsdl.Divide;
import de.foxneo.wsdl.DivideResponse;
import de.foxneo.wsdl.Multiply;
import de.foxneo.wsdl.MultiplyResponse;
import de.foxneo.wsdl.Subtract;
import de.foxneo.wsdl.SubtractResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapClient extends WebServiceGatewaySupport {

  public AddResponse getAddResponse(int numberA, int numberB) {
    Add addRequest = new Add();
    addRequest.setIntA(numberA);
    addRequest.setIntB(numberB);

    SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Add");
    AddResponse addResponse = (AddResponse) getWebServiceTemplate().marshalSendAndReceive(
        "http://www.dneonline.com/calculator.asmx",
        addRequest, soapActionCallback);
    return addResponse;
  }

  public SubtractResponse getSubstractResponse(int numberA, int numberB) {
    Subtract subtractRequest = new Subtract();
    subtractRequest.setIntA(numberA);
    subtractRequest.setIntB(numberB);
    SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Subtract");
    SubtractResponse subtractResponse = (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive(
        "http://www.dneonline.com/calculator.asmx",
        subtractRequest, soapActionCallback);
    return subtractResponse;
  }

  public MultiplyResponse getMultiplyResponse(int numberA, int numberB) {
    Multiply multiplyRequest = new Multiply();
    multiplyRequest.setIntA(numberA);
    multiplyRequest.setIntB(numberB);

    SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Multiply");
    MultiplyResponse multiplyResponse = (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive(
        "http://www.dneonline.com/calculator.asmx",
        multiplyRequest, soapActionCallback);
    return multiplyResponse;
  }

  public DivideResponse getDivideResponse(int numberA, int numberB) {
    Divide divideRequest = new Divide();
    divideRequest.setIntA(numberA);
    divideRequest.setIntB(numberB);

    SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Divide");
    DivideResponse divideResponse = (DivideResponse) getWebServiceTemplate().marshalSendAndReceive(
        "http://www.dneonline.com/calculator.asmx",
        divideRequest, soapActionCallback);
    return divideResponse;
  }

}
