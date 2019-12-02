package ui;

import model.*;

public class FlyerDemo {

  // NOTE: this project goes with the Subclasses & Extends, Pt. 2 (Extending) Video

  public static void main(String[] args) {
    // Bird birdie = new Bird(); - not possible anymore
    Bird hawk = new Hawk();
    Bird hummingbird = new HummingBird();
    Airplane planie = new Airplane();
    Cafe cafePlane = new Airplane();
    Flyer flyerPlane = new Airplane();
    PrivatePlane pp = new PrivatePlane();

    hawk.fly();
    hawk.takeOff();
    hawk.land();
    cafePlane.serveDrinks();

    FlyerDemo fd = new FlyerDemo();
    fd.lunchService(cafePlane);
    fd.firstPartOfFlight(planie);
    // fd.firstPartOfFlight(flyerPlane); - not possible, Flyer is not subclass of Airplane
    fd.luxuryTakeoff(pp);
    // fd.luxuryTakeoff(planie); - not possible, Airplane is not subclass of PrivatePlane

    pp.fly();
    pp.bringWarmTowels();
  }

  public void lunchService(Cafe c){
    c.serveDrinks();
    c.serveSnacks();
  }

  public void firstPartOfFlight(Airplane a){
    a.takeOff();
    a.serveDrinks();
  }

  public void luxuryTakeoff(PrivatePlane p) {
    p.takeOff();
    p.bringWarmTowels();
  }

}
