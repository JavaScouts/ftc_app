package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * Created by Liam on 9/8/2018.
 */
@Disabled
@TeleOp(name="MecanumDRRIIIIVE")
public class ZMecanumDrive extends LinearOpMode {

    RobotHardware robot = new RobotHardware();

    @Override
    public void runOpMode() {

        robot.init(hardwareMap, this);

        waitForStart();

        while(opModeIsActive()) {

            //double left = gamepad1.left_stick_y;
            //double right =  gamepad1.right_stick_y;
            //robot.rightDrive.setPower(right);
            //robot.backRDrive.setPower(right);
            //robot.leftDrive.setPower(left);
            //robot.backLDrive.setPower(left);

            robot.manualDrive(1.0);
            robot.moveRobot();


        }

    }

}
