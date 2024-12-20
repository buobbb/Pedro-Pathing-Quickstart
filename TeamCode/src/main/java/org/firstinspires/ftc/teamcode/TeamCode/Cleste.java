package org.firstinspires.ftc.teamcode.TeamCode;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Cleste {

    Servo servo;
    public static double openPos = 0.8;
    public static double closePos = 0.5;
            ;
    public Cleste(HardwareMap map){
        servo = map.get(Servo.class, "s2");
    }

    public enum Stauts{
        OPEN, CLOSED
    }

    Stauts status = Stauts.CLOSED;

    public void toggle(){
        if(status == Stauts.OPEN){
            status = Stauts.CLOSED;
            servo.setPosition(closePos);
        }
        else{
            status = Stauts.OPEN;
            servo.setPosition(openPos);
        }
    }

    public void open(){
        status = Stauts.OPEN;
        servo.setPosition(openPos);
    }

    public void close(){
        status = Stauts.CLOSED;
        servo.setPosition(closePos);
    }

    public boolean isOpen(){
        if(status == Stauts.OPEN){
            return true;
        }
        else{
            return false;
        }
    }
}
