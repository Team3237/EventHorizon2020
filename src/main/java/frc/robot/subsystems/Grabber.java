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
public class Grabber extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	WPI_VictorSPX grabberMotor = new WPI_VictorSPX(RobotMap.GRABBER_MOTOR);

	private final static Grabber INSTANCE = new Grabber();

	private Grabber(){
		grabberMotor.setInverted(false);
	}

	public static Grabber getInstance(){
		return INSTANCE;
	}

	@Override
	public void initDefaultCommand() {

	}

	public void go(){
		grabberMotor.set(1);
	}

	public void stop(){
		grabberMotor.set(0);
	}
}
