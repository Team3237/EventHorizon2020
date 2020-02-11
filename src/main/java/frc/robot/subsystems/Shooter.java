/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Shooter extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	WPI_VictorSPX shooterMotor1 = new WPI_VictorSPX(RobotMap.SHOOTER_MOTOR_1);
	WPI_VictorSPX shooterMotor2 = new WPI_VictorSPX(RobotMap.SHOOTER_MOTOR_2);

	private final static Shooter INSTANCE = new Shooter();

	private Shooter(){
		shooterMotor1.setInverted(false);

		shooterMotor2.setInverted(true);
		shooterMotor2.follow(shooterMotor1);
	}

	public static Shooter getInstance(){
		return INSTANCE;
	}

	@Override
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void go(){
		shooterMotor1.set(1);
	}

	public void stop(){
		shooterMotor1.set(0);
	}
}
