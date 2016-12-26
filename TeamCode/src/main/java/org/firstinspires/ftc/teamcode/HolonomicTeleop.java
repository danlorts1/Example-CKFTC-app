package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by rstudent on 12/25/2016.
 */

@TeleOp(name = "Holonomic")
public class HolonomicTeleop extends OpMode {
    MecanumDrivebase b;
    DcMotor m;

    @Override
    public void init() {
        b=new MecanumDrivebase(hardwareMap);
        m=hardwareMap.dcMotor.get("m5");


    }
    @Override
    public void loop() {
        b.driveHolonomic(gamepad1.left_stick_x, -gamepad1.left_stick_y, gamepad1.right_stick_x);
        m.setPower(gamepad1.right_trigger);
    }
}
