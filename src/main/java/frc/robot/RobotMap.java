/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


import edu.wpi.first.wpilibj.drive.*;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import frc.robot.subsystems.Chassis;
import frc.robot.subsystems.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static final int CHIMNEY_MOTOR = 74;

	public static final int CLIMBER_MOTOR = 89;

	public static final int RIGHT_FRONT_DRIVE = 8;
	public static final int RIGHT_BACK_DRIVE = 3;
	public static final int LEFT_FRONT_DRIVE = 2;
	public static final int LEFT_BACK_DRIVE = 1;

	public static final int GRABBER_MOTOR = 84;

	public static final int HOOK_MOTOR = 93;

	public static final int SHOOTER_MOTOR_1 = 24;
	public static final int SHOOTER_MOTOR_2 = 52;

}
