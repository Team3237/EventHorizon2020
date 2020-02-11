/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveWithJoysticks;




public class Drivetrain extends Subsystem {

  public static double powerMult = 1.0;

  DifferentialDrive robotDrive = RobotMap.drive;

  public void initDefaultCommand() {
      setDefaultCommand(new DriveWithJoysticks());
  }

  public void takeJoystickInputs(Joystick left, Joystick right) {
	robotDrive.tankDrive(left.getY() * powerMult, right.getY() * powerMult);
  }

  public void stop() {
    robotDrive.tankDrive(0, 0);
  }
}
