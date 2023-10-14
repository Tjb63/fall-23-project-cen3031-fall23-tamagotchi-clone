/**
 * 
 */

public class Status {
  /**
   * Name of status.
   */
  private String statusName;
  /**
   * Status's current value.
   * 
   */
  private int value;

  /**
   * Default constructor. Fills fields with default values.
   * 
   */
  public Status() {
    setStatusName("Unnamed Status");
    setValue(0);
  }

  /**
   * Pameterized constructor. Sets status name to given string. Sets status value
   * to 0.
   * 
   * @param statusName Name of status.
   */
  public Status(String statusName) {
    setStatusName(statusName);
    setValue(0);
  }

  /**
   * Pameterized constructor. Sets status fields to given values.
   * 
   * @param statusName Name of Status.
   * @param value      Status's value.
   */
  public Status(String statusName, int value) {
    setStatusName(statusName);
    setValue(value);
  }

  /**
   * Getter of status name.
   * 
   * @return String representation of status name.
   */
  public String getStatusName() {
    return statusName;
  }

  /**
   * Setter of status name.
   * 
   * @param statusName Name of status.
   */
  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }

  /**
   * Getter of status value.
   * 
   * @return int representation of status's value.
   */
  public int getValue() {
    return value;
  }

  /**
   * Setter of status value.
   * 
   * @param value Status value.
   */
  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Status [statusName=" + statusName + ", value=" + value + "]";
  }

  
}
