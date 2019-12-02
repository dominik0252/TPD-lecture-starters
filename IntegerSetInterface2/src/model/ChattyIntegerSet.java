package model;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ChattyIntegerSet extends HighVolumeIntegerSet {
  @Override
  public void insert(Integer num) {
    System.out.println("Inserting "+ num);
    // data.add(num) - not what we want to do (duplication)
    super.insert(num);
  }
}
