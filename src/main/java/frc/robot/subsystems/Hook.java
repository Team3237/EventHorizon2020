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
public class Hook extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	WPI_VictorSPX hookMotor = new WPI_VictorSPX(RobotMap.HOOK_MOTOR);

	private final static Hook INSTANCE = new Hook();

	private Hook(){
		hookMotor.setInverted(false);
	}

	public static Hook getInstance(){
		return INSTANCE;
	}

	@Override
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void go(){
		hookMotor.set(1);
	}

	public void stop(){
		hookMotor.set(0);
	}

}
