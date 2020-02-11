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
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	public static WPI_VictorSPX ShooterMotor1;
	public static WPI_VictorSPX ShooterMotor2;
	public static WPI_VictorSPX GrabberMotor;
	public static WPI_VictorSPX HookMotor;

	public static Shooter shooter;
	public static Grabber grabber;
	public static Hook hook;

	public RobotMap(){
		//groups together all of the motors used in drive train and names it Drive

		ShooterMotor1 = new WPI_VictorSPX(24);
		ShooterMotor2 = new WPI_VictorSPX(52);
		GrabberMotor = new WPI_VictorSPX(84);
		HookMotor = new WPI_VictorSPX(93);
		//calls and labels all the motors used besides drive

		grabber = new Grabber();
		hook = new Hook();
		shooter = new Shooter();
		// Setup all subsystems
	}
	public static final int CHIMNEY_MOTOR = 74;

	public static final int CLIMBER_MOTOR = 89;

	public static final int RIGHT_FRONT_DRIVE = 8;
	public static final int RIGHT_BACK_DRIVE = 3;
	public static final int LEFT_FRONT_DRIVE = 2;
	public static final int LEFT_BACK_DRIVE = 1;

}
