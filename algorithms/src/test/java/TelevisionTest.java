import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TelevisionTest {

  @Test
  public void isOffByDefault() {
    Television tv = new Television();
    assertEquals(false, tv.isOn());
  }

  @Test
  public void canBeTurnedOn() {
    Television tv = new Television();
    tv.turnOn();
    assertEquals(true, tv.isOn());
  }

  @Test
  public void canBeTurnedOff() {
    Television tv = new Television();
    tv.turnOn();
    tv.turnOff();
    assertEquals(false, tv.isOn());
  }

}