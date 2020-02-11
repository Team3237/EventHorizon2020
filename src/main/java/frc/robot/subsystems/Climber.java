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
public class Climber extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	private final WPI_VictorSPX climberMotor = new WPI_VictorSPX(RobotMap.CLIMBER_MOTOR);

	private static final Climber INSTANCE = new Climber();

	private Climber() {
		climberMotor.setInverted(false);
	}

	public static Climber getInstance(){
		return INSTANCE;
	}

	@Override
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void go(){
		climberMotor.set(1);
	}

	public void stop(){
		climberMotor.set(0);
	}

}
