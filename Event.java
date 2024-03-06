/**
 * Event
 */
public class Event {
    // declare privatly all variables
    private String eventName;
    private String eventDate;
    private String eventLocation;
    private float eventBudget;

    // constructor
    public Event(String eventName, String eventLocation, String eventDate, float eventBudget) {
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
        this.eventBudget = eventBudget;
    }

    // getter
    public String getEventName() {
        return eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public float getEventBudget() {
        return eventBudget;
    }

    // overide tostring function
    public String toString() {
        return "Task{" +
                "Event Name='" + eventName + '\'' +
                ", Due date=" + eventDate + '\'' +
                ", Event Localisation" + eventLocation + '\'' +
                ", Event eventBudget" + eventBudget + '\'' +
                '}';
    }
}