package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by rstudent on 12/24/2016.
 */

public class MecanumDrivebase {
    DcMotor leftRear, rightRear, leftFront, rightFront;

    public MecanumDrivebase(HardwareMap hardwareMap) {
        leftRear=hardwareMap.dcMotor.get("lr");
        rightRear=hardwareMap.dcMotor.get("rr");
        leftFront=hardwareMap.dcMotor.get("lf");
        rightFront=hardwareMap.dcMotor.get("rf");
        leftRear.setDirection(DcMotorSimple.Direction.REVERSE);
        leftFront.setDirection(DcMotorSimple.Direction.REVERSE);
        rightFront.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void setLeft(float power){
        leftRear.setPower(power);
        leftFront.setPower(power);
    }

    public void setRight(float power){
        rightRear.setPower(power);
        rightFront.setPower(power);
    }

    public void driveTank(float left, float right){
        setLeft(left);
        setRight(right);
    }

    public void driveHolonomic(float x, float y, float r){
        //TODO
    }
}
