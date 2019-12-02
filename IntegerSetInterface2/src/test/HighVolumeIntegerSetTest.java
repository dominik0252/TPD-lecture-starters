package test;

import model.HighVolumeIntegerSet;
import model.IntegerSet;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class HighVolumeIntegerSetTest extends IntegerSetTest {

  // NOTE: this project accompanies the Subclasses & Extends, Part 4 (Super calls) video

  // private IntegerSet testSet; - overrides testSet variable from abstract class -> methods declared in abstract class won't see it

  @Before
  public void setup(){
    testSet = new HighVolumeIntegerSet();
  }

  @Test
  public void testInsertHighVolume(){
    for (int i=0; i<50000; i++){
      testSet.insert(i);
      assertTrue(testSet.contains(i));
      assertEquals(testSet.size(), i+1);
    }
  }
}
