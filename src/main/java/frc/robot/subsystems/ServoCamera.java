package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
//import edu.wpi.first.wpilibj2.command.Command;

public class ServoCamera {
    final static int cameraServoId = 10;
    final static int verticalCameraServoId = 11;

    public static Servo cameraServoHorizontal = new Servo(cameraServoId);
    public static double cameraTurnRate = 0.5;

    public static Servo cameraServoVertical = new Servo(verticalCameraServoId);


    public void turnCameraRight(){
        cameraServoHorizontal.setSpeed(cameraTurnRate);
    }

    public void turnCameraLeft(){
        cameraServoHorizontal.setSpeed(-cameraTurnRate);
    }

    public void turnCameraUp(){
        cameraServoVertical.setSpeed(cameraTurnRate);
    }

    public void turnCameraDown(){
        cameraServoVertical.setSpeed(cameraTurnRate);
    }
}
