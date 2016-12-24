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

    MecanumDrivebase base;

    @Override
    public void runOpMode() throws InterruptedException {
        base = new MecanumDrivebase(hardwareMap);

        base.driveTank(1, 1);

        Thread.sleep(1000);

        base.driveTank(0, 0);
    }
}
