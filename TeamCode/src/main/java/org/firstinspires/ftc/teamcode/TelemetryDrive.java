package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * Created by Liam on 4/8/2018.
 */

@TeleOp(name="DataDrive")
public class TelemetryDrive extends LinearOpMode {

    RobotHardware robot = new RobotHardware();

    @Override
    public void runOpMode() {

        robot.init(hardwareMap, this);

        robot.rightDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        robot.backRDrive.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        while(opModeIsActive()) {

            robot.manualDrive();
            robot.moveRobot();

            telemetry.addLine();

            telemetry.update();




        }

    }

}
