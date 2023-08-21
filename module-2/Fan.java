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
    private String color;

    //Setter and Getter Methods
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public boolean getState(){
        return state;
    }
    public void setState(boolean state) {
        this.state = state;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //No-Argument Constructor
    public Fan() {
        speed = STOPPED;
        state = false;
        radius = 6;
        color = "white";
    }

    //Argument Constructor
    public Fan(int speed, boolean state, int radius, String color) {
        setSpeed(speed);
        setState(state);
        setRadius(radius);
        setColor(color);
    }

    //toString Method
    public String fanDesc() {
        if (speed == STOPPED) {
            return "Fan is off";
        }
        if (speed == SLOW) {
            return "Fan is slow";
        }
        if (speed == MEDIUM) {
            return "Fan is medium";
        }
        if (speed == FAST) {
            return "Fan is fast";
        }
        return "Your fan is broken";  
    }

    // fan default print method
    public void fanPrint(){
        System.out.println(this.getSpeed());
        System.out.println(this.getState());
        System.out.println(this.getRadius());
        System.out.println(this.getColor());
        System.out.println(this.fanDesc() + "\n");
    }
}