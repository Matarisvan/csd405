public class Fan {
    
    //Constants
    static final int STOPPED = 0;
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    //Fields
    private int speed;
    private boolean state;
    private int radius;
    String color;

    //Setter and Getter Methods
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int setSpeed) {
        speed = setSpeed;
    }
    public boolean getState(){
        return state;
    }
    public void setState(boolean setState) {
        state = setState;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int setRadius) {
        radius = setRadius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String setColor) {
        color = setColor;
    }

    //Constructors
    public Fan() {
        speed = STOPPED;
        state = false;
        radius = 6;
        color = "white";
    }

    public Fan(int fanSpeed, boolean fanState, int fanRadius, String fanColor) {
        speed = fanSpeed;
        state = fanState;
        radius = fanRadius;
        color = fanColor;
    }


}