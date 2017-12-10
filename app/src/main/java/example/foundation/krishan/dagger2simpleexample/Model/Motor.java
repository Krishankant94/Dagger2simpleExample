package example.foundation.krishan.dagger2simpleexample.Model;

public class Motor {

    private int rpm;

    public Motor(){
        this.rpm = 5;
    }

    public int getRpm(){
        return rpm;
    }

    public void accelerate(int value){
        rpm = rpm + value;
    }

    public void brake(){
        rpm = 0;
    }
}