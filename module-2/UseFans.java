public class UseFans {
    
    
    // method for single fan
    public String fanSingle(Fan fanNew) {
        return "Fan state is " + fanNew.getState() + " Fan color is " + fanNew.getColor() + ", fan speed is " + fanNew.getSpeed()
            + " fan radius is " + fanNew.getRadius(); 
    }


    // method for multiples fans
    public void fanMultiple(Fan[] fanArray) {    
        int index = 0;
        for (Fan fan: fanArray) {
            System.out.println("Fan Instance " + index + ": " + fanSingle(fan));
            index++;
        }
    }
    
}