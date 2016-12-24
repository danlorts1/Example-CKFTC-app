package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by rstudent on 12/24/2016.
 */

@Autonomous(name = "GoForward")
public class GoForward extends LinearOpMode {
    DcMotor leftRear, rightRear, leftFront, rightFront;

    @Override
    public void runOpMode() throws InterruptedException {
        leftRear=hardwareMap.dcMotor.get("lr");
        rightRear=hardwareMap.dcMotor.get("rr");
        leftFront=hardwareMap.dcMotor.get("lf");
        rightFront=hardwareMap.dcMotor.get("rf");
        leftRear.setDirection(DcMotorSimple.Direction.REVERSE);
        leftFront.setDirection(DcMotorSimple.Direction.REVERSE);
        rightFront.setDirection(DcMotorSimple.Direction.REVERSE);

        leftRear.setPower(1.0);
        leftFront.setPower(1.0);
        rightRear.setPower(1.0);
        rightFront.setPower(1.0);

        Thread.sleep(1000);


        leftRear.setPower(0.0);
        leftFront.setPower(0.0);
        rightRear.setPower(0.0);
        rightFront.setPower(0.0);

    }
}
