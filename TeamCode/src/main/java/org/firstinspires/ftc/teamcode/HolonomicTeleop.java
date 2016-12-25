package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by rstudent on 12/25/2016.
 */

@TeleOp(name = "Holonomic")
public class HolonomicTeleop extends OpMode {
    MecanumDrivebase b;
    @Override
    public void init() {
        b=new MecanumDrivebase(hardwareMap);

    }
    @Override
    public void loop() {
        b.driveHolonomic(gamepad1.left_stick_x, -gamepad1.right_stick_y, gamepad1.right_stick_x);
    }
}
