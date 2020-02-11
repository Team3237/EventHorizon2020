/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TeleopDrive;


public class Chassis extends Subsystem {

	//TODO: All I have to say for this class is "Thanks, I hate it" and "Sorry I re-wrote the whole thing" (I also re-did DriveWithJoysticks)

	private double powerMult = 1.0;

	private final WPI_VictorSPX rightFrontDrive = new WPI_VictorSPX(RobotMap.RIGHT_FRONT_DRIVE);
	private final WPI_VictorSPX rightBackDrive = new WPI_VictorSPX(RobotMap.RIGHT_BACK_DRIVE);
	private final WPI_VictorSPX leftFrontDrive = new WPI_VictorSPX(RobotMap.LEFT_FRONT_DRIVE);
	private final WPI_VictorSPX leftBackDrive = new WPI_VictorSPX(RobotMap.LEFT_BACK_DRIVE);

	private static final Chassis INSTANCE = new Chassis();

	private Chassis() {
		rightFrontDrive.setInverted(true);

		rightBackDrive.setInverted(true);
		rightBackDrive.follow(rightFrontDrive);

		leftFrontDrive.setInverted(false);

		leftBackDrive.setInverted(false);
		leftBackDrive.follow(leftFrontDrive);
	}

	public static Chassis getInstance(){
		return INSTANCE;
	}

	public void setPower(double left, double right){
		rightFrontDrive.set(ControlMode.PercentOutput, right * powerMult);
		leftFrontDrive.set(ControlMode.PercentOutput, left * powerMult);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TeleopDrive());
	}
}
