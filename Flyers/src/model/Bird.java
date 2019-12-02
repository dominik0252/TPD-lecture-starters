package model;

public abstract class Bird implements Flyer{

  // NOTE: this project accompanies the Subclasses & Extends, Pt. 2 (Extending) Video

  @Override
  public void takeOff() {
    System.out.println("Flap flap flap jump");
  }

  @Override
  public abstract void fly();

  @Override
  public void land() {
    System.out.println("Flap hop run run");
  }


}
